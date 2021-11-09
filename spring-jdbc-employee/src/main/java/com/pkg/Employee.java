package com.pkg;

public class Employee 
{
   private int emp_id;
   private String emp_name;
   private int emp_age;
   private String educution;
   public int getEmp_id() 
  {
	  return emp_id;
  }
   public void setEmp_id(int emp_id) 
   {
	this.emp_id = emp_id;
     }
  public String getEmp_name() 
  {
	return emp_name;
  }
   public String getEducution()
   {
	 return educution;
   }
   public void setEducution(String educution)
   {
	  this.educution = educution;
    }
public void setEmp_name(String emp_name)
   {
	  this.emp_name = emp_name;
    }
    public int getEmp_age()
    {
	   return emp_age;
    }
    public void setEmp_age(int emp_age)
    {
	  this.emp_age = emp_age;
    }
}
