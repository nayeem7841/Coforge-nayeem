package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
        
		Message msg= context.getBean("me",Message.class);
		System.out.println(msg.getName());
		context.close();
	}

}
