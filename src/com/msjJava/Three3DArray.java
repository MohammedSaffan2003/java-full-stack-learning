package com.msjJava;

import java.util.Scanner;

public class Three3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr = new int[2][2][3];
		Scanner sc = new Scanner(System.in);
		// Blocks
		for (int b = 0; b < arr.length; b++) {
			// Rows
			for (int r = 0; r < arr[b].length; r++) {
				// Columns
				for (int c = 0; c < arr[b][r].length; c++) {
					System.out.println("Enter element for " + b + "th block " + r + " row " + c + " col");
					arr[b][r][c] = sc.nextInt();
				}
			}
		}
		// Blocks
		for (int b = 0; b < arr.length; b++) {
			System.out.println(b + 1 + "st Block\n");
			// Rows
			for (int r = 0; r < arr[b].length; r++) {
				// Columns
				for (int c = 0; c < arr[b][r].length; c++) {
					System.out.print(arr[b][r][c] + " ");

				}
				System.out.println();
			}
		}
		sc.close();

	}

}
