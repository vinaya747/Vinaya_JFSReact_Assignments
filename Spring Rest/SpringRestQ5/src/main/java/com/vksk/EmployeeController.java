package com.vksk;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService emp;
	
	  @RequestMapping("/create")
	  public String create(@RequestParam Long id,@RequestParam String name,@RequestParam int salary )
	  {
		  Employee e= emp.create(id,name,salary);
		  return e.toString();
	  }
	 
	  @RequestMapping("/get")
	  public List<Employee> getAll()
	  {
		  return emp.getAll();
	  }
	  @RequestMapping("/get")
		public Optional<Employee> get(@RequestParam Long id)
		{
			return emp.get(id);
		}
	  @RequestMapping("deleteAll")
	  public String deleteAll()
	  {
		  emp.deleteAll();
		  return "deleted";
	  }
	  @RequestMapping("delete")
	  public String delete(@RequestParam Long id)
	  {
		  emp.delete(id);
		  return "deleted";
	  }
	  
}
