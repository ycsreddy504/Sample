package com.vedait.opps.classmethod;

public class CarExample {

	String carType;
	String carVersion; // instance variable

	public void carDetails() {
		System.out.println("CarType : " + carType);
		System.out.println("Car Version : " + carVersion);
	}

	public void carDetails1(String type, String version) {
		carType = type;
		carVersion = version;
		System.out.println("CarType : " + carType);
		System.out.println("Car Version : " + carVersion);
		System.out.println("------");

		System.out.println("CarType : " + type);
		System.out.println("Car Version : " + version);
	}

	public static String carModel(String model) {

		return model;
	}

	public static void main(String[] args) {

		CarExample carExample1 = new CarExample();// object or intace

		carExample1.carDetails();
		CarExample carExample2 = new CarExample();// object or intace

		carExample2.carDetails1("Nexon", "XZ+");

		String careModel = carExample2.carModel("TataNexon");
		System.out.println("CarModel:"+ careModel);
		System.out.println(carExample1.carModel("TataTiago"));
		String carModel1 = CarExample.carModel("TataPunch");
		System.out.println("CarModel1:"+ carModel1);

	}

}
