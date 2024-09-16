package com.vedait.opps.thiskeyword;

public class Employee {

	int empId;
	String eName;
	String eDesignation; // we can use single data type declare multiple variable name for that string
	double salary;
	
	
	public Employee() {
	}

	public Employee(int empId, String eName, String eDesignation) {
		this.empId = empId;
		this.eName = eName;
		this.eDesignation = eDesignation;
		// this.displyEmployee();
	}

	public Employee(int empId, String eName, String eDesignation, double salary) {
		this(empId, eName, eDesignation);
		this.empId = empId;
		this.eName = eName;
		this.eDesignation = eDesignation;
		this.salary = salary;
	}

	public void displyEmployee() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + eName);
		System.out.println("Employee Designation: " + eDesignation);
		System.out.println("Employee Salary: " + salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Sirisha", "CoreJava Developer");

		Employee e2 = new Employee(102, "Yahswanth", "DB Developer", 2002.00);
		e1.displyEmployee();
		e2.displyEmployee();
	}

}
