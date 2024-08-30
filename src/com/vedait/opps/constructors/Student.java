package com.vedait.opps.constructors;

public class Student {
	int id;
	String sName;
	String cource; // instacne variable

	public Student() {
		System.out.println("Student id: " + id);
		System.out.println("Student Name:" + sName);
		System.out.println("Student Cource: " + cource);
	}

	public Student(int id, String sName, String cource) {
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

	public Student(int sId, String studentName, String studentCource, String value) {
		id = sId;
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

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101, "Chandra", "Java");

		Student s3= new Student(101, "Chandra", "Java", "disply");

	}

}
