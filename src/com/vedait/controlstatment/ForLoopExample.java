package com.vedait.controlstatment;

public class ForLoopExample {

	public static void main(String[] args) {

		// for(variable initilizaiton; condition; increment/decrment){}
		for (int i = 1; i <= 10; i++) {
			System.out.println("Printing number 1-10 :" + i);
		}
		System.out.println("============");
		System.out.println();

		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.println("Print even number: " + j);
			}
			if (j % 2 != 0) {
				System.out.println("Odd Numbers:" + j);
			}

		}
		System.out.println("-------------");

		for (int k = 1; k <= 5; k++) {

			for (int a = 1; a <= k; a++) {

				System.out.print("*");
			
			}
			System.out.println();
		}
		System.out.println("Printing testing doing eating 8 hours");
		system.out.println("Changes applied");
	}
}
