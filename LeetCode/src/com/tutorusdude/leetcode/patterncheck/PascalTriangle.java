package com.tutorusdude.leetcode.patterncheck;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i ; j++) {
                System.out.print(" ");
            }

            int num =  1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
        scanner.close();

    }
}
