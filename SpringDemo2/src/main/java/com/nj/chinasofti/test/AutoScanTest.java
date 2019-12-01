package com.nj.chinasofti.test;

import com.nj.chinasofti.beans.Berry;
import com.nj.chinasofti.beans.FruitStore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.tools.java.ClassPath;

public class AutoScanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoScan.xml");
        Berry berry = (Berry) context.getBean("berry");
        berry.eat();
        FruitStore store = (FruitStore) context.getBean("store");
        store.sellBerry();
    }
}
