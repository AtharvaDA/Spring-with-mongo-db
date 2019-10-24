package com.mongodb.myMongo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee {
	@Id
	   private ObjectId _id;
		
		private Integer empId;
		private String empName;
		public Employee(ObjectId _id, Integer empId, String empName) {
			super();
			this._id = _id;
			this.empId = empId;
			this.empName = empName;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
	
		public String get_id() {
			return _id.toHexString();
		}
		public void set_id(ObjectId _id) {
			this._id = _id;
		}
		public Integer getEmpId() {
			return empId;
		}
		public void setEmpId(Integer empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		@Override
		public String toString() {
			return "Employee [_id=" + _id + ", empId=" + empId + ", empName=" + empName + "]";
		}
		
}
