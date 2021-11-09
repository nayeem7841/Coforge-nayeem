package com.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOimp implements EmployeeDAO {
	
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;

        public void setDataSoruce(DataSource ds) 
        {
		
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);

	
		
	}

	public void createEmployee(int employeeid, String employeeName, int employeeAge, String eduction) 
	{
		// TODO Auto-generated method stub
		
		String sql="insert into employee(employeeid,employeeName,employeeAge,eduction) values(?,?,?,?)";
		List<Object> inputs=new ArrayList<Object>();
		inputs.add(employeeid);
		inputs.add(employeeName);
		inputs.add(employeeAge);
		inputs.add(eduction);
		JdbcTemplateoobject.update(sql, inputs.toArray());
		
    	return;


	}

	public void deleteEmployee(int emp_id) 
	{
		//String employeeid;
		// TODO Auto-generated method stub
		String sql="delete employee where employeeId="+emp_id;
		
		JdbcTemplateoobject.execute(sql);

	}

	public Employee viewEmployeeRecodById(Integer emp_id)
	{
		String sql="select employeeid emp_id,employeeName emp_name,employeeAge emp_age,eduction educution from employee where employeeid"+emp_id;
		return (Employee)JdbcTemplateoobject.query(sql,BeanPropertyRowMapper.newInstance(Employee.class));
		
	}
	public List<Employee> listAllEmployee() 
	{
		// TODO Auto-generated method stub
    List<Employee> studentlist = new ArrayList<Employee>();
		 
		 String employeelistsql="select employeeid emp_id,employeeName emp_name,employeeAge emp_age,eduction educution from employee";
		 
		  // any of else can be used
	//	 studentlist = JdbcTemplateoobject.query(studentlistsql,new StudentJbdcRowMapper(Student.class));
		 
		 List<Employee> employeelist = JdbcTemplateoobject.query(employeelistsql,BeanPropertyRowMapper.newInstance(Employee.class));
		 
	
		return employeelist;
	}

	public void upDate(int emp_id, String emp_name, int emp_age, String eduction) 
	{
		// TODO Auto-generated method stu
		String udpdateEmployeerecord="UPDATE employee Set employeeid= ?, employeeAge = ?  where employeeid= ?";
		List<Object> temp=new ArrayList<Object>();
		temp.add(emp_id);
		temp.add(emp_age);
		temp.add(emp_id);
		JdbcTemplateoobject.update(udpdateEmployeerecord,temp.toArray());

	}

}
