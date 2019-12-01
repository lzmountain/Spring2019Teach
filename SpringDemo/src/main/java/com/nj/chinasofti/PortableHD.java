package com.nj.chinasofti;

public class PortableHD extends USBStorage {
    @Override
    public void writeData() {
        System.out.println("向移动硬盘中写入数据...");
    }
}
