package com.vedait.inheritance;

public class SubClass extends SuperClass { // child class
	// Is-A relationship or parent-child relationship
	// if parenet class define any properties or methods that belongs to child class
	// as well

	// single inheritance parentClass, SubClasss example: Animal , Dog extends
	// Animal
	// multiLevl Inheritance Parentclass, subclass1, subaclass2 exmaple: Bank , ICIC
	// extends Bank, SBI extends ICIC
	// Hirarical Inheritance ParentClass, sublass1, subclass2, exmpale: University,
	// SVIT extends Unversity, GET extends University
	// Multiple and Hibrid Inheritance

	public SubClass(int i, String string) {
		super.id = i;
		super.name = string;
	}

	public void disply() {
		System.out.println("Child Id : " + super.id);
		System.out.println("Child Name : " + super.name);
	}

	public static void main(String[] args) {

		SuperClass sp = new SuperClass(101, "Chandra");
		sp.disply();
		SubClass sc = new SubClass(102, "Sirisha");
		sc.disply();

	}

}
