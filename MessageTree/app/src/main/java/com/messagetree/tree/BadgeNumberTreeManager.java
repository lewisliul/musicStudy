package com.messagetree.tree;

import android.os.Handler;
import android.os.Looper;

import com.messagetree.bean.BadgeNumberCacheEntry;
import com.messagetree.db.BadgeNumberDAO;
import com.messagetree.interf.AsyncResult;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 树型结构的badge number管理器.
 */

public class BadgeNumberTreeManager {

    private static final BadgeNumberTreeManager instance = new BadgeNumberTreeManager();
    private BadgeNumberTreeManager() {}
    private BadgeNumberDAO badgeNumberDAO = new BadgeNumberDAO();
    private List<BadgeNumberCacheEntry> badgeNumberCacheList = new LinkedList<BadgeNumberCacheEntry>();
    // 执行异步db操作使用的executor.
    ExecutorService dbAsyncExecutor = Executors.newSingleThreadExecutor();
    private Handler mainHandler = new Handler(Looper.getMainLooper());

    public static final BadgeNumberTreeManager getInstance() {
        return instance;
    }

    /**
     * 删除指定类型的badge number
     * @param type 指定的badge number类型.
     * @param asyncResult 异步返回结果, 会返回一个Boolean参数, 表示是否删除成功了
     */
    public void clearBadgeNumber(int type, AsyncResult<Boolean> asyncResult) {

    }

}
