package com.vedait.controlstatment;

public class ArrayExample {

	public static void main(String[] args) {
		// once array is created the size can't increment : fixed size
		// the first elemeent start at zero
		// all elements must be same data type : homoginues
		// Memory allocation:
		// datatype[] variableName;
		// two array single and 2D array

		int[] numbers = { 10, 20, 30, 40, 50 };
		
		int[][] values = { { 1, 2 }, { 2, 3 } };

		for (int i = 0; i <= numbers.length - 1; i++) {

			System.out.println(numbers[i]);
		}
		
		// Collections:  ArrayList, LinkinedLIst, Set, HashSet, HashMap

	}

}
