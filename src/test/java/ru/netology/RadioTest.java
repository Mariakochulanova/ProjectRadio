package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextFmStation() {
        Radio radio = new Radio();
        radio.setCurrentFmStation(5);
        radio.setLastFmStation(9);
        int expected = radio.getCurrentFmStation() + 1;
        assertEquals(expected , radio.nextFmStation());
        System.out.println(expected);
    }

    @Test
    void testNextFmStation1() {
        Radio radio = new Radio();
        radio.setCurrentFmStation(9);
        radio.setFirstFmStation(0);
        int expected = radio.getFirstFmStation();
        assertEquals(expected , radio.nextFmStation());
        System.out.println(expected);
    }

    @Test
    void prevFmStation() {
        Radio radio = new Radio();
        radio.setCurrentFmStation(2);
        radio.setFirstFmStation(0);
        int expected = radio.getCurrentFmStation() - 1;
        assertEquals(expected, radio.prevFmStation());
        System.out.println(expected);

    }

    @Test
    void testPrevFmStation() {
        Radio radio = new Radio();
        radio.setCurrentFmStation(0);
        radio.setFirstFmStation(0);
        radio.setLastFmStation(9);
        int expected = radio.getLastFmStation();
        assertEquals(expected, radio.prevFmStation());
        System.out.println(expected);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setMaxVolume(10);
        int expected = radio.getCurrentVolume() + 1;
        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }

    @Test
    void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setMaxVolume(10);
        int expected = radio.getMaxVolume();
        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setMinVolume(0);
        int expected = radio.getCurrentVolume() - 1;
        assertEquals(expected, radio.decreaseVolume());
        System.out.println(expected);
    }

    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinVolume(0);
        int expected = radio.getMinVolume();
        assertEquals(expected, radio.decreaseVolume());
        System.out.println(expected);
    }
}