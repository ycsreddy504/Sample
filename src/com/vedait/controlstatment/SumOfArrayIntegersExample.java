package com.vedait.controlstatment;

public class SumOfArrayIntegersExample {

	public static int sumCalculate(int[] arr) {
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) { // for loop

		}
		for (int i : arr) { // 1.5 introduced the same for loop behaviour
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {

		int value[] = { 1, 2, 3, 4, 5, 6 };
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		// normal method in class then we have to cretate objecct

		SumOfArrayIntegersExample sm = new SumOfArrayIntegersExample();
		int sum = sm.sumCalculate(numbers);
		System.out.println("SumOfIntegers:"+ sum);
	}

}
