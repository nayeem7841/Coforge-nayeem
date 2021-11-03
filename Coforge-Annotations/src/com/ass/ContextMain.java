package com.ass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextMain {

	public static void main(String[] args)
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

		Message mes = (Message) context.getBean("myappbean");

		mes.show();
    }
}