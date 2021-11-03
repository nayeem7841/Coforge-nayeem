package com.pac;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) 
	{
	   ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
	   
	   Message messagserivceA=context.getBean("messageservice",Message.class);
	   
	   Message messagserivceB=context.getBean("messageservice",Message.class);
	   
	   Message messagserivceC=context.getBean("messageservice",Message.class);
	   
	   messagserivceA.setMessage("nayeem");
	   
	   System.out.println("from person 1 "+messagserivceA.getMessage());
	   System.out.println("from person AAA "+messagserivceA.getMessage());
	   
         messagserivceA.setMessage("ram");
	   
	   System.out.println("from person 2 "+messagserivceB.getMessage());
	   System.out.println("from person BBB "+messagserivceB.getMessage());
	   
         messagserivceA.setMessage("Ramulu");
	   
	   System.out.println("from person 3 "+messagserivceC.getMessage());
	   System.out.println("from person CCC "+messagserivceC.getMessage());
	   
	}

}
