package com.tutorsdude.inheritance.single;

public class TestRunner {
    public static void main(String[] args) {

        Mango mango = new Mango();
        System.out.println(mango.color);
        mango.color = "red";
        System.out.println(mango.color);

        mango.growsIn();
        mango.taste();


    }
}


