package com.msjJava;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "RoomanTechnology";
		// substring(start, end); -> this method end index is exclusive -- meaning
		// doesn't include the end but end -1;
		System.out.println(s.substring(3, 10));
		System.out.println(s.substring(0));
		System.out.println(s.charAt(9));
		System.out.println(s.indexOf('h'));
		System.out.println(s.toCharArray()[7]);
		for (char c : s.toCharArray())
			System.out.print(c + " ");
	}

}
