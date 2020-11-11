package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
Radio radio = new Radio (0,
        10,
        true);
    @Test
    void nextFmStation() {
        radio.setCurrentFmStation(5);
        int expected = radio.getCurrentFmStation() + 1;
        assertEquals(expected , radio.nextFmStation());
        System.out.println(expected);
    }

    @Test
    void testNextFmStation1() {
        radio.setCurrentFmStation(10);
        int expected = radio.getFirstFmStation();
        assertEquals(expected , radio.nextFmStation());
        System.out.println(expected);
    }

    @Test
    void prevFmStation() {
        radio.setCurrentFmStation(1);
        int expected = radio.getCurrentFmStation() - 1;
        assertEquals(expected, radio.prevFmStation());
        System.out.println(expected);

    }

    @Test
    void testPrevFmStation1() {
        radio.setCurrentFmStation(0);
        int expected = radio.getLastFmStation();
        assertEquals(expected, radio.prevFmStation());
        System.out.println(expected);
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(57);
        int expected = radio.getCurrentVolume() + 1;
        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }

    @Test
    void testIncreaseVolume1() {
        radio.setCurrentVolume(100);
        int expected = radio.getMaxVolume();
        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(5);
        int expected = radio.getCurrentVolume() - 1;
        assertEquals(expected, radio.decreaseVolume());
        System.out.println(expected);
    }

    @Test
    void testDecreaseVolume1() {
        radio.setCurrentVolume(0);
        int expected = radio.getMinVolume();
        assertEquals(expected, radio.decreaseVolume());
        System.out.println(expected);
    }
}