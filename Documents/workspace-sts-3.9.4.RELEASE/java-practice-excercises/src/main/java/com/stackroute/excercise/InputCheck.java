package com.stackroute.excercise;

import java.util.Scanner;

/**
 * to check given input is digit or alphabet or symbol
 *
 */
public class InputCheck {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		InputCheck obj = new InputCheck();
		String input = new String();
		System.out.println("enter a character to be checked");
		input = sc.next();
		String characterIs = new String(obj.check(input));
		System.out.println(characterIs);
	}

	public String check(String input) {
		// CHECKING FOR ALPHABET
		if ((input.charAt(0) >= 65 && input.charAt(0) <= 91) || (input.charAt(0) >= 97 && input.charAt(0) <= 122))
			return "Alphabet";
		// CHECKING FOR DIGITS
		else if (input.charAt(0) >= 48 && input.charAt(0) <= 57)
			return "Digit";
		// OTHERWISE SPECIAL CHARACTER
		else
			return "Special Character";
	}
}
