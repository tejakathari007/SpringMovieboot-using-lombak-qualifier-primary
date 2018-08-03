package com.stackroute.excercise;

import java.util.Scanner;

/**
 * @author user to check a given number is palindrome and check sum of even
 *         digits in number
 */

public class Palindrome {
	public static void main(String args[]) {
		Palindrome assignment = new Palindrome();// declaring an object
		System.out.println("Please Enter a number : ");
		int palindrome = new Scanner(System.in).nextInt();// scanning an input from user
		String result = assignment.isPalindrome(palindrome);// passing input to the method
		System.out.println(result);

	}

	public String isPalindrome(int number) {
		int palindrome = number; // copied number into variable
		int reverse = 0;
		int evensum = 0;
		String result;
		while (palindrome != 0) {// checking the number is palindrome or not
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (number == reverse) {
			while (number != 0) {
				int remainder = number % 10;
				if (remainder % 2 == 0) {// checking the number is even or not
					evensum = evensum + remainder;
				}
				number = number / 10;

			}
			result = "The given number is a palindrome and even sum is :" + evensum;
			return result;
		} else
			result = "The given number is not a palindrome";
		return result;
	}

}
