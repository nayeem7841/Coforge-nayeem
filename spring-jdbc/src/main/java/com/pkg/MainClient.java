package com.pkg;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		
		StudentjDBCimpl studentJDBCImpl = (StudentjDBCimpl)context.getBean("studentdao");
		
		System.out.println("recored creation..");
		studentJDBCImpl.createStudent("ravi","100");
		studentJDBCImpl.createStudent("nadeem","26");
		
		
	
		// creating student object
		
		Student student = new Student();
		
		student.setId(6);//update the details on the bases of id
		student.setStudname("nayeem");
		student.setAge("26");
		
		studentJDBCImpl.updateStudentRecord(student);
		
		
		/// retrive the list of students from DB
		studentJDBCImpl.deleteStudentById(26);
		List<Student> listofstudents = studentJDBCImpl.listAllStudents();{
			
			for(Student stud:listofstudents) {
			
				String studentname=stud.getStudname();
				String age= stud.getAge();
				
				System.out.println(" student  name "+studentname+"student age "+age);
		
				
			}
		
		
			
		}
		
		System.out.println("done.......");

	}

}
