package com.nj.chinasofti.initdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyXML {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        InitAndDestroy initAndDestroy = (InitAndDestroy) context.getBean("initAndDestroy");
        System.out.println(initAndDestroy.getValue());
        ((ClassPathXmlApplicationContext) context).close();
    }
}
