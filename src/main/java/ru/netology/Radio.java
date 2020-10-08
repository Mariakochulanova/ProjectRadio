package ru.netology;

public class Radio {
    private int firstFmStation;
    private int lastFmStation;
    private int currentFmStation;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;
    private boolean on;

    public int getFirstFmStation() {
        return firstFmStation;
    }

    public void setFirstFmStation(int firstFmStation) {
        this.firstFmStation = firstFmStation;
        return;
    }

    public int getLastFmStation() {
        return lastFmStation;
    }

    public void setLastFmStation(int lastFmStation) {
        this.lastFmStation = 9;
        return;
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

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
        return;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;

        return;
    }

    public int nextFmStation() {

        if (currentFmStation < lastFmStation) {
            currentFmStation = currentFmStation + 1;
        }
        if (currentFmStation + 1 > lastFmStation) {
            currentFmStation = firstFmStation;
        }
        return currentFmStation;
    }

    public int prevFmStation() {

        if (currentFmStation > firstFmStation) {
            currentFmStation = currentFmStation - 1;
        }
        if (currentFmStation - 1 < firstFmStation) {
            currentFmStation = lastFmStation;
        }
        return currentFmStation;
    }

    public int increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume + 1 > maxVolume) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume - 1 < minVolume) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }
}
