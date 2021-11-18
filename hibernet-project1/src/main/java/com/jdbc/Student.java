package com.jdbc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	Student(int id,String firstname,String lastname,String email)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
	}
@Id
@Column(name="id")
private int id;

@Column(name="firstname")
private String firstname;

@Column(name="lastname")
private String lastname;

@Column(name="email")
private String email;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
