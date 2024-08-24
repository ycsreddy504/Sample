package com.vedait.controlstatment;

public class JumpStatements {
	
	public int m1() {
		//byte b=128;
		System.out.println(Integer.SIZE);
		
		return 20;
	}

	public static void main(String[] args) {

		for (int a = 1; a < 10; a++) {

			if (a == 7) {
				break;
			}
			System.out.println(a);
		}
		System.out.println("-----------------");

		for (int a = 1; a < 10; a++) {

			if (a == 5) { // skip
				continue;
			}
			System.out.println(a);
		}
		
		System.out.println("------------");
		JumpStatements js=new JumpStatements();
		int b = js.m1();
		System.out.println(js.m1());
		System.out.println(b);
		

	}

}
