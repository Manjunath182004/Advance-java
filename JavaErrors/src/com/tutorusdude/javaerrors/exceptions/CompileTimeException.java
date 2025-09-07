package com.tutorusdude.javaerrors.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CompileTimeException {

    public static void main(String[] args) {

        try{
            compileTimeException();

        } catch (MalformedURLException e){
            System.out.println("Invalid URL or URL format");

        } catch (ParseException e) {
            System.out.println("Invalid date or format od date..");

        } catch (FileNotFoundException e) {
            System.out.println("Given file is not found..");

        } catch (ClassNotFoundException e){
            System.out.println("Given Class Not found....");

        } catch (NoSuchMethodException e){
            System.out.println("Given method not exits...");
        }


    }

    public static void compileTimeException() throws MalformedURLException, ParseException,
            FileNotFoundException, ClassNotFoundException, NoSuchMethodException {

//        try{
            URL url = new URL("htp:/google.com");

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            dateFormat.parse("32/13/2025");

            FileReader fileReader = new FileReader("abc.txt");

            Class.forName("MyClassName");

            String s = "Java";
            s.getClass().getMethod("MyCalss");

//        } catch (MalformedURLException e){
//            System.out.println("Invalid URL or URL format");
//
//        } catch (ParseException e){
//            System.out.println("Invalid date or format od date..");
//
//        } catch (FileNotFoundException e){
//            System.out.println("Given file is not found..");
//
//        } catch (ClassNotFoundException e){
//            System.out.println("Given Class Not found....");
//
//        } catch (NoSuchMethodException e){
//            System.out.println("Given method not exits...");
//        }

    }
}
