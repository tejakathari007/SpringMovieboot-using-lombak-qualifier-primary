package com.stackroute.excercise;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String args[]) {
		PalindromeCheck assignment = new PalindromeCheck();
		System.out.println("Enter the input : ");
		Scanner sc = new Scanner(System.in);
		String palindrome = sc.nextLine();
		String result = assignment.isPalindrome(palindrome);// passing input to the method
		System.out.println(result);
		sc.close();

	}

	public String isPalindrome(String inputString) {
		String str = inputString;
		String reverse = "";
		String result = "";
		if (str != "") {
			for (int i = str.length(); i > 0; i--) {
				reverse += str.charAt(i - 1);
				System.out.println(reverse);
			}
			if (reverse.matches(str)) {
				result = "palindrome";
			} else {
				result = "not a palindrome";
			}
		}

		return result;
	}
}