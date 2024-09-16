package com.vedait.practice.interfaces;

public class Photo implements Printable {

	String photoDetails;

	public Photo(String photoDetails) {
		this.photoDetails = photoDetails;
	}

	@Override
	public void print() {
		System.out.println("Printing Photo Details :" + photoDetails);

	}

	public static void main(String[] args) {
		Printable printable;// =new Printable();// interface we can't create instace

		printable = new Documnet("Hello World");
		printable.print();
		printable = new Photo("Rain Picture");
		printable.print();

	}

}
