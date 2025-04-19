package com.msjJava;

public class MyTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte b = -127;
//		long a = b;
//		// Implicit type casting, the compiler is doing;
//		System.out.println("Higher datatype \"long\" is holding lower datatype \"byte\" value");
//		System.out.println(a);

		double d = -129.5;
		byte b = (byte) d; // Explicit type casting;
		System.out.println(b);
	}

}
