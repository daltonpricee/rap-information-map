package com.company;

public class Points {

    private int maxRight;
    private int maxLeft;
    private int maxLow;
    private int maxHigh;

    public Points(int maxLeft, int maxRight, int maxLow, int maxHigh) {
        this.maxLeft = maxLeft;
        this.maxRight = maxRight;
        this.maxHigh = maxHigh;
        this.maxLow = maxLow;
    }

    public int getMaxLeft() {
        return maxLeft;
    }

    public void setMaxLeft(int maxLeft) {
        this.maxLeft = maxLeft;
    }

    public int getMaxRight() {
        return maxRight;
    }

    public void setMaxRight(int maxRight) {
        this.maxRight = maxRight;
    }

    public int getMaxLow() {
        return maxLow;
    }

    public void setMaxLow(int maxLow) {
        this.maxLow = maxLow;
    }

    public int getMaxHigh() {
        return maxHigh;
    }

    public void setMaxHigh(int maxHigh) {
        this.maxHigh = maxHigh;
    }
}
