package com.tutorusdude.leetcode.count;


import java.util.Scanner;

public class CountFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = {1, 4, 5, 2, 6, 2, 5, 8, 9, 8, 9, 6, 4, 6,73, 2,5 ,7, 9,0,3,4,6,7 , 8,8,7,78, 7,6 };
        System.out.println("Enter a key number: ");
        int key = scanner.nextInt();
        int result = findOccur(values, key);
        System.out.println("Given number " + key + " Repeated times: " + result );
    }
    public static int findOccur(int[] numbers, int givenValue){

        int total = 0;
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == givenValue){
                total++;
            }
        }
        return total;
    }
}
