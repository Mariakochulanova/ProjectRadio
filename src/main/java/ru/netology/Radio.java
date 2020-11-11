package ru.netology;

public class Radio {
    private int id = 1;
    private int firstFmStation;
    private int lastFmStation;
    private int currentFmStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private boolean on;

    public Radio(int firstFmStation, int lastFmStation, boolean on) {
        this.firstFmStation = 0;
        this.lastFmStation = 10;
        this.on = on;
    }

    public int getFirstFmStation() {
        return firstFmStation;
    }


    public int getLastFmStation() {
        return lastFmStation;
    }

    public int getCurrentFmStation() {
        return currentFmStation;
    }

    public void setCurrentFmStation(int currentFmStation) {
        this.currentFmStation = currentFmStation;
        return;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int nextFmStation() {

        if (currentFmStation < lastFmStation) {
            currentFmStation = currentFmStation + 1;
        } else {
            currentFmStation = firstFmStation;
        }
        return currentFmStation;
    }

    public int prevFmStation() {

        if (currentFmStation > firstFmStation) {
            currentFmStation = currentFmStation - 1;
        } else {
            currentFmStation = lastFmStation;
        }
        return currentFmStation;
    }

    public int increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }
}
