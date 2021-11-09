package com.pkg;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		
        EmployeeDAOimp employeeIMPl = (EmployeeDAOimp)context.getBean("employeedao");
		
		System.out.println("recored creation..");
		employeeIMPl.createEmployee(10,"hello",25,"BTECH");
		employeeIMPl.createEmployee(60, "nayeem", 40, "Mtech");
		
	
		// creating student object
		
		Employee emp = new Employee();
		
		
		employeeIMPl.upDate(60,"nayeem",26,"mtech");
		
		
		/// retrive the list of students from DB
		employeeIMPl.deleteEmployee(60);
		List<Employee> listofemp = employeeIMPl.listAllEmployee();{
			
			for(Employee stud:listofemp) {
			
				String studentname=stud.getEmp_name();
				int age= stud.getEmp_age();
				
				System.out.println("employee  name "+studentname+"employee age "+age);
		
				
			}
		
		
			
		}
		
		System.out.println("done.......");

	}

}
