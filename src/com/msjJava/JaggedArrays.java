package com.msjJava;

import java.util.Scanner;

public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= new int[10];
//		int arw[];
//		arw= new int[90];

		Scanner sc = new Scanner(System.in);

		// 2D Jagged Array
//		int[][] ar = new int[2][];// [has clarity of size][has no clarity]
//		ar[0] = new int[3]; // declaring the first row
//		ar[1] = new int[4]; // declaring the second row
//
//		// Storing values
//		for (int r = 0; r < ar.length; r++) {
//			for (int c = 0; c < ar[r].length; c++) {
//
//				ar[r][c] = r + c;
//			}
//		}
//		// Printing values
//		System.out.println("The 2D Jagged array\n");
//		for (int r = 0; r < ar.length; r++) {
//			for (int c = 0; c < ar[r].length; c++) {
//
//				System.out.print(ar[r][c] + "  ");
//			}
//			System.out.println();
//		}

		// 3D Jagged Arrays
		int[][][] ar = new int[2][2][];
		// first comp, 1st floor => 3 rooms
		ar[0][0] = new int[3];

		sc.close();

	}

}
