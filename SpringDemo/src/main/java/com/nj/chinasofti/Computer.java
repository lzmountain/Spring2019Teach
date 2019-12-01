package com.nj.chinasofti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Computer {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        OperationSystem os = (OperationSystem) context.getBean("os");
        System.out.println("os="+os);
        os.saveFile();
    }
}
