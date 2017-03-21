package com.music.info;

import android.database.AbstractCursor;

/**
 * Created by hc on 2017/3/20.
 */

public class NowPlayingCursor extends AbstractCursor {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public String[] getColumnNames() {
        return new String[0];
    }

    @Override
    public String getString(int i) {
        return null;
    }

    @Override
    public short getShort(int i) {
        return 0;
    }

    @Override
    public int getInt(int i) {
        return 0;
    }

    @Override
    public long getLong(int i) {
        return 0;
    }

    @Override
    public float getFloat(int i) {
        return 0;
    }

    @Override
    public double getDouble(int i) {
        return 0;
    }

    @Override
    public boolean isNull(int i) {
        return false;
    }
}
