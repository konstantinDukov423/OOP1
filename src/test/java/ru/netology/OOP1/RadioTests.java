package ru.netology.OOP1;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RadioTests {

    @Test
    public void currentNumbRadioWithoutInstallation() {
        Radio radio = new Radio();

        Assertions.assertEquals(9, radio.getAmountRadioStations());
        Assertions.assertEquals(9, radio.getNumbRadio());
    }

    @Test
    public void currentNumbRadio() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(30, radio.getAmountRadioStations());
        Assertions.assertEquals(29, radio.getNumbRadio());
    }

    @Test
    public void currentNumbRadioSubZero() {
        Radio radio = new Radio();

        radio.setNumbRadio(-1);

        int expected = 9;
        int actual = radio.getNumbRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentNumbRadioMoreMaximum() {
        Radio radio = new Radio();

        radio.setNumbRadio(10);

        int expected = 9;
        int actual = radio.getNumbRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumbRadioTest() {
        Radio radio = new Radio();

        radio.setNumbRadio(5);

        radio.nextNumbRadio();

        int expected = 6;
        int actual = radio.getNumbRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumbRadioAfterMaxTest() {
        Radio radio = new Radio();

        radio.setNumbRadio(9);

        radio.nextNumbRadio();

        int expected = 0;
        int actual = radio.getNumbRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumbRadioTest() {
        Radio radio = new Radio();

        radio.setNumbRadio(5);

        radio.prevNumbRadio();

        int expected = 4;
        int actual = radio.getNumbRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumbRadioTestBelowZero() {
        Radio radio = new Radio();

        radio.setNumbRadio(0);

        radio.prevNumbRadio();

        int expected = 9;
        int actual = radio.getNumbRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Тесты на громкость радио
    public void setVolumeRadioTest() {
        Radio radio = new Radio();

        radio.setVolumeRadio(5);

        int expected = 5;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test //
    public void setMaxVolumeRadioTest() {
        Radio radio = new Radio();

        radio.setMaxVolumeRadio();

        int expected = 100;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeRadioOverMaxTest() {
        Radio radio = new Radio();

        radio.setVolumeRadio(101);

        int expected = 0;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeRadioTest() {
        Radio radio = new Radio();

        radio.setVolumeRadio(5);

        radio.plusVolumeRadio();

        int expected = 6;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolumeRadioAfterTenTest() {
        Radio radio = new Radio();

        radio.setVolumeRadio(100);

        radio.plusVolumeRadio();

        int expected = 100;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroVolumeRadioTest() {
        Radio radio = new Radio();

        radio.setVolumeRadio(5);

        radio.zeroVolumeRadio();

        int expected = 4;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeRadioBelowZeroTest() {
        Radio radio = new Radio();

        radio.setVolumeRadio(0);

        radio.zeroVolumeRadio();

        int expected = 0;
        int actual = radio.getVolumeRadio();
        Assertions.assertEquals(expected, actual);
    }

}

