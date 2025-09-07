package com.tutrousdude.revision;

public class ClassAndObjects {

    String carName;
    String colour;
    int prize;

    public static void carName(String carName){
        System.out.println("Car Name:" + carName);
    }

    public void colour(String colour){
        System.out.println("Car colour:" + colour);
    }

    public void prize(int prize){
        System.out.println("car prize: " + prize);
    }

    public static void main(String[] args) {

        carName("Innova");

        ClassAndObjects value = new ClassAndObjects();

        value.colour("White");
        value.prize(2000);

    }

}
