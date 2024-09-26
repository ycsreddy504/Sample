package com.vedait.javaopps.misc;

// creating custom wrapper class
public class BigDataType {

	private int i;

	BigDataType() {

	}

	BigDataType(int i) {
		this.i = i;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return  Integer.toString(i);
	}

	public static void main(String[] args) {
		BigDataType bigDataType=new BigDataType(10);
		System.out.println(bigDataType);
	}
	
}
