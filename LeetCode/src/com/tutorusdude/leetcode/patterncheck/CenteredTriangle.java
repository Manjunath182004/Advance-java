package com.tutorusdude.leetcode.patterncheck;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class CenteredTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number of Rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows ; i++) {
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
