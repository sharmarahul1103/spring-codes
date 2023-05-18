package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String name;
	private String course;
	private int rollno;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(int id, String name, String course, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.rollno = rollno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", rollno=" + rollno + "]";
	}
	

}
