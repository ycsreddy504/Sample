package com.vedait.javaopps.misc;

public class ObjectClass implements Cloneable {

	//
	public static void main(String[] args) {
		Object obj = new Object();
		String str = "Chandra";
		String str1 = new String("Sekhara");
		System.out.println(obj.equals(str));
		System.out.println(obj.hashCode());

		// Object cloing is a way to ccreate exact copy of an object.

		// clone() method of OBjet clas is used to cclone an objecct

		// Math

		double absValue = Math.abs(10.098);
		System.out.println(absValue);
	}

}
