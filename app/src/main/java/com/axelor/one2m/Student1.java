package com.axelor.one2m;   

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Student1 {
	
	@Id
	private int Students_id;
	
	private String Students_name;
	
	@ManyToOne
    private School school;
	
	public int getStudents_id() {
		return Students_id;
	}

	public void setStudents_id(int students_id) {
		Students_id = students_id;
	}

	public String getStudents_name() {
		return Students_name;
	}

	public void setStudents_name(String students_name) {
		Students_name = students_name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}


	

}
