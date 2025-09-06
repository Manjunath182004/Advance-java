package com.tutorusdude.leetcode.reverse;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        int reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed Number: " + " " + reversed);
        scanner.close();
    }
}
