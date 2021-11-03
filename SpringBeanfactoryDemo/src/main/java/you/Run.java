package you;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Run {

	public static void main(String[] args)
	{
		Resource resoures=new ClassPathResource("app.xml");
		BeanFactory context=new XmlBeanFactory(resoures);
		Message msg=context.getBean("me",Message.class);
		System.out.println(msg.getMessage());
	}

}
