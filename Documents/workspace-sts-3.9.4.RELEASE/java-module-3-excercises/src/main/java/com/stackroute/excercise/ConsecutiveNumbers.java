package com.stackroute.excercise;

import java.util.Scanner;

public class ConsecutiveNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		ConsecutiveNumbers assignment = new ConsecutiveNumbers();
		System.out.println("Enter the values");
		String input = sc.nextLine();
		String result = assignment.isCheck(input);
 	System.out.println(result);
	}

	public String isCheck(String in) {
		String input = in;
		String result = "not Consecutive numbers";
		String[] part = input.split(",");
		for (int i = 0; i < part.length-1; i++) {
			int out = Integer.valueOf(part[i]);
			int res=Integer.valueOf(part[i+1]);
			if (res == (out+1)) {
				result = "Consecutive numbers";
			}

		}
		return result;
	}
}
