package com.vedait.ploymorphism.methodoverriding;

public class Animal {

	// super classs or parent class
	// subclass or child class
	// method ovveriding is used for run time polymormphism
	// method ovverrding is use to prvodie the specific implemention which is
	// delclared by parent class

	// Rules of java method ovverriding
	// 1. method name should be same name in parent class
	// 2. the method must have same parameters in parent class
	// 3. there must be has a is-a relationship

	void bow() {
		System.out.println("Animal Bow");
	}
	void bow(long a, int b) {
		System.out.println("Int a, int b of partent bow method");
	}
	
	public static void main(String[] args) {
		Dog dog=new Dog(); // create instance for child class
		dog.bow(10, 20);  // 
		Animal animal=new Animal();
		//animal.bow1();

	}
}

class Dog extends Animal {  // is-a realtions 

	void bow1() {
		System.out.println("Dog bow Bow....");
	}
	
	void bow(int a, int b) {
		System.out.println("Int a, int b of child bow method");
	}



}
