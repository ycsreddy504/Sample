package com.vedait.stringBuffer.ex;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("Welcome");
		s1.append("Chandra");
		System.out.println(s1);
		
		s1.insert(2, "Sekhara");  // 0, 1, 2
		System.out.println(s1);
		
		s1.replace(1, 2, "Java");
		
		System.out.println(s1);
		s1.delete(1, 3);
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
		System.out.println("...........");
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("Sirisha");
		sb1.append("Poojitha and Sirsha both are friends");
		System.out.println(sb1.capacity()); // (16*2)+2 = 34
		
		
		
	}

}
