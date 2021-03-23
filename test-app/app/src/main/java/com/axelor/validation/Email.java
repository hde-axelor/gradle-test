package com.axelor.validation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Email {
	
	@Id
	private int id;
	
	@Column(unique = true)
	private String email;
	
	@Override
	public String toString() {
		return "Email [id=" + id + ", email=" + email + ", emp=" + emp + "]";
	}
	@ManyToOne
	private Employee emp;
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
