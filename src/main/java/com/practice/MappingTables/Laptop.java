package com.practice.MappingTables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Student> Student=new ArrayList<Student>();
	public List<Student> getStudent() {
		return Student;
	}
	public void setStudent(List<Student> student) {
		Student = student;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
