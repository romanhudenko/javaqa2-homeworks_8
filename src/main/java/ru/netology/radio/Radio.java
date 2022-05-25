package ru.netology.radio;

public class Radio {
    private final int maxStation = 9;
    private final int minStation = 0;
    private int station = 4;
    private int volume = 5;

    public int getStation() {
        return station;
    }

    public void setStation(int value) {
        if (value < minStation) {
            return;
        }
        if (value > maxStation) {
            return;
        }
        station = value;
    }

    public void next() {
        station++;
        if (station > maxStation) {
            station = minStation;
        }
    }

    public void prev() {
        station--;
        if (station < minStation) {
            station = maxStation;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
