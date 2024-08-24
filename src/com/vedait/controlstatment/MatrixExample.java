package com.vedait.controlstatment;

public class MatrixExample {

	public static void main(String[] args) {

		// Delcare and Initilize 2D array 3*3 grid
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] values = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < grid.length; i++) { // iterate over rows

			for (int j = 0; j < grid[i].length; j++) { // iterate over columns
				System.out.print(grid[i][j]);

			}

			System.out.println();

		}

		System.out.println("------------------------");
		for (int i = 0; i < values.length; i++) { // iterate over rows

			for (int j = 0; j < values[i].length; j++) { // iterate over columns
				System.out.print(values[i][j]);

			}

			System.out.println();

		}
	}

}
