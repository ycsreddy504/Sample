package com.vedait.practice.stringex;

public class Notes {

	// String is class
	// String is class or object that represents sequence of charr values.
	// an array of char works same sa java string.

	String str; // define varaibale

	char[] ch = { 'a', 'b', 'c', 'd' };

	String str1 = new String(ch);  // by using new keyword

	String str2 = "abcd";  // String literal
	String str3 = "abcd";  // it doest create new instace
	
	// String object are stored in a special memory ares know a the "String constant Pool"
	// Why java use the concept of String literal?
	// if string constant ppoll alreay object are existing no need to create new isntance
	// 2. By New Keyword

	public void m1() {
		System.out.println("String value: " + str1);

		System.out.println("String value: " + str2);
	}

	public static void main(String[] args) {
		Notes note = new Notes();
		note.m1();
	}
	
	// how to create a string object
	// String literal
	// by new keyword

}
