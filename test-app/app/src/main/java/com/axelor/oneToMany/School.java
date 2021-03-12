package com.axelor.oneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	@Column(name = "School")
	private int school_id;

	private String School_name;

	@OneToMany(mappedBy = "school")
	private List<Student1> students;

	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getSchool_name() {
		return School_name;
	}

	public void setSchool_name(String school_name) {
		School_name = school_name;
	}

	public List<Student1> getStudents() {
		return students;
	}

	public void setStudents(List<Student1> students) {
		this.students = students;
	}


}
