package ru.netology.radio.RadioHomeworkmvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationUp() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.next();
        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotExceedStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationDown() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prev();
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
        @Test
        public void ShouldNotExceedStationMin() {
            Radio radio = new Radio();
            radio.setCurrentStation(-1);

            int expected = 0;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotExceedVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotExceedVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
