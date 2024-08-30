package com.vedait.opps.constructors;

public class ConstructorOverloading {
	int id;
	String sName;
	String cource; // instacne variable


	public ConstructorOverloading() {
		System.out.println("Student id: " + id);
		System.out.println("Student Name:" + sName);
		System.out.println("Student Cource: " + cource);
	}

	public ConstructorOverloading(int id, String sName, String cource) {
		this.id = id;
		this.sName = sName;
		this.cource = cource;

		System.out.println("Student id: " + this.id);
		System.out.println("Student Name:" + this.sName);
		System.out.println("Student Cource: " + this.cource);
		System.out.println("-----------------");
		System.out.println("Student id: " + id);
		System.out.println("Student Name:" + sName);
		System.out.println("Student Cource: " + cource);
	}
	public ConstructorOverloading(String  sName, String cource, int id) {
		
	}

	public ConstructorOverloading(String studentName, String studentCource, String value) {
		sName = studentName;
		cource = studentCource;

		System.out.println("Student id: " + this.id);
		System.out.println("Student Name:" + this.sName);
		System.out.println("Student Cource: " + this.cource);
		System.out.println("-----------------");
		System.out.println("Student id: " + id);
		System.out.println("Student Name:" + sName);
		System.out.println("Student Cource: " + cource);
	}


}
