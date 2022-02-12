package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
        //На пульте выставлена станция с максимальным номером, перейти к следующей станции
    public void nextStationAfterMaxLimit() {
        Radio myRadio = new Radio(
                20
        );
        myRadio.setStation(19);
        myRadio.nextStation();
        assertEquals(0, myRadio.getCurrentStation());
    }

    @Test
        // На пульте выставлена станция с мксимальным номером, нажать дважды кнопку "следующая"
    void doubleNextStationAfterMaxLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(9);
        myRadio.nextStation();
        myRadio.nextStation();
        assertEquals(1, myRadio.getCurrentStation());

    }

    @Test
        // ИНа пульте выставлена станция №0, нажать кнопку "предыдущая"
    void prevStationBeforeMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(0);
        myRadio.prevStation();
        assertEquals(9, myRadio.getCurrentStation());
    }

    @Test
        // На пульте выставлена станция №0, нажать дважды кнопку "предыдущая"
    void doublePrevStationBeforeMinLimit() {
        Radio myRadio = new Radio(
                20
        );
        myRadio.setStation(0);
        myRadio.prevStation();
        myRadio.prevStation();
        assertEquals(18, myRadio.getCurrentStation());
    }

    @Test
        // Задан недопустимый номер станции по верхней границе
    void setStationMoreMaxLimit() {
        Radio myRadio = new Radio(
                20
        );
        myRadio.setStation(20);
        assertEquals(0, myRadio.getCurrentStation());
    }

    @Test
        // Задан недопустимый номер станции по нижней границе
    void setStationLessMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(-3);
        assertEquals(0, myRadio.getCurrentStation());
    }

    @Test
        //Дважды нажать кнопку звука "+"
    void doublePlusIncreaseVolume() {
        Radio myRadio = new Radio();
        myRadio.setStation(0);
        myRadio.increaseVolume();
        myRadio.increaseVolume();
        assertEquals(2, myRadio.getCurrentVolume());
    }

    @Test
        //Действует максимальная громкость, нажать кнопку "+"
    void increaseVolumeMoreMaxLimit() {
        Radio myRadio = new Radio();
        myRadio.setVolume(100);
        myRadio.increaseVolume();
        assertEquals(100, myRadio.getCurrentVolume());
    }

    @Test
        //Действует минимальная громкость, нажать кнопку "-"
    void reduceVolumeLessMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setVolume(1);
        myRadio.reduceVolume();
        myRadio.reduceVolume();
        assertEquals(0, myRadio.getCurrentVolume());
    }

    @Test
        // Задан уровень звука выше предельного
    void setVolumeMoreMaxLimit() {
        Radio myRadio = new Radio();
        myRadio.setVolume(200);
        assertEquals(0, myRadio.getCurrentVolume());
    }

    @Test
        // Задан уровень звука ниже предельного
    void setVolumeLessMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setVolume(-20);
        assertEquals(0, myRadio.getCurrentVolume());
    }
}