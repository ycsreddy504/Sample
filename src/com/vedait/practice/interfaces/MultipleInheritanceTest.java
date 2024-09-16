package com.vedait.practice.interfaces;

public class MultipleInheritanceTest implements Showable, Printable {

	@Override
	public void print() {
		System.out.println("Testing Print of Printable");

	}

	@Override
	public void show() {
		System.out.println("Showing somthing of show() mehtod");
	}

	// class A extends B,C it is not possible
	public static void main(String[] args) {
		MultipleInheritanceTest test = new MultipleInheritanceTest();
		test.show();
		test.print();
	}

}
