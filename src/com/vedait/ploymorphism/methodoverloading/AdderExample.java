package com.vedait.ploymorphism.methodoverloading;

public class AdderExample {
	
	public int add(int a, int b) {

		return a + b;

	}

	
	/*
	 * public long add(int a, int b) {
	 * 
	 * return a + b;
	 * 
	 * }
	 */
	 
	public static void main(String[] args) {
		
		AdderExample ad=new AdderExample();
		ad.add(11, 12);
		System.out.println(ad.add(11, 11));
		
	}


}
