package com.vinayasam1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ControllerClass {
 @Autowired
 User user;
	
	@RequestMapping("/login")
	public String show()
	{
		
				return "login.jsp";
	}
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String show1( @RequestParam String user1,@RequestParam String pass1)
	{
		if(user.getUsername().equals(user1)&&user.getPassword().equals(pass1))
		{
			return "success.jsp";
			
		}
		else
		{
			return "error.jsp";
		}
	}
}
