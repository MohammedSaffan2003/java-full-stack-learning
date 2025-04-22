package com.a;
/*
 * Bank has made mandate to open an account using aadhaar card. this decision of
 * bank has created has issue for its customer. You being an object orientors,
 * try to resolve this issue, by creating polymorphic code
 */

import java.util.Scanner;

class IdProof {
	boolean isValid(int num) {
		if (num > 0)
//			System.out.println("Valid ID");
			return true;
		else
//			System.out.println("Invlaid ID");
			return false;

	}
}

class Aadhaar extends IdProof {
	@Override
	boolean isValid(int num) {
		if (num > 0 && num < 200)
//			System.out.println("Valid Aadhaar");
			return true;

		else
//			System.out.println("Invalid Aadhaar");
			return false;

	}
}

class VoterID extends IdProof {

	@Override
	boolean isValid(int num) {
		if (num > 200 && num < 300)
//			System.out.println("Vlaid voter");
			return true;

		else
//			System.out.println("Invalid voter");
			return false;

	}
}

class PanCard extends IdProof {
	@Override
	boolean isValid(int num) {
		if (num > 300 && num < 400)
//			System.out.println("Vlaid PanCard");
			return true;

		else
//			System.out.println("Invalid PanCard");
			return false;

	}
}

public class BankOfInia {
	void createAcc(IdProof id, int num) {
		if (id.isValid(num))
			System.out.println("Account Created");
		else
			System.out.println("Invalid Aadhaar ID ");

	}

	void eKYC(IdProof id, int num) {
		if (id.isValid(num))
			System.out.println("KYC completed");
		else
			System.out.println("Invalid Voter ID ");

	}

	void generateTax(IdProof id, int num) {
		if (id.isValid(num))
			System.out.println("Tax File generated");
		else
			System.out.println("Invalid PAN ID ");
	}

	public static void main(String[] args) {

		IdProof id = null;
		BankOfInia bank = new BankOfInia();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1-> Open Account [Aadhaar number]\n2-> To perform e-KYC [Voter ID]\n3-> Generate Tax file [PAN number]");
		int option = sc.nextInt();
		System.out.println("Enter your ID number ");
		int num = sc.nextInt();
		switch (option) {
		case 1:
			id = new Aadhaar();
			bank.createAcc(id, num);
			break;
		case 2:
			id = new VoterID();
			bank.eKYC(id, num);
			break;
		case 3:
			id = new PanCard();
			bank.generateTax(id, num);
			break;
		default:
			System.out.println("Invalid option!");
			break;
		}
		sc.close();

	}

}