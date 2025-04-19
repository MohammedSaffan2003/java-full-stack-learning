package com.msjJava;

public class RefenceTypeAssignment {
	String cname, cprice;

	public static void main(String args[]) {
		RefenceTypeAssignment c = new RefenceTypeAssignment();
		c.cname = "BMV";
		c.cprice = "2000313";
		System.out.println("from c object\nName " + c.cname + "\nPrice " + c.cprice);

		RefenceTypeAssignment x;
		x = c;
		System.out.println("\nfrom x object\nName " + x.cname + "\nPrice " + x.cprice);

		x.cname = "New name";
		x.cprice = "200";
		System.out.println("\nValues chnaged by x object\n");
		System.out.println("from c object\nName " + c.cname + "\nPrice " + c.cprice);

	}

}
