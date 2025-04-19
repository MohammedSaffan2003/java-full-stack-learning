package com.b;

import com.a.Abc;

//public class Uvw {
//	Abc abc = new Abc();
//	void m3() {
//		System.out.println(abc.a); // private member are accessed only within the class declared. //n
//		System.out.println(abc.b);//n
//		System.out.println(abc.c);//n
//		System.out.println(abc.d);//y
//	}
//}

//through inheritance
public class Uvw extends Abc {
	void m3() {
		// System.out.println(a); // private member are accessed only within the class
		// declared.// n
		// System.out.println(b); // DEFAULT OR PACKAGE can be accessed within the
		// package. not other //n
		System.out.println(c); // accessed within CLASS, PACKAGE,even if inherited//y -- accessed only through
								// inheritance in other package for protected
		System.out.println(d); // can be accessed everywhere.//y
	}
}
/*
 * Access modifiers in Java determine the visibility and accessibility of
 * classes, methods, and variables. The four primary access modifiers are:
 * 
 * 1. **public**: - **Class Level**: Accessible from any other class, regardless
 * of package. - **Member Level**: Accessible from any class, including those in
 * different packages.
 * 
 * 2. **protected**: - **Class Level**: Not applicable; classes cannot be
 * declared as protected. - **Member Level**: Accessible within the same package
 * and by subclasses, even if they are in different packages.
 * 
 * 3. **default** (no modifier): - **Class Level**: Accessible only within
 * classes in the same package; classes cannot be declared with default access
 * if they are top-level classes. - **Member Level**: Accessible only within
 * classes in the same package; not accessible by subclasses in different
 * packages.
 * 
 * 4. **private**: - **Class Level**: Not applicable; classes cannot be declared
 * as private. - **Member Level**: Accessible only within the same class; not
 * accessible by subclasses or other classes in the same package.
 */
/*
 * Key Points:
 * 
 * Top-Level Classes: Only public and default access modifiers are applicable. A
 * top-level class cannot be declared as protected or private.​
 * 
 * Nested Classes: Nested (inner) classes can have all four access modifiers
 * (public, protected, default, and private).​
 * 
 * Inheritance Considerations: The protected modifier allows subclasses, even
 * those in different packages, to access inherited members. In contrast,
 * default access restricts access to within the same package, even for
 * subclasses.
 */