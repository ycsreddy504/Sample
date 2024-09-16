package com.vedait.hasa.relationship;

public class Car {
	Engine engine; // car has an Engine

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		System.out.println("Car is starting with :" + engine.getType() + " engine.");
	}

	public static void main(String[] args) {
		Engine engine = new Engine("V9");
		Car car = new Car(new Engine("V8"));
		car.start();
	}

}
