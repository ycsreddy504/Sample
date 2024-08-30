package com.vedait.opps.classmethod;

public class EmployeeExample {

	int id;
	static String name;
	double salary; // instace varibale

	public void writeCode(String name, int id) {
		// local variable
		System.out.println(name + "" + id);

	}

	public static void main(String[] args) {

		EmployeeExample emp = new EmployeeExample(); // create object
		emp.writeCode("String", 12);
		name = "Testing";
		System.err.println("emp Name: " + emp.name);

		CarExample carExample = new CarExample();
		carExample.carDetails1("HundaiCreata", "SX");
		String extor = CarExample.carModel("HundaiExtor");
		System.out.println("HundaiExtor: " + extor);

	}

}
