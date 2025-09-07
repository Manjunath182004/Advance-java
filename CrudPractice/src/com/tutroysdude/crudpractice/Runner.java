package com.tutroysdude.crudpractice;

public class Runner {

    public static void main(String[] args) {

        System.out.println("----------For Creating and Reading an Operations---------");

        Values newValue = new Values();

        newValue.create("Manjunath");
        newValue.create("Abhijeet");
        newValue.create("kalinga");
        newValue.create("");
        newValue.create("pv");

        System.out.println(newValue);

        String[] readAll = newValue.read();

        for (int i = 0; i < readAll.length; i++) {
            System.out.println(readAll[i]);
        }

        System.out.println("------------For Update Operations-----------");

        boolean updatedValue = newValue.update("Manjunath", "Vignesh");
        boolean updatedValue1 = newValue.update("pv" , "Adarsh");

        System.out.println(updatedValue1);
        System.out.println(updatedValue);

        System.out.println("------------For Delete Operations-----------");

        boolean deletedValue = newValue.delete("Vignesh");
        boolean deletedValue1 = newValue.delete("Kalinga");

        System.out.println(deletedValue);
        System.out.println(deletedValue1);

        System.out.println("------------For Find Operations-----------");

        boolean findedValue = newValue.find("kalinga");

        System.out.println(findedValue);
    }
}
