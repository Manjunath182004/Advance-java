package com.tutorsdude.inheritance.multiple;

public class MultipleRunner {
    public static void main(String[] args) {

        Designer designer = new Designer();
        System.out.println(designer.name);

        Programmer programmer = new Programmer();
        System.out.println(programmer.name);
        System.out.println(programmer.salary);

        Developer developer = new Developer();
        System.out.println(developer.name);

        developer.salary = 50000;
        System.out.println(developer.salary);
    }
}
