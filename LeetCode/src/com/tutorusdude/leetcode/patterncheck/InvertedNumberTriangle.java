package com.tutorusdude.leetcode.patterncheck;

import java.util.Scanner;

public class InvertedNumberTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // applying User Input
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // converting to inverted triangle
        for(int i = number; i >= 1  ; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
