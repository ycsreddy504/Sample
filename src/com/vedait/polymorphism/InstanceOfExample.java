package com.vedait.polymorphism;

public class InstanceOfExample {
	
	public static void main(String[] args) {
		
		InstanceOfExample obj=new InstanceOfExample();
		InstanceOfExample axisBank1= obj;
		
		System.out.println(obj instanceof InstanceOfExample);

		System.out.println(axisBank1 instanceof InstanceOfExample);
		
	}

}
