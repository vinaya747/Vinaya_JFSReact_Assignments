package com.vksk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class PersonService {
	
	   @Autowired
	    PersonRepo repo;

	    public List<Person> getAllPerson() {
	        return this.repo.findAll();
	    }

	    public PersonService(PersonRepo repo) {
	        this.repo = repo;
	    }

}
