package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class Mycontroller {
	
	
	@RequestMapping(value="/giveform")
	public String fileform()
	{
		return "fileform";
	}
	
	@RequestMapping(value="/handleImage", method = RequestMethod.POST)
	public String handleImage(@RequestParam("file") CommonsMultipartFile file,HttpSession s ) throws IOException
	{
	    System.out.println("file upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		 byte[] data= file.getBytes(); //extractting file data in byte form
	String path=s.getServletContext().getRealPath("/")+file.getOriginalFilename();
		 System.out.println(path);
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		fos.close();
		return "success";
	}

}
