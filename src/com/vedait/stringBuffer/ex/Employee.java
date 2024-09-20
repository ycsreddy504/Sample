package com.vedait.stringBuffer.ex;

public final class Employee { // make class a final

	final String pancardNumber;

	public Employee(String pancarNumber) { // privide the constructor
		this.pancardNumber = pancarNumber;
	}
	// setter no need to define 
	public String getPancardNumber() { // define only getter method
		
		return pancardNumber;
	}

	public static void main(String[] args) {
		Employee employee=new Employee("AMPLY1244K");
		String pan=employee.getPancardNumber();
		System.out.println(pan);
		
	}
}
