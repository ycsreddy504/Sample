package com.vedait.hasa.relationship;

public class Employee {

	int empId;
	String name;
	double salary;
	String designation;
	Address address; //  object instance variable
	// alt+shift+s  --> press O
	


	
	public Employee(int empId, String name, double salary, String designation) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public Employee(int empId, String name, double salary, String designation, Address address) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.address = address;
	}
	
	public void employeeDetails() {
		System.out.println("Employee Id: "+ empId);
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee salary: "+ salary);
		System.out.println("Employee Designation: "+ designation);
		System.out.println("Employee Address: "+ address);
	}
	
	

}
