package com.tutorusdude.leetcode.patterncheck;

import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number of Rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");                 // replace with j we get natural numbers
            }
            System.out.println();
        }
        scanner.close();
    }
}
