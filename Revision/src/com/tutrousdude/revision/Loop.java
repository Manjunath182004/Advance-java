package com.tutrousdude.revision;

public class Loop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60,80, 90, 100};

        System.out.println("--------------From Left To Right---------------");
        for(int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers[i]);
        }

        System.out.println("--------------From Right to Left---------------");

        for (int i = 8; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        System.out.println("--------------From Middle to Left---------------");

        for (int i = 4; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        System.out.println("--------------From Left to Middle--------------");

        for (int i = 0; i <= 5; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("--------------From Skipping one Element--------------");

        for(int i = 0; i < 10; i=i+2){
            System.out.println(numbers[i]);
        }

    }


}
