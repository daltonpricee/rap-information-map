package com.company;

public class State {
    private String stateName;
    private String artist1;
    private String artist2;
    private String artist3;
    private String info1;
    private String info2;
    private int maxLeft;
    private int maxRight;
    private int maxLow;
    private int maxHigh;

    public State(String stateName, String artist1, String artist2, String artist3,
        String info1, String info2, int maxLeft, int maxRight, int maxLow, int maxHigh) {
        this.stateName = stateName;
        this.artist1 = artist1;
        this.artist2 = artist2;
        this.artist3 = artist3;
        this.info1 = info1;
        this.info2 = info2;
        this.maxLeft = maxLeft;
        this.maxRight = maxRight;
        this.maxLow = maxLow;
        this.maxHigh = maxHigh;

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


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getArtist1() {
        return artist1;
    }

    public void setArtist1(String artist1) {
        this.artist1 = artist1;
    }

    public String getArtist2() {
        return artist2;
    }

    public void setArtist2(String artist2) {
        this.artist2 = artist2;
    }

    public String getArtist3() {
        return artist3;
    }

    public void setArtist3(String artist3) {
        this.artist3 = artist3;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String toString() {
        return artist1 + "\n"
                + artist2 + "\n"
                + artist3 + "\n";
    }

}
