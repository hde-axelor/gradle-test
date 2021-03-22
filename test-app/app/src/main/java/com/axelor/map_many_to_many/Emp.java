package com.axelor.map_many_to_many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {

	@Id
	private int emp_id;
	@Column(name = "Employee_Name")
	private String emp_name;
	

	@ManyToMany
	private List<Project> projects;

	public int getEmp_id() {
		return emp_id;
	}
	
	

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
