package com.tutorusdude.leetcode.fibonacci;

import java.util.Scanner;

public class FibonacciSeriesMultiple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a Number (or type -1 to quit): ");
            int n = scanner.nextInt();

            if (n == -1){
                System.out.println("Thank you!.. Program is terminated");
                break;
            }

            // initializing first two
            int first = 0;
            int second = 1;

            // applying for loop for n terms
            for (int i = 1; i <=n ; i++) {
                System.out.print(first + " , ");

                int next = first + second;
                first = second;
                second = next;
            }
        }
        scanner.close();
    }

}
