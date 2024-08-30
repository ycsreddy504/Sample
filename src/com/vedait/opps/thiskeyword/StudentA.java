package com.vedait.opps.thiskeyword;

public class StudentA {

	int sudentId;
	String sname;
	String cource;

	public StudentA(int sid, String studentName, String sCource) {
		sudentId = sid;
		sname = studentName;
		cource = sCource;
	}

	public void displyStudent() {
		System.out.println("Student Details: " + sudentId);
		System.out.println("Student Name : " + sname);
		System.out.println("Student Cource: " + cource);
	}

	public static void main(String[] args) {
		StudentA s1 = new StudentA(1002, "Yashwanth", "CoreJava");
		s1.displyStudent();

	}

}
