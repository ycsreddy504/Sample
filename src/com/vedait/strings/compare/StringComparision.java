package com.vedait.strings.compare;

public class StringComparision {
	
	public static void main(String[] args) {
		
		String s1="Chandra";
		String s2="Chandra";
		String s3 =new String("Chandra");
		String s4="Sekahra";
		System.out.println(s1.equals(s2));  //  true
		System.out.println(s1.equals(s3));  // true
		System.out.println(s2.equals(s4)); // false
		
		String s5="Devisri";
		String s6 = "DEVISRI";
		System.out.println(s5.equals(s6));  // false Devisri.equeals(DEVISRI)
		System.out.println(s5.equalsIgnoreCase(s6)); // true 
		
		
		
	}

}
