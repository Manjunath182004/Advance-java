package com.tutorusdude.methodoverriding.examples;

public class Chicken extends NonVeg {

    @Override
    public void nonVegRate(){
        String typeOfNonVeg = "Chicken";
        int rate = 220;
        int buyRate = 200;
        int profitIgot = rate - buyRate;
        System.out.println("Profit I Got: "+ profitIgot);
        System.out.println("NonVeg:" + typeOfNonVeg + "Rate in Ruppes: " + rate + "i buyRate: " + buyRate);
    }

    @Override
    public void populationInIndia(String bystate, double percentage){
        System.out.println("State: " + bystate + " , " + "percentage: " + percentage);
        System.out.println("this state got maximum by Chicken Non-vegetarian people");
    }
}
