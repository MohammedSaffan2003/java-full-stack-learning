package com.assignments;

import java.util.HashSet;

//Q: How to find duplicate characters in a String? (return all duplicates)
public class FindDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Banana";
//		s = "no dup";
		HashSet<Character> set = new HashSet<>();
		HashSet<Character> duplicates = new HashSet<>();
		char[] c = s.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char i : c) {
			if (!set.add(i))
				if (duplicates.add(i))
					sb.append(i).append(" ");
//				sb.append(i);
//			else
//				set.add(i);
		}
		if (sb.length() > 0)
//			System.out.println("Duplicates found: " + String.valueOf(sb.toString().toCharArray()));
			System.out.println("Duplicates found: " + sb);
		else
			System.out.println("No duplicates found");
	}

}
//another approach
//@formatter:off

/*
import java.util.HashMap;

public class FindDuplicatesInString {

    public static void main(String[] args) {
        String s = "Banana";
        
        HashMap<Character, Integer> charCount = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        // Count frequency of each character
        for (char c : s.toLowerCase().toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Collect duplicates
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                sb.append(c);
            }
        }
        
        if (sb.length() > 0)
            System.out.println("Duplicates found: " + sb.toString());
        else
            System.out.println("No duplicates found");
    }
}
*/
//@formatter:on
