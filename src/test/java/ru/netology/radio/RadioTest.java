package ru.netology.radio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
        //Следующая станция после №9
    void nextStationAfterMaxLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(9);
        myRadio.nextStation();
        int expected = 0;
        int actual = myRadio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
        // Играет станция №9, нажать дважды кнопку "следующая"
    void doubleNextStationAfterMaxLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(9);
        myRadio.nextStation();
        myRadio.nextStation();
        int expected = 1;
        int actual = myRadio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
        // Играет станция №0, нажать кнопку "предыдущая"
    void prevStationBeforeMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(0);
        myRadio.prevStation();
        int expected = 9;
        int actual = myRadio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        // Играет станция №0, нажать дважды кнопку "предыдущая"
    void doublePrevStationBeforeMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(0);
        myRadio.prevStation();
        myRadio.prevStation();
        int expected = 8;
        int actual = myRadio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        // Задан недопустимый номер станции по верхней границе
    void setStationMoreMaxLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(15);
        int expected = 0;
        int actual = myRadio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
        // Задан недопустимый номер станции по нижней границе
    void setStationLessMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setStation(-3);
        int expected = 0;
        int actual = myRadio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
        //Дважды нажать кнопку звука "+"
    void doublePlusIncreaseVolume() {
        Radio myRadio = new Radio();
        myRadio.setStation(0);
        myRadio.increaseVolume();
        myRadio.increaseVolume();
        int expected = 2;
        int actual = myRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
        //Действует максимальная громкость, нажать кнопку "+"
    void increaseVolumeMoreMaxLimit() {
        Radio myRadio = new Radio();
        myRadio.setVolume(10);
        myRadio.increaseVolume();
        int expected = 10;
        int actual = myRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //Действует минимальная громкость, нажать кнопку "-"
    void reduceVolumeLessMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setVolume(1);
        myRadio.reduceVolume();
        myRadio.reduceVolume();
        int expected = 0;
        int actual = myRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
        // Задан уровень звука выше предельного
    void setVolumeMoreMaxLimit() {
        Radio myRadio = new Radio();
        myRadio.setVolume(20);
        int expected = 0;
        int actual = myRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
        // Задан уровень звука выше предельного
    void setVolumeLessMinLimit() {
        Radio myRadio = new Radio();
        myRadio.setVolume(-20);
        int expected = 0;
        int actual = myRadio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}