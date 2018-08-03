package com.stackroute.excercise;

import java.util.Scanner;

/**
 * @author user to print numbers from 1 to given range
 */
public class NumberLoop {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// taking range from user
		System.out.println("enter the range");
		int range = sc.nextInt();
		NumberLoop obj = new NumberLoop();
		String result = new String(obj.loopCreator(range));
		System.out.println(result);
		// scanner closed
	}

	public String loopCreator(int range) {
		// loop to print numbers till given range
		String loop = new String();
		for (int i = 1; i <= range; i++) {
			for (int j = 1; j <= i; j++) {
				loop += i;
			}
		}
		return loop;
	}
}