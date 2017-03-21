package com.music.info;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by hc on 2017/3/20.
 */

public class FolderInfo implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public static Creator<FolderInfo> CREATOR = new Creator<FolderInfo>() {

        @Override
        public FolderInfo createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public FolderInfo[] newArray(int i) {
            return new FolderInfo[0];
        }
    };
}
