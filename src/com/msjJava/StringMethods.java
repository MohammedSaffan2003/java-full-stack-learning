package com.msjJava;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "Hi I am MSJ";
//		String[] s1 = s.split(" ");
//		for (String ss : s1)
//			System.out.println(ss);
//		//Proof to be array
//		System.out.println("String at 3rd index-> " + s1[3]);
//
//		// Split by comma ','
//		System.out.print("Splitting by comma -> ");
//		String[] s3 = "hi,hello,worl,you,me, ,bye".split(",");
//		for (String s4 : s3)
//			System.out.print(s4 + " ");
//		System.out.println();
//
//		System.out.println("Starts with Hi ->" + s.startsWith("Hi"));
//		System.out.println("Ends with MSJ ->" + s.endsWith("MSJ"));
//
//		System.out.println("Contains MS -> " + s.toUpperCase().contains("MS"));
		
		//References Check
		String s1 = new String("You can not change me");
		String s2 = new String("You can not change me");
		String s3 = "You can not change me";
		String s4 = "You can not "+"change me";
		String s5 = "You can not ";
		String s6 = s5 + "change me";
		
		System.out.println(s3 == s4);
		System.out.println(10 + 20 + "40");

	}

}
