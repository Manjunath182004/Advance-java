package com.tutorusdude.leetcode.patterncheck;

import java.util.Scanner;

public class BoxShapePattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number of rows & coloums : ");
        int rows = scanner.nextInt();
        int coloums = scanner.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= coloums ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
