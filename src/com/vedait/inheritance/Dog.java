package com.vedait.inheritance;

public class Dog extends Animal {

	public void dogEat() {
		System.out.println("dog is eating");
	}

	@Override
	public void eat() {
		System.out.println("dog is eating but chilid class");
	}

}
