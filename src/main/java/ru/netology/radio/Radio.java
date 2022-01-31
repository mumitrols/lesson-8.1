package ru.netology.radio;

public class Radio {
        private int currentStation;
        private int currentVolume;

        public void nextStation() {
            if (currentStation == 9) this.currentStation = 0;
            else currentStation = currentStation + 1;
        }

        public void prevStation() {
            if (currentStation == 0) currentStation = 9;
            else currentStation = currentStation - 1;
        }

        public void setStation(int currentStation) {
            if ( currentStation < 0 ) return;
            if ( currentStation >10 ) return;
            this.currentStation = currentStation;
        }

        public int getCurrentStation() {
            return currentStation;
        }

        public void setVolume(int currentVolume) {
            if ( currentVolume < 0 ) return;
            if ( currentVolume > 10) return;
            this.currentVolume = currentVolume;
        }

        public void increaseVolume() {
            if (currentVolume < 10) currentVolume = currentVolume + 1;
            else currentVolume = 10;
        }

        public void reduceVolume() {
            if (currentVolume > 0) currentVolume = currentVolume - 1;
            else currentVolume = 0;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }
}
