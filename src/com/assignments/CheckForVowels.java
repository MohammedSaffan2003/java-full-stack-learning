package com.assignments;

//Q: Write a Java program to check if a vowel is present in a string 
public class CheckForVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "String".toLowerCase();
		s = "bcdfgh";
		if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u"))
			System.out.println("A Vowel is present ");
		else
			System.out.println("String contains no vowel");
	}

}
