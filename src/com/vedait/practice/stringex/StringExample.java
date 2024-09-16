package com.vedait.practice.stringex;

public class StringExample {

	public static void main(String[] args) {

		String str1 = "Chandra"; // new instace in string constant pool " chandra"
		
		String str2 = "Sirisha";  // new instace it will alocate staring pool
		String str3 = "ChanDrA" ; // 
		String str4 =new String("Chandra"); // this will create object and heap memeor

		String str5 =new String("Testing");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));

		System.out.println(str1.equals(str2)); // equlity of two object 

		System.out.println(str1.equals(str4));  // content comparitions 
		System.out.println(str1.equals(str3));
		System.out.println("........");
		System.out.println(str1 == str2);  // == operator will do reference comparisiton
		System.out.println(str1 == str4);
		System.out.println(str1 == str3);
		System.out.println(str1.equalsIgnoreCase(str3));
	}

}
