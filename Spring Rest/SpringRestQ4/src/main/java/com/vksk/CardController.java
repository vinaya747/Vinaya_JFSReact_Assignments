package com.vksk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CardController {
	@Autowired
	ValidateCard validatingCards;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String HelloWelcome( ) {
		return "cards.jsp"; 	
	}

 	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String sayHelloWelcome(ModelMap model,@RequestParam String cNumber ) {
	 	
 		try 
		{ 
			Long.parseLong(cNumber);  		 
			
			
			if(cNumber.length()< 20 && cNumber.length()>14) {
				
				model.put("card", "It's an " + validatingCards.checkCard(cNumber) + " card.");
	 		
			}else {
				 
				model.put("msg", "Number Should be greater than ");
			}
			
		}  
		catch (NumberFormatException e)  
		{ 
			model.put("msg", "invalid input" );
		}
	 
	 	return "cards.jsp";
		}

}
