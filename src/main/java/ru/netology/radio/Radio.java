package ru.netology.radio;

public class Radio {
    private int stationsCount = 10;
    private int currentStation = 0;
    private int currentVolume = 0;

    public Radio() {
    }

    public Radio(
            int stationsCount
    ) {
        this.stationsCount = stationsCount;
    }


    public void nextStation() {
        if (currentStation == (stationsCount - 1)) {
            this.currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > (stationsCount - 1)) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
