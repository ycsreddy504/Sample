package com.vedait.javaopps.misc;

public class CallByValueAndCallByRef {

	int data = 50;

	void change(int data) {
		data = data + 100; // changes will be in the local variable only

	}

	public static void main(String[] args) {
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		System.out.println("Befor Change : " + obj.data);
		obj.change(500);
		System.out.println("After Change : " + obj.data);

	}

}
