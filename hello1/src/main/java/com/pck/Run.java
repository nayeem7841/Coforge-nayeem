package com.pck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		//loading bean configration file 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
		
		//retrieve the class file from the configured file
	     Coach ch=context.getBean("Coach",Coach.class);
	     
	     //running the function context file
	     ch.getServices().fun();
	     //close the context
	     context.close();

	}

}
