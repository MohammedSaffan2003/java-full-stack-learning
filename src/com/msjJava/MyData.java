package com.msjJava;

public class MyData {

	// Different formats to write main method
//	static public void main()(String[] args)
//	public static void main()(String args[])
	public static void main(String... args) {
		// TODO Auto-generated method stub
//		long a = 9223372036854775807L;
//		float a = 45f;
//		int a = 45;
//		a = 045; // Octal - decimal =37
//		a = 0x45; // Hex Decimal - decimal =69
//		a = 0x41;
//		System.out.println(a);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);

		// ------ Decimal to Octal
//		int a = 85, oct = 0, rev = 0;
//		while (a > 0) {
//			oct = oct * 10 + a % 8;
//			a = a / 8;
//			rev = oct / 10 + rev * 10;
//		}
//		String str = String.valueOf(oct);
//		System.out.print("0");
//		for (int i = str.length() - 1; i >= 0; i--)
//			System.out.print(str.charAt(i));
//
//		int x = 95;
//		int y = ++x + x-- + x-- + ++x;
//		System.out.print(x + " " + y);

		// ----- ASCII
//		for (int i = 65; i <= 90; i++) {
//
//			System.out.printf("%c %c  ", i, i + 32);
//			if (i == 77)
//				System.out.println();
//		}
//		System.out.println();
//		for (char i = 97; i <= 122; i++)
//			System.out.printf("%c ", i);

		// ----- Universal Code -> UNICODE - 65536 symbols -> 0 to 65535
		//I18n -> Internationalization . This that supports many languages. 
//		char aa = '\u0C85';
//		System.out.println(aa);
//		System.out.println('\u06BA');
//		System.out.println('\u062A');
//		System.out.println('\uCB85');
		// Kannada Alphabets
//		for (char c = '\u0C85'; c <= '\u0Cb9'; c++)
//			System.out.print(c + " ");
//		System.out.println();
//		// Tamil Alphabets
//		for (char c = '\u0B85'; c <= '\u0Bfa'; c++)
//			System.out.print(c + " ");

		// Increment/Decrement snippet
		double m = 10, n = 10;
		double res = m++ / (++n * n--) / --m;
		System.out.println(res);
		System.out.println(n + " " + m);

	}


}
