package com.tutorusdude.leetcode.patterncheck;

import java.util.Scanner;

public class RightNumberTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        // converting triangle
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
