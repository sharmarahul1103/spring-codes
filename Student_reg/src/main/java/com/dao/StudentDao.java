package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.Model.Student;

public interface StudentDao {
	
	
	
	public void AddStudent(Student student);
	public void deleteStudent(int id);
	public List<Student> showAll();
	public void updateStudent(Student student);

 }
