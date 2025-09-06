package com.tutorusdude.leetcode.reverse;

import java.util.Scanner;

public class ReverseStringMultiple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter a value or press to exit: ");
            String value = scanner.nextLine();

            if ( value.equalsIgnoreCase("exit")){
                System.out.println("Program terminated..........");
                break;
            }

            String reversed = "";

            for (int i = value.length()-1; i >= 0; i--) {
                reversed += value.charAt(i);
            }
            System.out.println("reversed String Value: " + " " + reversed);
        }
        scanner.close();
    }
}
