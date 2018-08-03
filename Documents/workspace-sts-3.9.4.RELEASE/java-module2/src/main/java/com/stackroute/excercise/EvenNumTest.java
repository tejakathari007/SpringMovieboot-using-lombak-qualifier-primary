package com.stackroute.excercise;

import java.util.Scanner;

public class EvenNumTest {

	public static void main(String args[]) {
		 try {
			 EvenNumTest assignment = new EvenNumTest();
			   System.out.println("Enter the input : ");
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();
				boolean result = assignment.isEven(input);// passing input to the method
				System.out.println(result);
				sc.close();
		 }
		 catch(Exception e) {
		     System.out.println("Invalid Number");
		 }
		}

	
	public boolean isEven(int number) {
		boolean result = false;
		if(number%2==0) {
			result=true;
		}
		return result;
	}
	}