package com.stackroute.excercise;

import java.util.Random;
import java.util.Scanner;

/**
 * @author To guess a number generated randomly
 */
public class GuessANumber {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Random rand = new Random();
		// locking random number
		int key = rand.nextInt(50);
		System.out.println("enter a number");
		int guess = 0;
		// loop till guess matches
		while (key != guess) {
			guess = sc.nextInt();
			String result = new String(randomGuess(key, guess));
			System.out.println(result);
		}
		sc.close();
	}

	// to print the comparision
	public static String randomGuess(int key, int guess) {
		String result = "";
		// boolean bool = true;
		do {
			if (guess > key)
				result += "Number guessed is more than original number";
			else if (guess < key)
				result += "Number guessed is less than original number";
			else if (guess == key)
				result += "Number guessed matches the original number";
			return result;
		} while (key != guess);

	}
}