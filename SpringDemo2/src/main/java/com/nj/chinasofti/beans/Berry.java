package com.nj.chinasofti.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Berry implements Fruit {
    @Value("黑莓")
    String name;
    @Override
    public void eat() {
        System.out.println("这个好吃，"+name);
    }
}
