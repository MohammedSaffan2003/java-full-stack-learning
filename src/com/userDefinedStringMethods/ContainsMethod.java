package com.userDefinedStringMethods;

import java.util.Scanner;

public class ContainsMethod {

	static boolean contains(String s, String str) {
		if (s.length() > str.length())
			return false;
		int n = str.length(), i = 0;
		while (n-- >= 0) {
			if (str.charAt(i++) == s.charAt(0)) {
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) != str.charAt(n)) {
						if (j == s.length() - 1)
							return false;
						break;
					}

				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
//		int ii =0;
//		for( int i=0; i< s1.length(); i++ ) {
//			if( s1.charAt(i) == s2.charAt(ii)) {
//				ii++;
//			}
//		}
//		if (ii == s2.length())
//			System.out.println(true);
//		else
//			System.out.println(false);

		String str = "Bangalore";
		String s = "lore";
		str.contains(s);
		sc.close();
	}

}
