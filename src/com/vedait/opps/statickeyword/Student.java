package com.vedait.opps.statickeyword;

public class Student {

	static int studentId;
	String sName;
	String cource;

	public Student() {
		studentId++;
		System.out.println("Student Id: " + studentId);
	}

	public static void displyStudentDetails() {
		System.out.println();
		System.out.println("Student Id: " + studentId);
		// System.out.println("Student Name: "+ sName);

	}

	public String displyStudentDetails1() {
		System.out.println();
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Name: " + sName);
		return "Disploy values studen Info";

	}

	public static void main(String[] args) {

		Student student = new Student();

		Student student1 = new Student();

		Student student2 = new Student();
		student2.displyStudentDetails();
		Student.displyStudentDetails();
		student.displyStudentDetails1();
		//String value = Student.displyStudentDetails1();
		//System.out.println(value);

	}

}
