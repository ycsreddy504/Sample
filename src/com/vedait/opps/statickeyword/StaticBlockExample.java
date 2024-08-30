package com.vedait.opps.statickeyword;

public class StaticBlockExample {

	{
		System.out.println("Non-satic block");
	}

	public StaticBlockExample() {
		System.out.println("Default Constructor");
	}

	static {
		System.out.println("Static block");
	}
	static {
		System.out.println("Multpli static block");
	}

	public static void main(String[] args) {

		StaticBlockExample sb = new StaticBlockExample();

		StaticBlockExample sb1 = new StaticBlockExample();

		StaticBlockExample sb2 = new StaticBlockExample();

	}

}
