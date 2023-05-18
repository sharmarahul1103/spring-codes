package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Model.Student;

@Service
public class StudentDaoImpl implements StudentDao {
       
    @Autowired
    private Dao dao;

	@Override
	public void AddStudent(Student student) {
		// TODO Auto-generated method stub
		dao.save(student);
	
		
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public List<Student> showAll() {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<Student>();
		   students=dao.showAll();
		
		
		return students;
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
		dao.update(student);
		
	}
	
	
	

}
