package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Model.Student;

@Repository
public class Dao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void save(Student student)
	{
		hibernateTemplate.save(student);
		
	}
	
	@Transactional
	public List<Student> showAll()
	{
		List<Student> students=hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	@Transactional
	public void delete(int id)
	{
		Student s1=hibernateTemplate.load(Student.class,id);
		hibernateTemplate.delete(s1);
	}
	
	@Transactional
	public void update(Student student)
	{
		int id=student.getId();
		System.out.println(id);
		Student s1=hibernateTemplate.load(Student.class,id );
		System.out.println("student="+student);
		System.out.println("s1="+s1);
		s1.setName(student.getName());
		s1.setRollno(student.getRollno());
		s1.setCourse(student.getCourse());
		hibernateTemplate.update(s1);
		
		
	
	}
}
