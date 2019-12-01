package com.nj.chinasofti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Child {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("springContext.xml");
        FruitStore fruitStore = (FruitStore) context.getBean("fruitStore");
        System.out.println("fruitStore="+fruitStore);
        fruitStore.dinner();

    }
}
