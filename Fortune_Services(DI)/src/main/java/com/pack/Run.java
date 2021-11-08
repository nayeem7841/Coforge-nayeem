package com.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
		
		HappyFortuneService Hfs=context.getBean("Service",HappyFortuneService.class);
		
		System.out.println(Hfs.ShowFortune());
		Hfs.show();
		System.out.println(Hfs.getMe());
		context.close();

	}

}
