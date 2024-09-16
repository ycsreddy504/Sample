package com.vedait.inheritance;

public class SuperClass { // parent class

	int id;

	String name;

	public SuperClass() {
	}

	public SuperClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void disply() {
		System.out.println("Parent Id:" + id);
		System.out.println("parent Name:" + name);
	}

}
