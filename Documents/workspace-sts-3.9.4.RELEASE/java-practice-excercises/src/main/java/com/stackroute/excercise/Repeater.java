package com.stackroute.excercise;

import java.util.Scanner;

/**
 * @author user to add substring to a string
 */
public class Repeater {

	public static void main(String[] args) {
		Repeater obj = new Repeater();
		Scanner sc = new Scanner(System.in);
		// taking input string
		System.out.println("enter a word");
		String key = new String();
		key = sc.next();
		// index from where a substring is extracted
		System.out.println("enter a number to repeate from end");
		int n = sc.nextInt();
		String result = obj.stringRepeater(key, n);
		System.out.println(result);
		// scanner close
		sc.close();
	}

	public String stringRepeater(String key, int n) {
		String rep = key;
		// appending substring to a string
		String repEle = key.substring(key.length() - n, key.length());
		for (int i = 0; i <= n; i++)
			rep += repEle;
		return rep;
	}

}