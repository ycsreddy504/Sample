package com.vedait.stringBuffer.ex;

public class ConcatTest {
	
	public static String concatWithString() {
		String t = "test";
		System.out.println(t.hashCode());
		for (int i = 0; i < 10000; i++) {
			t = t + "Sekhara";
			
		}
		System.out.println(t.hashCode());
		return t;
	}
	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("test");
		System.out.println(sb.hashCode());
		for (int i = 0; i < 10000; i++) {
			sb.append("Sekhara");
		}
		System.out.println(sb.hashCode());
		return sb.toString();
	}
	
	public static String concatWithStringBuilder() {
		StringBuilder sb = new StringBuilder("test");
		System.out.println(sb.hashCode());
		for (int i = 0; i < 10000; i++) {
			sb.append("Sekhara");
		}
		System.out.println(sb.hashCode());
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken with string:"+ (System.currentTimeMillis() - startTime)+"ms");
		startTime =System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println();
		System.out.println("Time taken with stringBuffer:"+ (System.currentTimeMillis() - startTime)+"ms");
		startTime =System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println();
		System.out.println("Time taken with stringBuffer:"+ (System.currentTimeMillis() - startTime)+"ms");
		
	}

}
