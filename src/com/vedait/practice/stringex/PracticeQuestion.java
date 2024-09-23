package com.vedait.practice.stringex;

public class PracticeQuestion {

	public static void main(String[] args) {
		String s1 = "Chandra";
		String s2 = "Chandra";
		// how many objects are created above code
		// Answer is only one.
		// why? fisrt it will create one object string constant poll
		// the value already exists or not
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		// what is diff equals() mehtod and == operator

		String s3 = new String("Chandra");
		System.out.println(s3.hashCode());
		System.out.println(s1 == s3); //  false
		System.out.println(s1 == s2);  //  true
		System.out.println(s1.equals(s3)); //  true
	}

}
