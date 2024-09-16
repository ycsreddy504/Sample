package com.vedait.hasa.abstaction;

public class Circle extends Shape{

	@Override
	void draw() {
		
		System.out.println("THis is Circle method in Circle class.....");
	}
	
	public static void main(String[] args) {
		Shape shape;
		shape = new Rectangle();
		shape.draw();
		shape = new Circle();
		shape.draw();
	}
	// you can pract with this example and we already disuss with Bank
	// I want you to practice Bank exampel using abstract class
	

}
