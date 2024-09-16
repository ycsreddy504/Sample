package com.vedait.inheritance;

public class Monkey extends Dog {

	@Override
	public void dogEat() {
		System.out.println("monkey is eating");
	}

	public static void main(String[] args) {

		Monkey m = new Monkey();
		m.dogEat();
		Dog dog=new Dog();
		dog.eat();
	}

}
