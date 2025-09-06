package com.tutorusdude.leetcode.sum;

import java.util.Scanner;

public class SumOfArrayByUsingScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a size of Array: ");
        int input = scanner.nextInt();

        int[] numbers = new int[input];
        int sum = 0;

        System.out.println("Enter " + input + " Elements: ");
        for (int i = 0; i < input; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
//        int sum = 0;
//        for (int i = 0; i < input; i++) {
//            sum = sum + numbers[i];
//        }
        System.out.println("Sum of Array Elements : " + sum);
        scanner.close();
    }
}
