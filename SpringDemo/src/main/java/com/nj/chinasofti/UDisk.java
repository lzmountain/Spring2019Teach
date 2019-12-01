package com.nj.chinasofti;

public class UDisk extends USBStorage {
    @Override
    public void writeData() {
        System.out.println("向U盘中写入数据...");
    }
}
