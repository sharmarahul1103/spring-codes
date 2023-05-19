package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.dao.Imagedao;
import com.dao.ImagedaoImpl;
import com.entity.Fileinfo;

@Controller
public class Mycontroller {
	
	@Autowired
	private Imagedao obj;
	
	
	
	@RequestMapping(value="/giveform")
	public String fileform()
	{
		return "fileform";
	}
	
	@RequestMapping(value="/handleImage", method = RequestMethod.POST)
	public String handleImage(@RequestParam CommonsMultipartFile file ) throws IOException 
	{
	  System.out.println("file upload handler");
	   
	    String name=file.getOriginalFilename();
	    
	    
	    Fileinfo info=new Fileinfo();
	    info.setData(file.getBytes());
	    info.setFilename(name);
	    obj.save(info);
		//System.out.println(file.getContentType());
		//System.out.println(file.getName());
		
	  //String name=info.getFile().getOriginalFilename();
		
	  // byte[] data= file.getBytes(); //extracting file data in byte form
		
	   // byte arr[]=info.getFile().getBytes(); 
	    
	  //System.out.println(info.getName());
		 
		 
		 
		System.out.println("object created");
	    
		//String path=s.getServletContext().getRealPath("/")+name;
		//System.out.println(path);
		//FileOutputStream fos=new FileOutputStream(path);
		//fos.write(arr);
		//fos.close();
		
		return "success";
	}

}
