package com.music.info;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by hc on 2017/3/20.
 */

public class MusicInfo implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public static final Creator<MusicInfo> CREATOR = new Creator<MusicInfo>() {

        @Override
        public MusicInfo createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public MusicInfo[] newArray(int i) {
            return new MusicInfo[0];
        }
    };
}
