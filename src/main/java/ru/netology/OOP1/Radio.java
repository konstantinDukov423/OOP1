package ru.netology.OOP1;

import java.util.spi.AbstractResourceBundleProvider;

public class Radio {
    private int numbRadio; // Номер радио от 0 до 9
    private int volumeRadio; // Громкость радио от 0 до 10

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
        if (numbRadio > 9) {
            numbRadio = 0;
        }

        setNumbRadio(next);
    }

    public void prevNumbRadio() {
        int prev = numbRadio -= 1;
        if (numbRadio < 0) {
            numbRadio = 9;
        }
        setNumbRadio(prev);
    }


    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setVolumeRadio(int newVolumeRadio) {
        if (newVolumeRadio > 10 || newVolumeRadio < 0) {
            return;
        }
        volumeRadio = newVolumeRadio;
    }

    public void setMaxVolumeRadio() {
        volumeRadio = 10;
    }

    public void plusVolumeRadio() {
        int plus = volumeRadio += 1;
        if (volumeRadio >= 10) {
            volumeRadio = 10;
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


