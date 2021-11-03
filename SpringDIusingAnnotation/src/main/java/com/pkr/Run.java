package com.pkr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
		
		Message mess=context.getBean("setterbasedapp",Message.class);
		
		mess.show();
		
		
		context.close();
		

	}

}
