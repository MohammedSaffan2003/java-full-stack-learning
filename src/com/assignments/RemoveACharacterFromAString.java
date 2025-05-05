package com.assignments;

//Q:  Write a program to remove a given character from String?

public class RemoveACharacterFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "banana"; // a-> expected : bnn
		StringBuilder sb = new StringBuilder();
		char ch = 'a';

		for (char c : s.toCharArray()) {
			if (c != ch)
				sb.append(c);
		}
		System.out.println("Updated String " + sb);
	}

}
