package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void nextFmStation1() {
        Radio radio = new Radio(2, 7
        );
        radio.setCurrentFmStation(6);
        int expected = 7;
        assertEquals(expected , radio.nextFmStation());
        System.out.println(expected);
    }

    @Test
    void nextFmStation2 () {
        Radio radio = new Radio(0, 9
        );
        radio.setCurrentFmStation(9);
        int expected = 0;
        assertEquals(expected , radio.nextFmStation());
        System.out.println(expected);
    }

    @Test
    void prevFmStation1 () {
        Radio radio = new Radio(0, 9);
        radio.setCurrentFmStation(1);
        int expected = 0;
        assertEquals(expected, radio.prevFmStation());
        System.out.println(expected);
    }

    @Test
    void prevFmStation2 () {
        Radio radio = new Radio(1, 8);
        radio.setCurrentFmStation(1);
        int expected = 8;
        assertEquals(expected, radio.prevFmStation());
        System.out.println(expected);
    }

    @Test
    void increaseVolume1 () {
        Radio radio = new Radio(0, 100, 99);
        int expected = 100;
        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }

    @Test
    void increaseVolume2 () {
        Radio radio = new Radio(0, 90, 90);
        int expected = 90;
        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }

    @Test
    void decreaseVolume1 () {
        Radio radio = new Radio(0, 100, 55);
        int expected = 54;
        assertEquals(expected, radio.decreaseVolume());
        System.out.println(expected);
    }

    @Test
    void decreaseVolume2 () {
        Radio radio = new Radio(0, 100, 0);
        int expected = 0;
        assertEquals(expected, radio.decreaseVolume());
        System.out.println(expected);
    }
}