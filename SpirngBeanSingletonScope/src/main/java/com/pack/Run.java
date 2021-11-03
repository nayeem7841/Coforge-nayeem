package com.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		//create object for the app.xml
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
		
		//for the message A function
           Message messageA=context.getBean("messageservice",Message.class);
           
           //for the message B function
           Message messageB=context.getBean("messageservice",Message.class);
           
           
           //setting the value for the message
           messageA.setMessage("Message of A");
           //setMessage
           System.out.println(" from A  -->        "+messageA.getMessage());
   		
   		
   		
   		       System.out.println(" from B -->    "+messageB. getMessage());
           
           


	}

}
