package com.tutorusdude.leetcode.reverse;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        String value = scanner.nextLine();

        String reversed = " ";

        for (int i = value.length()-1 ; i >= 0; i--){
             reversed += value.charAt(i);
        }
        System.out.println("Reversed String Value :" + " " + reversed);
        scanner.close();
    }
}
