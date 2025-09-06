package com.tutorusdude.leetcode.sum;

import java.util.Scanner;

public class SumOfArrayElements {

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6,7,8,9,10};

        int result = calSum(values);
        System.out.println("Sum of Given Elements in Array: " + result);
    }

    public static int calSum(int[] numbers){

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }
}
