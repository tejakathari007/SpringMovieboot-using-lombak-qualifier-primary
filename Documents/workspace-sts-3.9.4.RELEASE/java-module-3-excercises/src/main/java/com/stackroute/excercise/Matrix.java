package com.stackroute.excercise;

import java.util.Scanner;

public class Matrix {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		try {
			Matrix assignment = new Matrix();
			System.out.println("Input number of rows of matrix: ");
			int rows = sc.nextInt();
			System.out.println(" Input number of columns of matrix: ");
			int columns = sc.nextInt();
			int[][] a = new int[rows][columns];
			int[][] b = new int[rows][columns];
			System.out.println("Input elements of first matrix: ");
			int i, j;
			for (i = 0; i < rows; i++) {
				for (j = 0; j < columns; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Input elements of second matrix: ");
			for (i = 0; i < rows; i++) {
				for (j = 0; j < columns; j++) {
					b[i][j] = sc.nextInt();
				}
			}
		int[][] c=assignment.matrixAdd(a, b, rows, columns);
			for (i = 0; i < rows; i++) {
				for (j = 0; j < columns; j++) {
					System.out.print(c[i][j]+"\t");
					
					
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Invalid");
		}

	}

	public int [][] matrixAdd(int a[][], int b[][], int rows, int columns) {
		int[][] c = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}

		
	}
		return c;
	}
}
