package com.tutorusdude.javaerrors.exceptions;

public class Examples {

    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException

        try{
            int[] values = {1,2,3};
            System.out.println(values[10]);

            Class.forName("com.tutorusdude.javaerrors.exceptions.ThrowExample");

            int a = 20;
            int b = 0;
            int divide = a/b;
            System.out.println(divide);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something Went Wrong!...ArrayIndexOutOfBoundsException");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Something Went Wrong");
        }
        catch (ArithmeticException e) {
            System.out.println("Something Went Wrong!.. Can't Divide a number By Zero");
        }

        // ClassNotFoundException

        try{
        Class.forName("com.tutorusdude.javaerrors.exceptions.ThrowExample");
            System.out.println("Class Name Is Exits");
        }
        catch (Exception e){
            System.out.println("Something Went Wrong");
        }

//        // ArithmeticException
//
//        try{
//            int a = 20;
//            int b = 0;
//            int divide = a/b;
//            System.out.println(divide);
//        }
//        catch (Exception e){
//            System.out.println("Something Went Wrong!.. Can't Divide a number By Zero");
//        }
//
//        // StringIndexOutOfBound Exception
//
//        try{
//            String name = "Manjunatha";
//            char point = name.charAt(10);
//            System.out.println(point);
//
//        }
//        catch (Exception e){
//            System.out.println("Something Went Wrong!..StringIndexOutOfBound Exception");
//        }
//
//        // NumberFormatException
//
//        try{
//            int a = Integer.parseInt("Abhijeet");
//            System.out.println(a);
//        }
//        catch (Exception e){
//            System.out.println("Something Went Wrong!...NumberFormatException");
//        }
    }
}
