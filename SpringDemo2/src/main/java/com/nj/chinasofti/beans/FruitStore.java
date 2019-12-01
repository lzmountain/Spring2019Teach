package com.nj.chinasofti.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("store")
public class FruitStore {
    //@Autowired
    @Resource
    Berry berry;

    public void sellBerry(){
        System.out.println("特价水果是:"+berry.name);
    }
}
