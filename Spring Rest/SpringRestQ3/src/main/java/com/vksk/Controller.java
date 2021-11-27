package com.vksk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	AddressService service;
	
	@RequestMapping("/address/{zipcode}")
	public Address get(@PathVariable String zipcode)
	{
		return service.get(zipcode);
		
	}
	

}
