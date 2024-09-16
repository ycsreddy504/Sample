package com.vedait.ploymorphism.methodoverloading;

public class Student {

	public void studentInfo(int id, String name) {

		System.out.println("Student Id:" + id);
		System.out.println("Student Name:" + name);
	}

	public void studentInfo(int id, String name, String cource) {

		System.out.println("Student Id:" + id);
		System.out.println("Student Name:" + name);
		System.out.println("Cource Name: " + cource);
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.studentInfo(101, "Chandra");
		s1.studentInfo(101, "ycsr", "Java");

	}

}
