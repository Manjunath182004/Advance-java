package com.tutorusdude.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Runner {


    public static void main(String[] args) {

        try{
            doFunction();
        } catch (FileNotFoundException e){
            System.out.println("File not ...");
        } catch (ClassNotFoundException e){
            System.out.println("class not exeption..");
        }
    }

    public static void doFunction() throws FileNotFoundException, ClassNotFoundException{

            FileReader reader = new FileReader("xyz.html");

            Class.forName("xyz.html");
    }
}
