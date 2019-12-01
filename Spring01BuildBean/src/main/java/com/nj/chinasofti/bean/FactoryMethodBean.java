package com.nj.chinasofti.bean;

public class FactoryMethodBean {
	
	public static FactoryMethodBean instanceFactory() {
		System.out.println("构建实例化对象");
		return new FactoryMethodBean();
	}
}
