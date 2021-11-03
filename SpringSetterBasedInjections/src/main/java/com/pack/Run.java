package com.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		//create an object for the app.xml file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
		
		//picking Message class bean for which we have assigned set message
		Message msg=context.getBean("setmessage",Message.class);
		
		//running the show function msg
		msg.show();
		
		//close the context function
       context.close();
	}

}
