package com.stackroute.excercise;

import java.util.Scanner;

public class VowelsConsonants {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String result = new String(vowelConsonantCheck(input));
		System.out.println(result);
		sc.close();
	}

	public static String vowelConsonantCheck(String input) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		String result = "";
		int index, presence = 0;
		for (index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			// checking whether the characters are alphabets or not
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

				// checking each character is a vowel or consonant
				for (int i = 0; i < vowels.length; i++) {
					if (ch == vowels[i]) {
						presence = 1;
						break;
					} else
						presence = 0;
				}
				if (presence == 1)
					result += "Vowel";
				else
					result += "Consonant";
			} else
				result += "SYMBOL";
		}
		return result;
	}
}
