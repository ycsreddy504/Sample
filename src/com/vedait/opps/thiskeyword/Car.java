package com.vedait.opps.thiskeyword;

public class Car {

	int modelId;
	String carType;
	double carPrice;

	/*
	 * public Car(int modelId, String carType, double carPrice) { modelId = modelId;
	 * carType = carType; carPrice = carPrice; }
	 */// cntl+shift then press / key
	
	public Car(int modelId, String carType, double carPrice) {
		this.modelId = modelId;
		this.carType = carType;
		this.carPrice = carPrice;
	}

	public void displyCarDetails() {
		System.out.println("Car ModelId: " + modelId);
		System.out.println("Car Type: " + carType);
		System.out.println("Car Price: " + carPrice);
	}

	public static void main(String[] args) {

		// 1. this is used to reffer the current class instance variable
		// 2. this is used to reffer the current class method
		// 3. this() is used to invoke the current class constructor
		// 4. this is used to pass the current class aruments in the mthod
		// 5. this is used to pass the current class arguments in the constructor
		// 6. this can be used to return the current class instance from the method.
		Car car = new Car(101, "Nexon", 1500000.00);
		car.displyCarDetails();

	}

}
