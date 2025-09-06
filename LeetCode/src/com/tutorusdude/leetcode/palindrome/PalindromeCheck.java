package com.tutorusdude.leetcode.palindrome;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number or Word: ");
        String input = scanner.nextLine();

        String original = input.toLowerCase();
        String reversed = "";

        for ( int i = original.length()-1 ; i >= 0; i--){
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)){
            System.out.println(input + " " + "is a Palindrome");
        } else {
            System.out.println(input + " " + "is Not a Palindrome");
        }
        scanner.close();
    }
}
