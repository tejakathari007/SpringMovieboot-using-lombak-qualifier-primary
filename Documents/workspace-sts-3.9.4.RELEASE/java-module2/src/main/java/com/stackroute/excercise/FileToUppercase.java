package com.stackroute.excercise;

import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;

public class FileToUppercase {
	    public static void main(String[] args)  {
	    	        Scanner sc = new Scanner(System.in);
	    	        System.out.println("Enter the file name you want to read");
	    	        String str = sc.nextLine();
	    	        str = "/home/user/" + str;
	    	        FileToUppercase reader = new FileToUppercase();
	    	        reader.readFile(str);
	    	        sc.close();
	    	    }
	    public void readFile(String str) {
	    	try {
	        File file = new File(str);

	        BufferedReader br = new BufferedReader(new FileReader(file));

	        String st;
	        while ((st = br.readLine()) != null) {
	            System.out.println(st.toUpperCase());
	        }
	        br.close();
	       
	    }catch (IOException e) {
	    	System.out.println("File Not Found");
	    	}
	}
}

	