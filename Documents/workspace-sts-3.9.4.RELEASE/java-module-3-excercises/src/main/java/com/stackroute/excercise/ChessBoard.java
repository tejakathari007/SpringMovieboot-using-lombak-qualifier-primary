package com.stackroute.excercise;

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] output = printingBoard(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }

   public static String[][] printingBoard(int n) {
        String[][] result = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    result[i][j] = "WW|";

                } else {
                    result[i][j] = "BB|";
                }

            }
        }

        return result;

    }

}