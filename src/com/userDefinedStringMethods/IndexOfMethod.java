package com.userDefinedStringMethods;

import java.util.Scanner;

public class IndexOfMethod {

	static int indexOf(String str, char ch) {
		int index = 0;
		for (char c : str.toCharArray()) {
			if (c == ch)
				return index;
			index++;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Enter character to find its index ");
		char c = sc.next().charAt(0);
		System.out.printf("The index of %c is %d", c, indexOf(str, c));
		sc.close();
	}

}
