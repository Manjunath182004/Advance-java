package com.tutorusdude.leetcode.count;

import java.util.Scanner;

public class CountFrequency2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,1,1,12,2,23,3,4,4,45,5,56,6,7,7,8,8,99,9,8,22,2,2,4,56,7,8,9,3,2,6,7,0,0,2,4,5,5,6,3};

        System.out.println("Enter a key: ");
        int key = scanner.nextInt();

        int count = 0;

        for (int sum : numbers){
            if (sum == key){
                count++;
            }
        }
        System.out.println("Element " + key + " appears " + count + " times.");
        scanner.close();
    }

}
