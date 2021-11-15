package com.pck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("app.xml");
		
		Product pdc=con.getBean("product",Product.class);
		
		pdc.total_product();
		System.out.println(pdc.getName());
		pdc.getMyfunc().product();


	}

}
