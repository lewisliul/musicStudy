package com.util.download;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.webkit.MimeTypeMap;

import java.io.File;

/**
 * Android快速实现文件下载 2017/4/12.
 * //创建下载任务,downloadUrl就是下载链接
 DownloadManager.Request request = new DownloadManager.Request(Uri.parse(downloadUrl));
 //指定下载路径和下载文件名
 request.setDestinationInExternalPublicDir("/download/", fileName);
 //获取下载管理器
 DownloadManager downloadManager= (DownloadManager) mContext.getSystemService(Context.DOWNLOAD_SERVICE);
 //将下载任务加入下载队列，否则不会进行下载
 downloadManager.enqueue(request);
 */

public class QuickDownLoad {
    private static final String TAG = "QuickDownLoad";
    
    private Context mContext;
    private long mTaskId;
    private DownloadManager downloadManager;
    private String downloadPath;
    private String mVersionName;

    public QuickDownLoad(Context context) {
        mContext = context;
    }

    //使用系统下载器下载
    private void downLoadApk(String Url, String versionName) {
        mVersionName = versionName;
        ////创建下载任务
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(Url));

        request.setAllowedOverRoaming(false);//漫游网络是否可以下载
        //设置文件类型，可以在下载结束后自动打开该文件
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        String mimeString = mimeTypeMap.getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Url));
        request.setMimeType(mimeString);
        //在通知栏中显示，默认就是显示的
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        request.setVisibleInDownloadsUi(true);

        //sdcard的目录下的download文件夹，必须设置
        request.setDestinationInExternalPublicDir("/download/", versionName);
        //request.setDestinationInExternalFilesDir(),也可以自己制定下载路径

        //将下载请求加入下载队列
        downloadManager = (DownloadManager) mContext.getSystemService(Context.DOWNLOAD_SERVICE);
        //加入下载队列后会给该任务返回一个long型的id，
        //通过该id可以取消任务，重启任务等等，看上面源码中框起来的方法
        mTaskId = downloadManager.enqueue(request);

        //注册广播接收者，监听下载状态
        mContext.registerReceiver(receiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));

    }

    //广播接受者，接收下载状态
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            checkDownloadStatus();//检查下载状态
        }
    };

    //检查下载状态
    private void checkDownloadStatus() {
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(mTaskId);//筛选下载任务，传入任务ID，可变参数
        Cursor c = downloadManager.query(query);
        if (c.moveToFirst()) {
            int status = c.getInt(c.getColumnIndex(DownloadManager.COLUMN_STATUS));
            switch (status) {
                case DownloadManager.STATUS_PAUSED:
                    Log.d(TAG,">>>下载暂停");
                case DownloadManager.STATUS_PENDING:
                    Log.d(TAG,">>>下载延迟");
                case DownloadManager.STATUS_RUNNING:
                    Log.d(TAG,">>>正在下载");
                    break;
                case DownloadManager.STATUS_SUCCESSFUL:
                    Log.d(TAG,">>>下载完成");
                    //下载完成安装APK
                    downloadPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + File.separator + mVersionName;
                    installAPK(new File(downloadPath));
                    break;
                case DownloadManager.STATUS_FAILED:
                    Log.d(TAG,">>>下载失败");
                    break;
            }
        }
    }

    //下载到本地后执行安装
    protected void installAPK(File file) {
        if (!file.exists()) return;
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("file://" + file.toString());
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        //在服务中开启activity必须设置flag,后面解释
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
    }

    /**
     * 1.虽然下载什么的不需要自己操心了，但是建议还是将整个上面四段代码放在Service中执行，因为放在Activity中时，当用户按home键后，即使下载完了，也不会弹出安装界面
     2.建议使用startService的方式启动Service，这样不会与Activity生命周期绑定，保证下载完后能顺利安装。
     3.Service使用完后要及时地停掉！
     */
}
