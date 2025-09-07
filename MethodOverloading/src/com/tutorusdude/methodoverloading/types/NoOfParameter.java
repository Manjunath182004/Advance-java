package com.tutorusdude.methodoverloading.types;

public class NoOfParameter {

    public static String details(String name){
        String detailValue = name;
        return detailValue;
    }

    public static String details(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public static String details(String firstName, String lastName, String userName){
        String fullValue = firstName + " " + lastName;
        String finalValue = fullValue + " " + userName;
        return finalValue;
    }
}
