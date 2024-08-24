package com.vedait.controlstatment;

public class SwitchExample {

	public static void main(String[] args) {

		int day = 1;
		String dayName;

		switch (day) {

		case 1:
			dayName = "Sunday";
			System.out.println(dayName);
			//break;

		case 2:
			dayName = "Monday";
			System.out.println(dayName);
			//break;

		case 3:
			dayName = "Tuesday";

			System.out.println(dayName);
			break;

		case 4:
			dayName = "Wednesday";

			System.out.println(dayName);
			break;

		case 5:
			dayName = "Thursday";

			System.out.println(dayName);
			break;
		default:
			System.out.println("Default Day Holiday sunday");
			break;

		}
	}

}
