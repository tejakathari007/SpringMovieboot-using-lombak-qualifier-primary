package com.stackroute.excercise;
import java.util.ArrayList;

import java.util.Scanner;

public class RemoveVowels {
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the number of strings you want to enter");
        int n = sc.nextInt();
        String[] input=new String[n];
        String in;
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the input %d",i+1);
            input[i]=sc.next();
        }
        String[] result = vowelremove(input,n);
        for(int i=0;i<result.length;i++) {
        System.out.println(result[i]);}
    }

    public static String[] vowelremove(String[] input,int n) {
        String[] result=new String[n];
        for(int i=0;i<n;i++) {
        String strOld = input[i];
        String strNew=strOld.replaceAll("[aeiou]","");
        for(int j=1;j<strOld.length();j++) {
            result[i]=strNew;
        }
        }
        return result;
    }
}