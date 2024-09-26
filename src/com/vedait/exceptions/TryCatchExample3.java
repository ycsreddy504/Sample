package com.vedait.exceptions;

public class TryCatchExample3 {

	public static void main(String[] args) {

		int i = 50;
		int j = 0;
		int data;

		try {
			data = i / j; // may throw excepiton

		} catch (Exception e) {
			// resolving the excepiton in catch block
			System.out.println(i / (j + 2));
			int data2=50/0;
		}
	}

}
