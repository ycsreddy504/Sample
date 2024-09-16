package com.vedait.hasa.abstaction;

public abstract class Animal { // abstract class should be abstract key word
	
	public  abstract void eat(); // abstract method
	
	public Animal() { // abstract class can have constructor and static methhods
		System.out.println("THis is Anial Constructor");
	}
	
	// we can't make abstarct method as static method
	public static void m1() {
		System.out.println("Sataic method in Animal class");
	}
	
	public  void run() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Animal animal=new Animal(); // we can't create instance for abstaract class
	}

}
