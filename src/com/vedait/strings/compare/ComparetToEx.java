package com.vedait.strings.compare;

public class ComparetToEx {

	
	public static void main(String[] args) {
		
		String s1="Devisri";
		String s2="Devisri";
		String s3="Aravind";
		System.out.println(s1.compareTo(s2));//  == // 0
		System.out.println(s1.compareTo(s3)); // s1>s2 // retrun positive
		System.out.println(s3.compareTo(s1)); // s3<s1 // 
		
	}
}
