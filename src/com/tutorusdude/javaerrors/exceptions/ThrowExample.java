package com.tutorusdude.javaerrors.exceptions;

public class ThrowExample {
    public static void main(String[] args) {
        checkAge(20);

    }

    public static void checkAge(int age){
        if(age <= 18){
           throw new ArithmeticException("Access Denied... You must be atleast 18 years old");
        }
        else {
            System.out.println("Access Granted..");
        }
    }
}
