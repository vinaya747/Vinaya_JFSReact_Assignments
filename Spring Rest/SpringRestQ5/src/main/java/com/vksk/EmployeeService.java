package com.vksk;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	public Employee create(Long id, String name, int salary) {
		
		return repo.save(new Employee(id,name,salary));
	}

	public List<Employee> getAll() {
		return repo.findAll();
	}

	public Optional<Employee> get(Long id) {
		return repo.findById(id);
		
	}

	public void deleteAll() {
		repo.deleteAll();
		
	}

	public void delete(Long id) {
	   repo.deleteById(id);
	   
		
	}
	
	
	

}
