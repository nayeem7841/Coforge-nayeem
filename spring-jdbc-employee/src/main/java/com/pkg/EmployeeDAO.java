package com.pkg;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO
{
	//data sorce implementation
	public void setDataSoruce(DataSource ds);
      //create emp 
	public void createEmployee(int emp_id,String emp_name,int emp_age,String eduction);
	
	//delete emp
	public void deleteEmployee(int emp_id);
	
	public Employee viewEmployeeRecodById(Integer id);
	
	//list of employee
	public List<Employee> listAllEmployee();
	
	//update database
	public void upDate(int emp_id,String emp_name,int emp_age,String eduction);
	
}
