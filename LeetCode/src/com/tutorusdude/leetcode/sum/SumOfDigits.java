package com.tutorusdude.leetcode.sum;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numbers = scanner.nextInt();

        int sum = 0;
        while (numbers != 0){
            int digit = numbers % 10;
            sum += digit; // in this place if u apply the sum = sum * 10 + digit this will reverse of given number
            numbers = numbers / 10;
        }
        System.out.println("Sum of the digits: " + sum);
    }
}
