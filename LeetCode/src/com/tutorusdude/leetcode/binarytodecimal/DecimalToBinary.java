package com.tutorusdude.leetcode.binarytodecimal;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input  from the User
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        // converting to binary
        String binary = Integer.toBinaryString(number);
        
        int countOnes = 0;
        int countZeros = 0;

        for (char ch : binary.toCharArray()){
            if (ch == '0'){
                countOnes++;
            } else if (ch == '1'){
                countZeros++;
            }
        }

        // getting the result
        System.out.println(number + " " + "is converted binary" + " " + binary);
        System.out.println("Number of 0's: " + countZeros);
        System.out.println("Number of 1's: " + countOnes);

        scanner.close();
    }
}
