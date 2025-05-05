package com.assignments;

import java.util.Arrays;

//Q: How to check if two Strings are anagrams of each other?
public class CheckForAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "race";
		String s2 = "care";
		if (s1.length() != s2.length())
			System.out.println("Strings are not Anagram");

		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2))
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");

	}

}
//Alternate approach
//@formatter:off
/* 
- public class CheckForAnagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        System.out.println(areAnagrams(s1, s2)
            ? "Strings are Anagram"
            : "Strings are not Anagram");
    }

    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[256]; // ASCII character count

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
-
*/
//@formatter:on
