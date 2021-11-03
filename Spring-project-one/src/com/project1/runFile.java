package com.project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runFile {

	public static void main(String[] args) {
		//create a xml file
		ClassPathXmlApplicationContext temp=new ClassPathXmlApplicationContext("app.xml");
		
		
		//open xml file in java
		HelloWorld test= temp.getBean("mybean",HelloWorld.class);
		//bean object method call
		test.Hello();
		//close the xml file
		temp.close();
	}

}
