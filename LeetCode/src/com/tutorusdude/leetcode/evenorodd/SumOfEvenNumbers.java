package com.tutorusdude.leetcode.evenorodd;

import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a limit: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }

}
