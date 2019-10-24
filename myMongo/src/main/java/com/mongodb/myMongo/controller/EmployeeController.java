package com.mongodb.myMongo.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mongodb.myMongo.exceptions.NoIDFoundException;
import com.mongodb.myMongo.model.Employee;
import com.mongodb.myMongo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/employees/all")
	public List<Employee> getAllEmployee() {
		List<Employee> list = service.seeAll();
		if (list.size() == 0) {
			throw new NoIDFoundException("Nothing Found");
		}
		return list;
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") ObjectId id) {
		Employee emp = service.seeById(id);
		if (emp == null) {
			throw new NoIDFoundException("ID Not Found");
		}
		return emp;
	}

	@PostMapping("/employees")
	public String add(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}

	@DeleteMapping("/employees/{id}")
	public String delete(@PathVariable("id") ObjectId id) {
		return service.deleteEmployee(id);
	}

	@PutMapping("/employees/{id}")
	public String update(@RequestBody Employee emp, @PathVariable("id") ObjectId id) {
		return service.updateEmployee(emp, id);
	}

}
