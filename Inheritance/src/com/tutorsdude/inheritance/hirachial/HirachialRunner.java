package com.tutorsdude.inheritance.hirachial;

public class HirachialRunner {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.name);

        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.color);

        Lamborghini lamborghini = new Lamborghini();
        System.out.println(lamborghini.brand);

        Bike bike = new Bike();
        System.out.println(bike.color);

        Ktm ktm = new Ktm();
        System.out.println(ktm.model);
        ktm.transport();

        ferrari.color = "black";
        System.out.println(ferrari.color);

        lamborghini.price = 80008789;
        System.out.println(lamborghini.price);
        lamborghini.transport();


    }
}
