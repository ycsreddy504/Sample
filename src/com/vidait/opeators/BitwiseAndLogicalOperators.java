package com.vidait.opeators;

public class BitwiseAndLogicalOperators {

	public static void main(String[] args) {

		// Bitwise and Logical operators &, | and ^, && and || and

		int a = 10;
		int b = 20;
		
		boolean value=true;

		System.out.println("Bitwise & operator:" + (a & b)); //   1 1 is 1 and 1 0 =0 00 0 0 1 0
		
		System.out.println("Bitwise | operator:" + (a | b));
		

		System.out.println("Bitwise | operator:" + (value | false));  // 1 0 true, 0 0 false, 0 1 true and 1 1 true
		

		System.out.println("Bitwise | operator:" + (false | false));
		
		// logical and and logical or
		System.out.println("Logical && :" + (a > b && a < b)); // 0 && 1 = false
		

		System.out.println("Logical || :" + (a > b || a > b)); // false || false = false
		
		System.out.println("Not Operator :"+ (true ^ false));
	}

}
