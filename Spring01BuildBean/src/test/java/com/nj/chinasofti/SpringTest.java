package com.nj.chinasofti;

import com.nj.chinasofti.bean.FactoryMethodBean;
import com.nj.chinasofti.bean.FactoryProduct;
import com.nj.chinasofti.bean.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		TestBean tb = (TestBean) ctx.getBean("testBean");
		System.out.println(tb);
		FactoryMethodBean fm = (FactoryMethodBean) ctx.getBean("factoryMethodBean");
		System.out.println(fm);
		FactoryProduct fp = (FactoryProduct) ctx.getBean("product");
		System.out.println(fp);
	}
}
