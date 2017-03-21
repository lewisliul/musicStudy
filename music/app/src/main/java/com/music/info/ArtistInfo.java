package com.music.info;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by hc on 2017/3/20.
 */

public class ArtistInfo implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public static final Creator<ArtistInfo> CREATOR = new Creator<ArtistInfo>() {

        @Override
        public ArtistInfo createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public ArtistInfo[] newArray(int i) {
            return new ArtistInfo[0];
        }
    };
}
