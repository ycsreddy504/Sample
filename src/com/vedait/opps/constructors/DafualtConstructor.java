package com.vedait.opps.constructors;

public class DafualtConstructor {

	// 1.. constructor name should same as class name
	// 2 .. constructor there no retrun type
	// 3.. construcotor when object create it will call the constructor
	// 4.. there are two types of constructors(defualt, parameterized)
	// 5.. constructor overloading
	// 6.. if we are not providing constructor compiler will give default constr
	

	public DafualtConstructor() {
		System.out.println("Defualt Construcotor");
	}
	
	public void DafualtConstructor() {
		System.out.println("Defualt not executed becz this is method");
		
	}

	public static void main(String[] args) {

		DafualtConstructor df = new DafualtConstructor();
		df.DafualtConstructor();

	}

}
