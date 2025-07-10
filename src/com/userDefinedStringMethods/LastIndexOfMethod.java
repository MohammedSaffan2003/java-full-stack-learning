package com.userDefinedStringMethods;

import java.util.Scanner;

public class LastIndexOfMethod {

	public static int lastIndexOf(String s, char c) {
		int n = s.length() - 1;
		for (int i = n; i >= 0; i--) {
			if (c == s.charAt(i))
				return i;
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
		System.out.printf("The index of %c is %d", c, lastIndexOf(str, c));
		sc.close();
	}

}

//@formatter:off
/*
* Explanation of how the loop in lastIndexOf works:
*
* The goal is to find the last occurrence of a character in a string —
* that means the one farthest to the right.
*
* The loop runs from the end of the string toward the beginning:
* 
*   for (int i = s.length() - 1; i >= 0; i--) {
*       if (s.charAt(i) == c)
*           return i;
*   }
*
* As soon as we find a match, we return immediately.
* This works because we're checking characters from right to left,
* so the first match we find is guaranteed to be the last occurrence.
*
* Example:
*   String s = "abracadabra";
*   char c = 'a';
*   The last 'a' is at index 10.
*   The loop starts at index 10 and finds the match immediately, so it returns 10.
*
* If we had looped from the beginning, we'd find the first occurrence instead.
* To find the last one when going left to right, we'd need to store every match:
*
*   int lastIndex = -1;
*   for (int i = 0; i < s.length(); i++) {
*       if (s.charAt(i) == c)
*           lastIndex = i;
*   }
*   return lastIndex;
*
* That also works, but is less efficient because it always scans the full string.
*/
//@formatter:on
