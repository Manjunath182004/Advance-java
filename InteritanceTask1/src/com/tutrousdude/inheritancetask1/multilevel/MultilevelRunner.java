package com.tutrousdude.inheritancetask1.multilevel;

public class MultilevelRunner {
    public static void main(String[] args) {

        Redmi redmi = new Redmi();
        System.out.println(redmi.brand);
        System.out.println(redmi.ramGB);

        Phone phone = new Phone();
        phone.name = "Redmi";
        System.out.println(phone.name);

        phone.uses();
        redmi.phoneUsedFor();
        redmi.whyRedmi();
    }
}
