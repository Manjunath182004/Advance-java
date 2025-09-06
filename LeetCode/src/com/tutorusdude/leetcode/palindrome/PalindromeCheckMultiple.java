package com.tutorusdude.leetcode.palindrome;

import java.util.Scanner;

public class PalindromeCheckMultiple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a Word or Number (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program. Thank you!");
                break;
            }

            String original = input.toLowerCase();
            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i);
            }

            if (original.equals(reversed)) {
                System.out.println(input + " is a Palindrome");
            } else {
                System.out.println(input + " is Not a Palindrome");
            }
        }

        scanner.close();
    }
}
