package com.stackroute.excercise;

import java.util.Scanner;

public class ConditionalCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ConditionalCheck assignment = new ConditionalCheck();// declaring an object
		System.out.println("Please Enter a number : ");
		int number1 =sc.nextInt();
		System.out.println("Please Enter a number : ");
		int number2 = sc.nextInt();
		int result = assignment.isConditional(number1,number2);// passing input to the method
		System.out.println("Addition result : "+result);
		sc.close();
		
	}

	public int isConditional(int number1, int number2) {
		int a=number1 ,b=number2,sum;
	     sum=a+b;
		return sum;

	}

}
