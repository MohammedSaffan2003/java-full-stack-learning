package com.userDefinedStringMethods;

import java.util.Scanner;

public class EqualsMethod {

	static boolean myEqualsMethod(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		// char[] c1 = s1.toCharArray();
		// char[] c2 = s2.toCharArray();
		//
		// for (int i = 0; i < c1.length; i++)
		// if (c1[i] != c2[i])
		// return false;

		// ✅ Using charAt(i) is better than toCharArray() because:
		// - Avoids extra memory allocation for character arrays
		// - Slightly more efficient, especially for large strings
		// - Simpler when no need to manipulate the full array

		for (int i = 0; i < s1.length(); i++)
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		return true;
	}

	static boolean myEqualsMethodIgnoreCase(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// s1.toLowerCase(); // ❌
		// ⚠️ Strings in Java are immutable.
//	    Methods like toLowerCase() do NOT change the original string.
//	    They return a new string, so you must assign the result.

		// ✅ Correct usage:
//	    s1 = s1.toLowerCase();  // reassign the result
//	    s2 = s2.toLowerCase();

		// ✅ To compare two strings ignoring case, you can also use:
//	    s1.equalsIgnoreCase(s2)

		// 💡 Optional: Use trim() if you want to ignore leading/trailing spaces:
//	    s1 = s1.trim().toLowerCase();

//		System.out.println("s1 " + s1 + " s2 " + s2);
		for (int i = 0; i < s1.length(); i++)
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string ");
		String s1 = sc.next();
		System.out.println("Enter the second string ");
		String s2 = sc.next();
		System.out.println((myEqualsMethod(s1, s2)) ? "Same" : "Different");
		System.out.println((myEqualsMethodIgnoreCase(s1, s2)) ? "Same (ignored case)" : "Different (ignored case)");

	}

}
