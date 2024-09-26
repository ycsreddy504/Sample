package com.vedait.javaopps.misc;

public class WrapperExample2 {

	public static void main(String[] args) {

		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0f;
		double d = 50.0d;
		char c = 'a';
		boolean b2 = true;

		// autoboxing converting primitive into object
		Byte b1 = b;
		Short s1 = s;
		Integer i1 = i;
		Long l1 = l;
		Float f1 = f;
		Double d1 = d;
		Character c1 = c;
		Boolean b3 = b2;
		// convertion of primitive object to wrapper type object

		System.out.println("Byte Object: " + b1);

		System.out.println("Short Object: " + s1);

		System.out.println("Integer Object: " + i1);

		System.out.println("Long Object: " + l1);

		System.out.println("Float Object: " + f1);
		System.out.println("Double Object: " + d1);

		System.out.println("Character Object: " + c1);
		System.out.println("Boolean Object: " + b3);

		byte b4 = b1;
		short s2 = s1;
		int i2 = i1;
		long l2 = l1;
		float f2 = f1;
		double d2 = d1;
		char c2 = c1;
		boolean b5 = b3;
		BigDataType type=new BigDataType();
		type.setValue(10);
		System.out.println();
		System.out.println("byte value: " + b4);

		System.out.println("short value: " + s2);

		System.out.println("int value: " + i2);

		System.out.println("long value: " + l2);

		System.out.println("float value: " + f2);
		System.out.println("double value: " + d2);

		System.out.println("char value: " + c2);
		System.out.println("boolean value: " + b5);
		System.out.println(type.getValue());
	}

}
