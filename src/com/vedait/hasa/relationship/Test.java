package com.vedait.hasa.relationship;

public class Test {

	public static void main(String[] args) {

		Address address = new Address("2-801", "hyderabad", "TS", "INDIA", "500050");
		Employee employee = new Employee(101, "chandra", 20000.00, "Java Developer");
		Employee employee1 = new Employee(103, "sirisha", 21000.00, "Java Developer", address);
		Employee employee2 = new Employee(102, "yashwant", 20300.00, "Java Developer",
				new Address("1-241", "puttaprthy", "AP", "India", "515154"));

		employee.employeeDetails();
		System.out.println();
		employee1.employeeDetails();
		System.out.println();
		employee2.employeeDetails();

	}

}
