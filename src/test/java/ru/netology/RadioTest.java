package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void nextFmStation1() {
        Radio radio = new Radio(1, 1, 10, 8, 0, 100, 0, true
        );
        radio.setCurrentFmStation(9);
        int expected = 10;
        assertEquals(expected , radio.nextFmStation());
        System.out.println(expected);
    }
    @Test
    void nextFmStation2 () {
        Radio radio = new Radio(1, 1, 10, 8, 0, 100, 0, true
        );
        radio.setCurrentFmStation(10);
        int expected = 1;
        assertEquals(expected , radio.nextFmStation());
        System.out.println(expected);
    }

    @Test
    void prevFmStation1 () {
        Radio radio = new Radio(1, 1, 10, 8, 0, 100, 0, true
        );
        radio.setCurrentFmStation(2);
        int expected = 1;
        assertEquals(expected, radio.prevFmStation());
        System.out.println(expected);
    }

    @Test
    void prevFmStation2 () {
        Radio radio = new Radio(1, 1, 10, 8, 0, 100, 0, true
        );
        radio.setCurrentFmStation(1);
        int expected = 10;
        assertEquals(expected, radio.prevFmStation());
        System.out.println(expected);
    }

    @Test
    void increaseVolume1 () {
        Radio radio = new Radio(1, 1, 10, 8,
                0, 100,
                50, true);
        int expected = 51;
        assertEquals(expected, radio.increaseVolume());
        System.out.println(expected);
    }

        @Test
        void increaseVolume2 () {
            Radio radio = new Radio(1, 1, 10, 8,
                    0, 100,
                    100, true);
            int expected = 100;
            assertEquals(expected, radio.increaseVolume());
            System.out.println(expected);
        }

        @Test
        void decreaseVolume1 () {
            Radio radio = new Radio(1, 1, 10, 8,
                    0, 100,
                    55, true);
            int expected = 54;
            assertEquals(expected, radio.decreaseVolume());
            System.out.println(expected);
        }

        @Test
        void decreaseVolume2 () {
            Radio radio = new Radio(1, 1, 10, 8,
                    0, 100,
                    0, true);
            int expected = 0;
            assertEquals(expected, radio.decreaseVolume());
            System.out.println(expected);
        }
}
