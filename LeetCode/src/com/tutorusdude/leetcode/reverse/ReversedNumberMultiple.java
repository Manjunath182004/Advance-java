package com.tutorusdude.leetcode.reverse;

import java.util.Scanner;

public class ReversedNumberMultiple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a Number or press -1 to exit: ");
            int number = scanner.nextInt();

            if (number == -1){
                System.out.println("Thank you!...program terminated");
                break;
            }

            int reversed = 0;

            while (number != 0){
              int digit = number % 10;
              reversed = reversed * 10 + digit;
              number = number/10;
            }
            System.out.println("Reveresed Number: " + reversed);
        }
        scanner.close();
    }
}
