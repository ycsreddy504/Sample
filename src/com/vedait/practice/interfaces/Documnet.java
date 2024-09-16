package com.vedait.practice.interfaces;

public class Documnet implements Printable{
	
	String content;
	

	public Documnet(String content) {
		this.content = content;
	}


	@Override
	public void print() {
		System.out.println("Printing....Document Content :"+ content);
	}

}
