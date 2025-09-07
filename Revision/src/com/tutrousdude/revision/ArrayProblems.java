package com.tutrousdude.revision;

import java.util.Scanner;

public class ArrayProblems {

    public static void main(String[] args) {

        int[] num = {10,20,30,40,50,60,70,80,90,100};

        int resultValue = addNumbers(num);
        System.out.println("Sum of the Numbers:" + resultValue);

        int[] numbers = {1, 3, 2, 5, 2, 6, 7, 4, 1 , 5, 7, 3, 5, 7 ,7, 5, 6, 8, 4, 2};

        int result = occurrenceOfNumbers(numbers , 2);
        System.out.println("Occurrence of No:" + result);

        // checking For Even Or Odd Numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int input = scanner.nextInt();

        if(input % 2 == 0){
            System.out.println("is an Even Number. ");
        }else {
            System.out.println("is an Odd Number. ");
        }

        scanner.close();

    }

    // Sum Of an Array

    public static int addNumbers(int[] num){

        int value = 0;
        for(int i =0; i < num.length; i++){
            value = value + num[i];
        }
        return value;
    }

    // Occurrence of a Numbers

    public static int occurrenceOfNumbers(int[] numbers, int inputvalue){

        int total = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == inputvalue){
                total++;
            }
        }
        return total;
    }
}
