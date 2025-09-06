package com.tutorusdude.leetcode.patterncheck;

import java.util.Scanner;

public class InvertedCenterTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1 ; i--) {
            for (int j = 1; j <= rows - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
     scanner.close();
    }
}
