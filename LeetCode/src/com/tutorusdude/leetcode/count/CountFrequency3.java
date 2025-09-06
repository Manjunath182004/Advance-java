package com.tutorusdude.leetcode.count;

import java.util.Scanner;

public class CountFrequency3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int input = scanner.nextInt();

        int[] numbers = new int[input];

        System.out.println("Enter " + input + "Elements: ");
        for (int i = 0; i < input; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter number to count occurrences: ");
        int givenValue = scanner.nextInt();

        int total = 0;
//        for (int i = 0; i < input; i++) {
//            if (numbers[i] == givenValue){
//                total++;
//            }
//        }

        for (int num : numbers){
            if (num == givenValue){
                total++;
            }
        }
        System.out.println("Given " + givenValue + " repeated times " + total);
        scanner.close();
    }
}
