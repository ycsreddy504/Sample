package com.vedait.opps.constructors;

public class ParametrizedContructor {

	public ParametrizedContructor() {
		System.out.println("Default Constructor");
	}

	public ParametrizedContructor(int a) {
		System.out.println("Print a Value here: " + a);
	}
	
	public ParametrizedContructor(int a, int b) {
		System.out.println("Print a Value here Addition: " + (a+b));
	}
	
	

	public static void main(String[] args) {

		ParametrizedContructor pc = new ParametrizedContructor();

		ParametrizedContructor pc1 = new ParametrizedContructor(10);
		
		ParametrizedContructor pc2 = new ParametrizedContructor();

		ParametrizedContructor pc3 = new ParametrizedContructor(100);
		

		ParametrizedContructor pc4 = new ParametrizedContructor(100,200);


	}

}
