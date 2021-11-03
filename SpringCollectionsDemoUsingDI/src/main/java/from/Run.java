package from;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run{

	public static void main(String[] args) {
		//creating an object for xml file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
		
		//taking the bean method of id="collection"
		Collection col=context.getBean("collectiondemo",Collection.class);
		
		//print the method in getAddressList from col
		System.out.println(col.getAddressList());
		//print the method in getAddressMap from col
		System.out.println(col.getAddressMap());
		
		context.close();

	}

}
