package com.nj.chinasofti.test;

import com.nj.chinasofti.beans.Fruit;
import com.nj.chinasofti.events.WarnMsgEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenXMLConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Fruit apple = (Fruit) context.getBean("apple");
        System.out.println(apple);
        apple.eat();
        WarnMsgEvent event = new WarnMsgEvent(context,"系统管理员","数据库异常");
        context.publishEvent(event);
    }
}
