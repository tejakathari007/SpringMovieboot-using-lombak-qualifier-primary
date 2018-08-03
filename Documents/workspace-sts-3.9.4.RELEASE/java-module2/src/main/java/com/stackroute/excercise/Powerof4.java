package com.stackroute.excercise;

import java.util.Scanner; 

public class Powerof4 {
	
   /**
 * @param args
 */
	
public static void main(String args[]) {
	   Powerof4 assignment = new Powerof4();
	   System.out.println("Enter the input : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String result = assignment.isPowerOf4(input);// passing input to the method
		System.out.println(result);
		sc.close();  
   }

/**
 * @param Inputnumber
 * @return result
 * @Check the power of 4
 * 
 */
public String isPowerOf4(int Inputnumber) {
	int Number = Inputnumber;
	String result="not a power of 4";
	double i= Math.log(Number)/Math.log(4);
	if(i==(int)i) {
		result="power of 4";
	}
	return result;
}
}