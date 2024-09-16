package com.vedait.hasa.abstaction;

public class Donkey  extends Animal{

	@Override
	public void eat() {
		System.out.println("Dnkey Is eating.....");
	}
	
	public static void m1() {
		System.out.println("Sataic method in Donkey class");
	}
	
	public static void main(String[] args) {
		Animal animal= new Donkey();
		animal.eat();
		Animal.m1();
		Donkey.m1();
	}

}
