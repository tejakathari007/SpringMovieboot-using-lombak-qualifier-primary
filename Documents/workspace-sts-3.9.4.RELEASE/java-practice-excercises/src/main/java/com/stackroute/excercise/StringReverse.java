package com.stackroute.excercise;

import java.util.Scanner;

/**
 * @author user reversing a string
 */
public class StringReverse {

	public static void main(String[] args) {

		StringReverse obj = new StringReverse();
		Scanner sc = new Scanner(System.in);
		// taking input to reverse
		System.out.println("enter a word to reverse");
		String key, rev = new String();
		key = sc.next();
		rev = obj.reverse(key);
		System.out.println(rev);
		// scanner close
		sc.close();
	}

	public String reverse(String key) {
		// loop to reverse the string
		String rev = new String();
		int len = key.length();
		for (int i = 0; i < len; i++) {
			rev += key.charAt(len - 1 - i);
		}
		return rev;
	}
}