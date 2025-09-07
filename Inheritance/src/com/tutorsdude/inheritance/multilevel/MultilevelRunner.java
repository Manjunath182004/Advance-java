package com.tutorsdude.inheritance.multilevel;

public class MultilevelRunner {
    public static void main(String[] args) {

        Mahindra mahindra = new Mahindra();
        System.out.println(mahindra.color);
        System.out.println(mahindra.size);
        System.out.println(mahindra.numCylinders);

        mahindra.color = "red";
        System.out.println(mahindra.color);
        mahindra.wheels = 6;
        System.out.println(mahindra.wheels);

        Tractor tractor = new Tractor();
        System.out.println(tractor.color);


        new Mahindra();
        new Tractor();


    }
}
