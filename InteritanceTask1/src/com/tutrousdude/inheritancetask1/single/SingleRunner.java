package com.tutrousdude.inheritancetask1.single;

public class SingleRunner {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.name = "Dell";
        laptop.prize = 50000;
        laptop.ram = 258;
        laptop.colour = "Silver";
        System.out.println(laptop.name);
        System.out.println(laptop.prize);
        System.out.println(laptop.ram);
        System.out.println(laptop.colour);


        laptop.applications();
        laptop.laptopUses();
    }
}
