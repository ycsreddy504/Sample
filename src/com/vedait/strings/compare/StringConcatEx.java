package com.vedait.strings.compare;

public class StringConcatEx {

	// String concatenation forms a new string that is combination 
	// of multiple strings.
	// there are two ways to define strings concat
	// 1. by +(String contenation) operating
	// 2. concat() method
	
	public static void main(String[] args) {
		
		String s1="Chandra" + "Sekahra";
		System.out.println(s1 +"  CoreJava Dev"+" good");
		String s2="Sekhara";
		System.out.println(s2.concat("Reddy"));
	}
	
}
