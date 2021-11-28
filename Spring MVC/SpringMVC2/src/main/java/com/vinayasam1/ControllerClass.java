package com.vinayasam1;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	
	@RequestMapping("/helloworld")
   public String show()
 {
	 return "index.jsp";
 }
	@RequestMapping("/helloworld1")
	   public String show1()
	 {
		 return "helloWorld.jsp";
	 }
}
