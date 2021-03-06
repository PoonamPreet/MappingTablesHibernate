package com.practice.MappingTables;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student_Laptop")
public class Student {
@Id
private int rollno;
private String name;
private int marks;
@ManyToMany(mappedBy="Student")
private List<Laptop> laptop=new ArrayList<Laptop>();
public List<Laptop> getLaptop() {
	return laptop;
}
public void setLaptop(List<Laptop> laptop) {
	this.laptop = laptop;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}

}
