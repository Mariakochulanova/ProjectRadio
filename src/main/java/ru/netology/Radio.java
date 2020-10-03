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

    public int setFirstFmStation(int firstFmStation) {
        this.firstFmStation = 0;
        return firstFmStation;
    }

    public int getLastFmStation() {
        return lastFmStation;
    }

    public int setLastFmStation(int lastFmStation) {
        this.lastFmStation = 9;
        return lastFmStation;
    }

    public int getCurrentFmStation() {
        return currentFmStation;
    }

    public int setCurrentFmStation(int currentFmStation) {
        this.currentFmStation = currentFmStation;
        return currentFmStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int setMinVolume(int minVolume) {
        this.minVolume = 0;
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int setMaxVolume(int maxVolume) {
        this.maxVolume = 10;
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;

        return currentVolume;
    }

    public int nextFmStation() {

        if (currentFmStation < lastFmStation) {
            currentFmStation = currentFmStation + 1;
        }
        if (currentFmStation + 1 > lastFmStation) {
            currentFmStation = firstFmStation;
        }
            if (currentFmStation == lastFmStation) {
            currentFmStation = lastFmStation;
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
