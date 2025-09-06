package com.tutorusdude.leetcode.patterncheck;

import java.util.Scanner;

public class InvertedRightTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");   // replace this with the j for natural numbers
            }
            System.out.println();
        }
        scanner.close();
    }
}
