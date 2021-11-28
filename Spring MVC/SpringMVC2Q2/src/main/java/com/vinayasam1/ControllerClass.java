package com.vinayasam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	

	@RequestMapping("/intr")
	public ModelAndView hello() {
	
		ModelAndView mv=new ModelAndView("simpleInterest.jsp");
	     

	
		return mv;
		
	}
	@RequestMapping("/total")
	public ModelAndView show(@RequestParam float a, @RequestParam float b,@RequestParam float c)
	{
		float total= (a*b*c)/100;
		ModelAndView mv=new ModelAndView("calculate.jsp");
		mv.addObject("interest",total);
		return mv;
	}
	

}
