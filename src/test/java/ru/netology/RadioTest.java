package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextFmStation() {
        Radio radio = new Radio();

        int currentFmStation = radio.setCurrentFmStation(5);

        int lastFmStation = radio.setLastFmStation(9);

        int expected = currentFmStation + 1;

        assertEquals(expected , radio.nextFmStation());

        System.out.println(expected);
    }


    @Test
    void testNextFmStation1() {
        Radio radio = new Radio();

        int currentFmStation = radio.setCurrentFmStation(9);

        int lastFmStation = radio.setLastFmStation(9);

        int expected = radio.setFirstFmStation(0);

        assertEquals(expected , radio.nextFmStation());

        System.out.println(expected);
    }

    @Test
    void prevFmStation() {
        Radio radio = new Radio();

        int currentFmStation = radio.setCurrentFmStation(8);

        int firstFmStation = radio.setFirstFmStation(0);

        int expected = currentFmStation - 1;

        assertEquals(expected, radio.prevFmStation());

        System.out.println(expected);

    }

    @Test
    void testPrevFmStation() {
        Radio radio = new Radio();

        int currentFmStation = radio.setCurrentFmStation(0);

        int firstFmStation = radio.setFirstFmStation(0);

        int lastFmStation = radio.setLastFmStation(9);

        int expected = lastFmStation;

        assertEquals(expected, radio.prevFmStation());

        System.out.println(expected);
    }


    @Test
    void increaseVolume() {
        Radio radio = new Radio();

        int currentVolume = radio.setCurrentVolume(4);

        int maxVolume = radio.setMaxVolume(10);

        int expected = currentVolume + 1;

        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }


    @Test
    void testIncreaseVolume() {
        Radio radio = new Radio();

        int currentVolume = radio.setCurrentVolume(10);

        int maxVolume = radio.setMaxVolume(10);

        int expected = maxVolume;

        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }


    @Test
    void decreaseVolume() {
        Radio radio = new Radio();

        int currentVolume = radio.setCurrentVolume(4);

        int minVolume = radio.setMinVolume(0);

        int expected = currentVolume - 1;

        assertEquals(expected, radio.decreaseVolume());
        System.out.println(expected);
    }


    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();

        int currentVolume = radio.setCurrentVolume(0);

        int minVolume = radio.setMinVolume(0);

        int expected = minVolume;

        assertEquals(expected, radio.decreaseVolume());
        System.out.println(expected);
    }
}