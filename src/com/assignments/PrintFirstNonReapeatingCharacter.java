package com.assignments;

import java.util.LinkedHashMap;

//Q: How to program to print first non repeated character from String?

public class PrintFirstNonReapeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcda";
		s = "aabbccdd";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : s.toCharArray()) {
			if (map.get(c) == 1) {
				System.out.println("The first repeating character is -> " + c);
				System.exit(0);
			}
		}
		System.out.println("All characters repeat");
	}

}
