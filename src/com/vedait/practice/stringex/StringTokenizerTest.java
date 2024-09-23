package com.vedait.practice.stringex;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("My name is Chandra");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		StringTokenizer st1 = new StringTokenizer("My,name,is,Chandra");
		System.out.println("Next token is:" + st1.nextToken(","));

	}

}
