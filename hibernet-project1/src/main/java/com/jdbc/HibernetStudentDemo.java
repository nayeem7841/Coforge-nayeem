package com.jdbc;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetStudentDemo {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
        Session se=sf.getCurrentSession();
        try {
        	Student student=new Student(23,"na","shaik","nayem.abc@gmail.com");
        	se.beginTransaction();
        	se.save(student);
        	se.getTransaction().commit();
        	
        }
        finally {
        	sf.close();
        }
	}

}
