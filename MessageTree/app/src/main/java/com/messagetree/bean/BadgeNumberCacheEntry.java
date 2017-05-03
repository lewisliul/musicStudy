package com.messagetree.bean;

/**
 * 表示缓存项的内部类。
 * 一般它表示一个类型区间对应的badge number总数；
 * 也可以表示特定的一个类型对应的badge number，这时typeMin==typeMax且displayMode==-1
 */

public class BadgeNumberCacheEntry {

    private int category;
    private int typeMin;
    private int typeMax;
    private int count; //缓存的badge number总数
    private int displayMode;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getTypeMin() {
        return typeMin;
    }

    public void setTypeMin(int typeMin) {
        this.typeMin = typeMin;
    }

    public int getTypeMax() {
        return typeMax;
    }

    public void setTypeMax(int typeMax) {
        this.typeMax = typeMax;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(int displayMode) {
        this.displayMode = displayMode;
    }
}
