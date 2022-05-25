package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setStationPositive() {
        Radio radio = new Radio();
        radio.setStation(5);
        int expected = 5;
        Assertions.assertEquals(expected, radio.getStation());
    }

    @Test
    public void setStationNegativeTooHigh() {
        Radio radio = new Radio();
        radio.setStation(15);
        int expected = 4;
        Assertions.assertEquals(expected, radio.getStation());
    }

    @Test
    public void setStationNegativeTooLow() {
        Radio radio = new Radio();
        radio.setStation(-1);
        int expected = 4;
        Assertions.assertEquals(expected, radio.getStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.next();
        int expected = 5;
        Assertions.assertEquals(expected, radio.getStation());
    }

    @Test
    public void nextStationLoop() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setStation(2);
        radio.prev();
        int expected = 1;
        Assertions.assertEquals(expected, radio.getStation());
    }

    @Test
    public void prevStationLoop() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getStation());
    }

    @Test
    public void increaseVolumePositive() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    public void increaseVolumeNegative() {
        Radio radio = new Radio();
        for (int i = 0; i < 6; i++) {
            radio.increaseVolume();
        }
        int expected = 10;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    public void decreaseVolumeNegative() {
        Radio radio = new Radio();
        for (int i = 0; i < 6; i++) {
            radio.decreaseVolume();
        }
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    public void decreaseVolumePositive() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getVolume());
    }
}
