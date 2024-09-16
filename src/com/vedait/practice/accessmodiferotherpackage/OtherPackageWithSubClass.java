package com.vedait.practice.accessmodiferotherpackage;

import com.vedait.practice.accessModifier.ProtectedAccessModifierEx;

public class OtherPackageWithSubClass  extends ProtectedAccessModifierEx{
	
	// private, default, protected, public
	// privaate --> default --> procted --> public
	
	@Override
	public void m1() {
		System.out.println("THis is protected method other package subclass");
	}
	

	
	public static void main(String[] args) {
		

		OtherPackageWithSubClass p1=new OtherPackageWithSubClass();
		p1.m1();
	}

}
