package com.tutorusdude.leetcode.binary;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {2,5,7,10,14,20,25};

        System.out.println("Enter a number in given Array: ");
        int key = scanner.nextInt();

        int result = binarySearch(numbers, key);

        if (result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] ==  key){
                return mid;
            }
            if (arr[mid] < key){
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
