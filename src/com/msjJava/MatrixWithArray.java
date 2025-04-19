package com.msjJava;

public class MatrixWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];

		// Initializing
		// See how many floors
		for (int i = 1; i <= arr.length; i++)
			// See how many classrooms after coming inside the floor ,i.e ith floor
			for (int j = 1; j <= arr[i - 1].length; j++)
				arr[i - 1][j - 1] = i + j;

		// Printing/Accessing
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= arr[i - 1].length; j++)
				System.out.print(arr[i - 1][j - 1] + "\t");
			System.out.println();
		}
	}

}
