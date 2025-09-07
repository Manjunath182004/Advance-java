package com.tutorusdude.methodoverriding.examples;

public class Section extends College {

    @Override
    public void belongsTo(int marks) {
        if (marks >= 90) {
            System.out.println("You are Belongs To Super Merit Section");
        } else if (marks >= 80){
            System.out.println("You are Belongs To A Section");
        } else {
            System.out.println("You are Belongs to B section");
        }
    }

    @Override
    public void resultSendTo(String message) {
        System.out.println(message);
    }
}
