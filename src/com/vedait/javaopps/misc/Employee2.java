package com.vedait.javaopps.misc;

public class Employee2 implements Cloneable {

	int empId;
	String eName;
	String designation;

	public Employee2(int empId, String eName, String designation) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.designation = designation;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		Employee2 employee2 = new Employee2(101, "Chandra", "Java Developer");
		Employee2 employee3 = null;
		try {
			employee3 = (Employee2) employee2.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("Employee Id: " + employee2.empId);
		System.out.println("Employee Name: " + employee2.eName);
		System.out.println("Employee Designaiton:" + employee2.designation);
		System.out.println();
		System.out.println("Employee Id: " + employee3.empId);
		System.out.println("Employee Name: " + employee3.eName);
		System.out.println("Employee Designaiton:" + employee3.designation);

	}

}
