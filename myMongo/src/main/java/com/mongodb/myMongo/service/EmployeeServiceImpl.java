package com.mongodb.myMongo.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.myMongo.model.Employee;
import com.mongodb.myMongo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepo repo;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepo repo) {
		this.repo=repo;
	}
	
	@Override
	public List<Employee> seeAll() {
		return repo.findAll();
	}

	@Override
	public Employee seeById(ObjectId id) {
		return repo.findBy_id(id);
	}

	@Override
	public String addEmployee(Employee emp) {
		repo.insert(emp);
		return "Employee Inserted";
	}

	@Override
	public String updateEmployee(Employee emp, ObjectId id) {
		emp.set_id(id);
		repo.save(emp);
		return "Record Updated Successfully";
	}

	@Override
	public String deleteEmployee(ObjectId id) {
		repo.deleteById(id.toString());
		return "Record Deleted Successfully";
	}

}
