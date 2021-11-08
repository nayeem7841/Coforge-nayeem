package com.pkg;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentjDBCimpl implements StudentDAO {
	
	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;


	public void setDataSoruce(DataSource ds) {
		
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);

	
		
	}
      //api for create method
	//user deifined method and you have to write logic
	public void createStudent(String studname, String age) {
		
		String sql="insert  into stu(studentname,age) values(?,?)";
		List<String> inputs=new ArrayList<String>();
		inputs.add(studname);
		inputs.add(age);
		JdbcTemplateoobject.update(sql, inputs.toArray());
		
    	return;

		
	}


	public void deleteStudentById(Integer id1) {
		// TODO Auto-generated method stub
		String sql="delete stu where StudentId="+id1;

		JdbcTemplateoobject.execute(sql);
	}

	public Student viewStudentRecodById(Integer id) {
		String sql="select studentname studname,age age,StudentId id from stu";
		return (Student)JdbcTemplateoobject.query(sql,BeanPropertyRowMapper.newInstance(Student.class));
	}

	public List<Student> listAllStudents() {
		
		 List<Student> studentlist = new ArrayList<Student>();
		 
		 String studentlistsql="select studentname studname,age age,StudentId id from stu";
		 
		  // any of else can be used
	//	 studentlist = JdbcTemplateoobject.query(studentlistsql,new StudentJbdcRowMapper(Student.class));
		 
		 studentlist = JdbcTemplateoobject.query(studentlistsql,BeanPropertyRowMapper.newInstance(Student.class));
		 
	
		return studentlist;
	}

	   /// api for update
	
	public void updateStudentRecord(Student student) {
	String udpdatestudedntrecord="UPDATE stu SET studentname = ?, age= ?  where StudentId= ?"; 
		JdbcTemplateoobject.update(udpdatestudedntrecord, new Object[] {
			student.getStudname(),student.getAge() , Integer.valueOf(student.getId())
		});
	}



}