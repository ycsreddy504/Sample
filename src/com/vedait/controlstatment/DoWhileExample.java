package com.vedait.controlstatment;

public class DoWhileExample {

	public static void main(String[] args) {
		int a = 1;

		do {
			// System.out.println("Run the do while stmt");
			if (a % 2 == 0) {
				System.out.println("Even number is:" + a);
			}
			
			a++;
		} while (a <= 11);

	}
}
