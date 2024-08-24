package com.vidait.variable;

public class VariableTest {

	int id = 10;
	String name = "Chandra"; // intance variables

	static String institute = "VedaIT";

	public static void main(String[] args) { // start curly brace

		int salary = 2000; // local variables
		int total; // define variable   

		System.out.println("salray:" + salary);

		//
		VariableTest v1 = new VariableTest();

		v1.test();

	} // end

	public void test() {
		// static int salray=200;
		// System.out.println("salray:" +salary);
		System.out.println("Id :" + id);
		System.out.println("Name :" + name);
		System.out.println("institute :" + institute);
		
		System.out.println("Adding new line of code for testing..");
	}
	
	
}
