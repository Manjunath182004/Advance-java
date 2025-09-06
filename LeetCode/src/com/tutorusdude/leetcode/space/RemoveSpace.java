package com.tutorusdude.leetcode.space;

import java.util.Scanner;

public class RemoveSpace {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String input = scanner.nextLine();

        String result = input.replaceAll(" ", "");
        System.out.println("Removed Space in String: " + result);

        scanner.close();
    }
}
