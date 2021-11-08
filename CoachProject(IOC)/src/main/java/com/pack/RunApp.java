package com.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

	public static void main(String[] args) {
		    //load the spring configration file
           ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
           
           //retreving the values from the bean contaniner
           
           Coach thecoach=context.getBean("BaseBall",BaseBall.class);
           
           System.out.println(thecoach.getDailyWorkOut());
           
           context.close();
           

	}

}
