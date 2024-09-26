package com.vedait.exceptions;

public class JavaExcepitonExample {

	public static void main(String[] args) {
		System.out.println("the code start here.");
		try {
			int i = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

		System.out.println("Rest of the code");
		
		//int i = 100 / 0;
		
		String s=null;
		//System.out.println(s.length());
		int[] arr= {1,2,3};
		for (int i = 0; i<=arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Rest of the code");

		
	}
	

}
