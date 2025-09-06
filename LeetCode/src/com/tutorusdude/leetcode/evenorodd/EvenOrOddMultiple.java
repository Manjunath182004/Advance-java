package com.tutorusdude.leetcode.evenorodd;

import java.util.Scanner;

public class EvenOrOddMultiple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter a number or press -1 to exit : ");
            int number = scanner.nextInt();

            if (number == -1){
                System.out.println("Thank you!... Program is terminated");
                break;
            }

            if (number % 2 == 0){
                System.out.println(number + " " + " is a even");
            } else {
                System.out.println(number + " " + " is a odd");
            }
        }
        scanner.close();

    }
}
