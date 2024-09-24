package com.vedait.javaopps.misc;

public class MathExample1 {
	
	public static void main(String[] args) {
		
		double x= 28;
		double y= 4;
		
		System.out.println("Maximum number of x and Y is: "+ Math.max(x, y));
	
		System.out.println("Minum number of x and Y is: "+ Math.min(x, y));
		
        System.out.println("Square root of y is :"+ Math.sqrt(y));
        
        // 28 * 28 * 28 * 28 = 614656
        System.out.println("Power of x and y is :"+ Math.pow(x, y));
        
        // return the logaritham of given value when base is 10
        System.out.println("Log10 of x is :" + Math.log10(x));

        System.out.println("Log10 of y is :" + Math.log10(y));
        
     double expValue =   Math.exp(x);
     System.out.println("exp of a is :"+ expValue);
        
	
	}

}
