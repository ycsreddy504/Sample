package com.vedait.opps.thiskeyword;

public class B {

	public B() {
		this(10); // this() // this.m1() 
		System.out.println("B defult constructor");
	}

	public B(int a) {
		this(10, 20); // constructor chaining 
		System.out.println("B int a constructor");
	}

	public B(int a, int b) {

		System.out.println("B int a, int b constructor");
	}

	public static void main(String[] args) {
      B b=new B();
      
	}

}
