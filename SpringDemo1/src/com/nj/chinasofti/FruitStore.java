package com.nj.chinasofti;

public class FruitStore {
    private Fruit fruit;

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
    public void dinner(){
        System.out.println(fruit.getName());
        fruit.eatFruit();
    }
}
