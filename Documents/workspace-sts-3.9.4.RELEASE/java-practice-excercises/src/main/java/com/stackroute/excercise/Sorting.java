package com.stackroute.excercise;

import java.util.Scanner;

/**
 * sorting digits of an array
 *
 */
public class Sorting {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Sorting obj = new Sorting();
		System.out.println("enter number to sorted");
		int key = sc.nextInt();
		int sortedKey = obj.sort(key);
		System.out.print(sortedKey);
		System.out.println();
		int evenSum = obj.evenSum(key);
		System.out.println(evenSum);
		boolean fifteen = obj.checkSum(evenSum);
		System.out.println(fifteen);
	}

	// check for even sum
	public boolean checkSum(int evenSum) {
		if (evenSum > 15)
			return true;
		return false;
	}

	// calculating sum of even digits
	public int evenSum(int key) {
		int temp = key;
		int sum = 0;
		while (temp != 0) {
			int rem = temp % 10;
			temp = temp / 10;
			if (rem % 2 == 0)
				sum += rem;
		}
		return sum;
	}

	public int sort(int key) {
		int arr[] = new int[(int) (Math.log10(key) + 1)];
		int temp = key;
		int i = 0, num = 0;
		// reversing a number
		while (temp != 0) {
			int rem = temp % 10;
			temp = temp / 10;
			arr[i] = rem;
			i++;
		}
		// sorting array
		int n = arr.length;
		for (int x = n - 1; x >= 0; x--) {
			for (int y = i - 1; y >= 0; y--)
				if (arr[x] > arr[y]) {
					temp = arr[y];
					arr[y] = arr[x];
					arr[x] = temp;
				}
		}
		// array to number
		for (i = 0; i < arr.length; i++) {
			num = num * 10 + arr[i];
		}

		return num;
	}

}