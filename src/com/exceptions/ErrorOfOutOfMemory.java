package com.exceptions;

public class ErrorOfOutOfMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Error due to environmental failure.
		int[] ar = new int[Integer.MAX_VALUE];
		ar[0] = 0;
	}

}
//@formatter:off
/*
 * Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
	at msjJava/com.exceptions.MyErrorOutOfMemory.main(MyErrorOutOfMemory.java:7)
 */
//@formatter:on