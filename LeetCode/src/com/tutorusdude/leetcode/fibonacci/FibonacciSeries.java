package com.tutorusdude.leetcode.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();           // this is for user input

        System.out.println("Fibonacci Series up to " + n + " " + " terms: ");

        // initializing 1st 2 fibonacci series numbers
        int first = 0, second = 1;   // where first f(0)=0 & f(1)=1

        // creating for loop for n terms
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " , "); // printing the current term

            int next = first + second ;  // calculating the next term
            first = second;   // first moves one step forward
            second = next;   // second moves one step forward
        }
        scanner.close();  // for closing avoiding the memory leaks
    }
}
