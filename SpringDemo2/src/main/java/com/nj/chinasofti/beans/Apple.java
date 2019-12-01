package com.nj.chinasofti.beans;

public class Apple implements Fruit {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    @Override
    public void eat() {
        System.out.println("吃水果,"+name);
    }
}
