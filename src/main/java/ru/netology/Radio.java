package ru.netology;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Radio {
    private int id = 1;
    private int firstFmStation = 0;
    private int lastFmStation = 9;
    private int currentFmStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private boolean on;

    public int getCurrentFmStation() {
        return currentFmStation;
    }

    public void setCurrentFmStation(int currentFmStation) {
        this.currentFmStation = currentFmStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
