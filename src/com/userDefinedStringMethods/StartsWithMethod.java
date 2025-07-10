package com.userDefinedStringMethods;

import java.util.Scanner;

public class StartsWithMethod {

	static boolean startsWith(String s, String str) {
		if (s.length() > str.length())
			return false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != str.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
//		String str = "Bangalore";
		String str = sc.nextLine();
		System.out.println("Enter the search string:");
		String s = sc.nextLine();
//		String s = "Bang";
		System.out.printf("%s starts with %s: %b", str, s, startsWith(s, str));
		sc.close();
	}

}
