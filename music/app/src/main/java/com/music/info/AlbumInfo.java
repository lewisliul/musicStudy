package com.music.info;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by hc on 2017/3/20.
 */

public class AlbumInfo implements Parcelable {

    public static final String KEY_ALBUM_NAME = "album_name";
    public static final String KEY_ALBUM_ID = "album_id";
    public static final String KEY_NUMBER_OF_SONGS = "number_of_songs";
    public static final String KEY_ALBUM_ART = "album_art";
    public static final String KEY_ALBUM_ARTIST = "album_artist";

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public static final Creator<AlbumInfo> CREATOR = new Creator<AlbumInfo>() {

        @Override
        public AlbumInfo createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public AlbumInfo[] newArray(int i) {
            return new AlbumInfo[0];
        }
    };
}
