package com.mongodb.myMongo.repository;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.myMongo.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String>{
	Employee findBy_id(ObjectId _id);
}
