package com.tutorsdude.inheritance.hybrid;

public class HybridRunner {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        System.out.println(laptop.name);
        laptop.color = "red";
        System.out.println(laptop.color);

        ElectronicDevice electronicDevice = new ElectronicDevice();
        System.out.println(electronicDevice.name);

        electronicDevice.color = "blue";
        System.out.println(electronicDevice.color);

        Computer computer = new Computer();
        System.out.println(computer.name);
        
    }
}
