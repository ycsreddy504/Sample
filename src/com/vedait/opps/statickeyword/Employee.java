package com.vedait.opps.statickeyword;

public class Employee {

	int empId;
	String empName;
	static String companyName = "TCS";

	public Employee() {
	}

	public Employee(int empId, String empName, String companyName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.companyName = companyName;
	}

	public void displyEmployeeInfo() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Company Name :" + companyName);
		System.out.println();
	}

	public static void main(String[] args) {

		Employee employee = new Employee(101, "Chandra", companyName);

		Employee employee1 = new Employee(102, "Shirisha", companyName);

		Employee employee2 = new Employee(103, "Devisri", companyName);
		employee.displyEmployeeInfo();
		employee1.displyEmployeeInfo();
		employee2.displyEmployeeInfo();

	}
}
