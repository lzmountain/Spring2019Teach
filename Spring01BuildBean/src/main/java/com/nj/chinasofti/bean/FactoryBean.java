package com.nj.chinasofti.bean;

public class FactoryBean {
	public FactoryProduct newFactory() {
		System.out.println("构建产品");
		return new FactoryProduct();
	}
}
