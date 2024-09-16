package com.vedait.hasa.finalkeyword;

public  class Student extends FinalKeywordNotes {

	int id;
	String sname;
	final static String UNIVERSITY = "SKU";
	
	/*
	 * public final void m1() { System.out.println("M1 method"); }
	 */
	public Student(int id, String sname) {
		this.id = id;
		this.sname = sname;
	}

	public void disply() {
		// UNIVERSITY ="Testing";
		System.out.println("Id: " + id);
		System.out.println("Sname : " + sname);
		System.out.println("University : " + UNIVERSITY);
	}

	public static void main(String[] args) {

		 Student suStudent=new Student(101, "Sirisha");
		 suStudent.disply();
	}

}
