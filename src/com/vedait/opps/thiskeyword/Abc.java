package com.vedait.opps.thiskeyword;

public class Abc {

	public void m1() {
		this.m2();
		this.m3(10);
		System.out.println("This is m1 method()");
	}

	public void m2() {
		m3(10);
		//m1();
		System.out.println("This is m2 method");
	}

	public void m3(int a) {
		System.out.println("This is m3 method (int a)");
	}

	public static void main(String[] args) {

		Abc abc = new Abc();
		abc.m1();

	}

}
