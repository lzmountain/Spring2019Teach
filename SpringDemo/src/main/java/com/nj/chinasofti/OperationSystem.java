package com.nj.chinasofti;

public class OperationSystem {

    USBStorage usbStorage;

    public USBStorage getUsbStorage() {
        return usbStorage;
    }

    public void setUsbStorage(USBStorage usbStorage) {
        this.usbStorage = usbStorage;
    }
    public void saveFile(){
        System.out.println(usbStorage.getVolumeLabel());
        usbStorage.writeData();
    }
}
