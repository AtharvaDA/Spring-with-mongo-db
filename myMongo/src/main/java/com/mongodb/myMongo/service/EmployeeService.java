package com.mongodb.myMongo.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.myMongo.model.Employee;

public interface EmployeeService {
	public List<Employee> seeAll();
	public Employee seeById(ObjectId id);
	public String addEmployee(Employee emp);
	public String updateEmployee(Employee emp, ObjectId id);
	public String deleteEmployee(ObjectId id);
}
