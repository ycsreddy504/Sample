package com.vidait.datatypes;

public class DataTypes {

	public static void main(String[] args) {
		// data types
		// 1. primitive 2. non-primitive ( string, Integer, ObjectTypes)
		// primitive contains 2 types
		// integeral byte, short , int, long
		// float datatype float, double   
		// char, boolean by defult value is false
		// 'A'

		int a = 10; // intilization of variable
		float f = 10.00f; //
		long l = 10l;
		double d = 20.00;

		boolean value = true;

		char ch = 'A';
		byte b = 127;  // range should be -128 to 127 
		// ( if we give more than range betwenn 128 to 127 we will get the compile time error)
		System.out.println("byte value:" + b);
		short s= 32767; // -32768 to 32767
		
		int mobile=949320005;  // it will store only 9 digits value
		long mobile1=9493200504l;
		System.out.println();
		
		System.out.println("Short Value:"+ s);

		System.out.println("integer value:" + a);
		double salary=2000.29;
		float fl=200.99f;
		System.out.println("Float Value: "+fl);
		System.out.println("salary:"+ salary);
		// when you want make any variables as desimal ex: salary, totalAmount, savingAmount, dueAmount

	}

}
