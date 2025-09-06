package com.tutorusdude.leetcode.binarytodecimal;

import java.util.Scanner;

public class DecimalToBinaryMultiple {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        while (true){

            System.out.println("Enter a number or press -1 to exit: ");
            int number = scanner.nextInt();

            if (number == -1){
                System.out.println("Thank you!... Your exited the program");
                break;
            }

            String binary = Integer.toBinaryString(number);

            System.out.println(number + " " + "is converted to binary" + " " + binary );
        }
        scanner.close();
    }
}
