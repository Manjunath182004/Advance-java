package com.tutorusdude.methodoverriding.examples;

public class College {

    public void belongsTo(int marks) {
        if (marks >= 80) {
            System.out.println("You are Belongs To A Section");
        } else {
            System.out.println("You are Belongs To B Section");
        }
    }

    public void resultSendTo(String message) {
        System.out.println("Message: You are Son got 75 % in Exam");
    }
}
