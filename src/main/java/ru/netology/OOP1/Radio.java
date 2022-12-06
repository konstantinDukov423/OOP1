package ru.netology.OOP1;

import java.util.spi.AbstractResourceBundleProvider;

public class Radio {

    private int amountRadioStations = 10; // Колличество радиостанций, по умолчанию 10 станций.Нумерация начинается с 0
    private int numbRadio = amountRadioStations; // Номер текущей радиостанции. Если колличество радиостанций 10, то номер текущей будет 9
    private int volumeRadio; // Громкость радио от 0 до 100

    public Radio() {
        this.amountRadioStations = amountRadioStations - 1;
        this.numbRadio = amountRadioStations;
    }

    public Radio(int amountRadioStations) {
        this.amountRadioStations = amountRadioStations;
        this.numbRadio = amountRadioStations - 1;
    }

    public int getAmountRadioStations() {
        return amountRadioStations;
    }

    public int getNumbRadio() {
        return numbRadio;
    }

    public void setNumbRadio(int newNumbRadio) {
        if (newNumbRadio > 9) {
            return;
        }
        if (newNumbRadio < 0) {
            return;
        }
        numbRadio = newNumbRadio;
    }

    public void nextNumbRadio() {
        int next = numbRadio += 1;
        if (numbRadio >= amountRadioStations) {
            numbRadio = 0;
        }
        setNumbRadio(next);
    }

    public void prevNumbRadio() {
        int prev = numbRadio -= 1;
        if (numbRadio <= 0) {
            numbRadio = amountRadioStations;
        }
        setNumbRadio(prev);
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setVolumeRadio(int newVolumeRadio) {
        if (newVolumeRadio > 100 || newVolumeRadio < 0) {
            return;
        }
        volumeRadio = newVolumeRadio;
    }

    public void setMaxVolumeRadio() {
        volumeRadio = 100;
    }

    public void plusVolumeRadio() {
        int plus = volumeRadio += 1;
        if (volumeRadio >= 100) {
            volumeRadio = 100;
        }
        setVolumeRadio(plus);
    }

    public void zeroVolumeRadio() {
        int zero = volumeRadio -= 1;
        if (volumeRadio <= 0) {
            volumeRadio = 0;
        }
        setVolumeRadio(zero);
    }

}


