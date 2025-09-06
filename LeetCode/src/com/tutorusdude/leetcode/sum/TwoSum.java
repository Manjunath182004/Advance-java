package com.tutorusdude.leetcode.sum;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] nums = {2,7,11,15};

        System.out.println("Enter a Target: ");
        int target = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    System.out.println(" [ " + i + " , " + j + " ] ");
                    return;
                }

            }
            
        }
    }
}
