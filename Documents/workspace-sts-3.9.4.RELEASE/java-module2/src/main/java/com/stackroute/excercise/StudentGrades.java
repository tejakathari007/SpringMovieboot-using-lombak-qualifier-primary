package com.stackroute.excercise;

import java.util.Scanner;

public class StudentGrades {
	public static void main(String args[]) {
		try {
			StudentGrades assignment = new StudentGrades();
			System.out.println("Enter number of students: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int grade[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the grade for student " + (i + 1) + ":");
				grade[i] = sc.nextInt();
			}
			  System.out.println("The average is  : "+assignment.Average(grade, n));
	            System.out.println("The Minimum Score is: "+assignment.Minimum(grade, n));
	            System.out.println("The Maximum Score is: "+assignment.Maximum(grade, n));
	            sc.close();
		} catch (Exception e) {
			System.out.println("Invalid Number");
		}
	}

	public double Average(int grade[],int n) {

		  double avg;
		    double temp=0;
		    for(int i=0;i<n;i++)
		    {
		    temp +=grade[i];
		    }
		    avg=temp/n;
		   return avg;
		}
	
	 public int Minimum(int[] grade,int n)
		    {
		        int min = grade[0];
		        for(int i=0;i<n;i++)
		        {
		        if(grade[i]<min)
		        {
		            min=grade[i];
		        }
		        }
		        return min;
		}
	
  public int Maximum(int[] grade,int n)
		    {
		        int max = grade[0];
		    for(int i=0;i<n;i++)
		    {
		    if(grade[i]>max)
		    {
		        max=grade[i];
		    }
		    }
		   return max;
	}
}
