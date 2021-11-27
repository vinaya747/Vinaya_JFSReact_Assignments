package com.vksk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AddressService {

	@Autowired
	Address address1;
	
	private List<Address> address = new ArrayList<>(Arrays.asList(new Address("100","karnataka","managalore","india"),
			new Address("101","karnataka","managalore","india"))
			);
	


public Address get(String zipcode)
{
	
	return address.stream().filter(t->t.getZipcode().equals(address1.getZipcode())).findFirst().get();
	
}

	
}
