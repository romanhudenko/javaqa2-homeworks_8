package ru.netology.radio;

public class Radio {
    private int maxStation;
    private final int minStation = 0;

    private final int maxVolume = 100;
    private int station = 4;
    private int volume = 50;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int maxStationsCount) {
        maxStation = maxStationsCount - 1;
    }

    public int getStation() {
        return station + 1;
    }

    public void setStation(int value) {
        int newStation = value - 1;
        if (newStation < minStation) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        station = newStation;
    }

    public int getStationsCount() {
        return maxStation + 1;
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
        if (volume < maxVolume) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
