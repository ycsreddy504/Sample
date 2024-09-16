package com.vedait.hasa.superKeyword;

public class Buffellow extends Animal {

	String color = "Black";

	public Buffellow() {
		//super();
		//super(10, 20);
		System.out.println("Buffellow Class Constructor");
	}

	public void disply() {
		System.out.println("Animal Color: " + super.color);

		System.out.println("Buffellow Color: " + color);
	}

	public void eat() {
		super.eat();
		System.out.println("Buffellow is eating");
	}

	public static void main(String[] args) {

		Buffellow b = new Buffellow();  // object creation 
		b.disply();
		b.eat();
	}

}
