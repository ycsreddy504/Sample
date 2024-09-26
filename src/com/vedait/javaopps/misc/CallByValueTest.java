package com.vedait.javaopps.misc;

public class CallByValueTest {

	int data = 50;

	void change(CallByValueTest obj) {
		obj.data = obj.data + 100; // changes will be in the instance variable only

	}

	public static void main(String[] args) {
		CallByValueTest obj2 = new CallByValueTest();
		System.out.println("Befor Change : " + obj2.data);
		obj2.change(obj2);
		System.out.println("After Change : " + obj2.data);

	}
}
