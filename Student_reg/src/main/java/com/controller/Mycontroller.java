package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.Model.Student;
import com.dao.Dao;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

@Controller
public class Mycontroller {
	
	@Autowired
private	StudentDaoImpl st;
	
	@RequestMapping("/admin")
	public String Admin()
	{
		return "admin";
	}
	
	@RequestMapping("/registration")
	public String registration()
	{ 
		return "registration";
	}
	
	@RequestMapping("/deletePage")
	public String deletePage()
	{
		return "delete";
	}
	
	@RequestMapping("/updatePage")
	public String updatePage()
	{
		return "update";
	}
	
	@RequestMapping("/updateForm")
	public String updateForm()
	{
		return "updateForm";
	}
	
	@RequestMapping(value="/deleteHandler",method = RequestMethod.POST)
	public String deleteHandler(@RequestParam(name="id") int id)
	{
		st.deleteStudent(id);
		
		return "welcome";
		
		
	}
	

	@RequestMapping(value="/updateHandler",method = RequestMethod.POST)
	public String updateHandler(@ModelAttribute Student student)
	{
		st.updateStudent(student);
		
		return "welcome";
		
		
	}
	
	
	@RequestMapping(value="/reg", method = RequestMethod.POST)
	public RedirectView regHandler(@ModelAttribute Student student,HttpServletRequest req)
	{
		System.out.println(student);
		st.AddStudent(student);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(req.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping(value="/viewhandler", method=RequestMethod.GET)
	public String viewHandler(Model m,HttpServletRequest req)
	{
		ArrayList<Student> students=new ArrayList<Student>();
		students=(ArrayList<Student>) st.showAll();
		System.out.println(students);
		m.addAttribute("students", students);
		//RedirectView redirectView=new RedirectView();
		//redirectView.setUrl(req.getContextPath()+"/view");
		return "view";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	

}
