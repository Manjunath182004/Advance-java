package com.tutorusdude.methodoverriding.examples;

public class NonVeg {

    public void nonVegRate(){
        String typeOfNonVeg = "Chicken";
        int rate = 220;
        int buyRate = 200;
        System.out.println("NonVeg:" + typeOfNonVeg + "," + "Rate in Ruppes: " + rate +  "," + "i buyRate: " + buyRate);
    }

    public void populationInIndia(String bystate, double percentage){
        System.out.println("State: " + bystate + " , " + "percentage: " + percentage);
        System.out.println("this state got maximum by Non-vegetarian people");
    }
}
