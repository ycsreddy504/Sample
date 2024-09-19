package com.vedait.immutable;

public class TestImmutableString {
	
	public static void main(String[] args) {

		String s1="Chandra";
		 s1.concat("Sekhara");
		System.out.println(s1);  // 
		
		String s2="Chandra";
		s2 = s2.concat("Sekhara");
		System.out.println(s2); // Immutable 
		
	}

}
