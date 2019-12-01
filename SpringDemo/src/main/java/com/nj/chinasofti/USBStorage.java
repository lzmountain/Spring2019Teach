package com.nj.chinasofti;

public abstract class USBStorage {
    private String volumeLabel;

    public String getVolumeLabel() {
        return volumeLabel;
    }

    public void setVolumeLabel(String volumeLabel) {
        this.volumeLabel = volumeLabel;
    }
    public abstract void writeData();
}
