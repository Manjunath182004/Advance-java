package com.tutorusdude.leetcode.patterncheck;

import java.util.Scanner;

public class ReverseDiamondPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number of Rows: ");
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

        for (int i = 2; i <= rows ; i++) {
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
