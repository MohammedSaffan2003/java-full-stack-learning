package com.exceptions;

class MyPro {
	void myMethod() {
		myMethod();
	}
}

public class ErrorOfStackOverFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPro p = new MyPro();
		p.myMethod();
	}

}

//@formatter:off
/*
 Exception in thread "main" java.lang.StackOverflowError
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
	at msjJava/com.exceptions.MyPro.myMethod(ErrorOfStackOverFlow.java:5)
 */
//@formatter:on