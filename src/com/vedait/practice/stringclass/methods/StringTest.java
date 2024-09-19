package com.vedait.practice.stringclass.methods;

public class StringTest {

	public static void main(String[] args) {

		String str1 = "SiRisha";
		// upper case and lower case methods
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		// trim() method
	    String str2 = " String ";
		System.out.println(str2.trim());
		
		// stratwith() method endmethod()
		System.out.println(str1.startsWith("S"));
		System.out.println(str1.endsWith("a"));
		
		// charAt() method
		System.out.println(str1.charAt(2));
		
		// length()
		System.out.println(str1.length());
		// intern()
		String s1=new String("Test");
		String s2=s1.intern();
		System.out.println(s2);
		
		// ValueOF
		int a = 10;
		String str = String.valueOf(a);
		System.out.println(str);
		
		// replacce
		String word="Java is a good program language and Java";
		String replcae=word.replace("Java", "CoreJava");
		System.out.println(replcae);
		 
		String str3=" ";
		if(str3.isBlank()) {

			System.out.println("String is blank");
		}
		System.out.println(str3.isEmpty());

	}

}
