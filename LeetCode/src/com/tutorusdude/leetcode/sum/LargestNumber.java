package com.tutorusdude.leetcode.sum;

public class LargestNumber {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest number in the array: " + largest);
    }
}
