package com.stackroute.excercise;

import java.util.Scanner;

public class Grades {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		try {
			System.out.println("Enter number of students: ");
			int n = sc.nextInt();
			int grade[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the grade for student " + (i + 1) + ":");
				grade[i] = sc.nextInt();
			if(!(grade[i]>=0&&grade[i]<=100)) {
				 throw new ArithmeticException("not valid");  	
			}
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		}

	}

