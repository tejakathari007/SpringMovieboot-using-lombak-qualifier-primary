package com.stackroute.excercise;

public class Factorial {
	public static void main(String args[]) {
		int i, fact = 1;
		int number = 1000;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
			if ((fact <= Integer.MAX_VALUE) && fact > 0) {
				System.out.println("factorial of " + i + " is " + fact);

			} else {
				System.out.println("factorial of " + i + " is out of range");
				break;
			}
		}
		
	}
}
