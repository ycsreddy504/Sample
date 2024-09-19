package com.vedait.strings.compare;

public class DobulEqualOperator {
	
	public static void main(String[] args) {
		
		String s1="Chandra";    // s1 going to store in string c
		String s2="Chandra";
		String s3 =new String("Chandra");
		String s4="Sekahra";
		System.out.println(s1 == s2);  //  true
		System.out.println(s1 == s3);  // false
		System.out.println(s2 == s4); // false
		
	}

}
