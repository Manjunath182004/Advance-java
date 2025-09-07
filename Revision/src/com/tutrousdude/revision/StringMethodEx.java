package com.tutrousdude.revision;

public class StringMethodEx {
    public static void main(String[] args) {

        // 1st -> contains

        System.out.println("------------contains--------------");

        String value = "Hello World";

        boolean result = value.contains("H");
        System.out.println(result);

        // 2nd -> subString

        System.out.println("------------substring--------------");

        String value1 = "Hello";

        String result1 = value1.substring(0);
        System.out.println(result1);

        // 3rd -> concat

        System.out.println("------------concat--------------");

        String value2 = "Good";

        String result2 = value2.concat("Morning");
        System.out.println(result2);

        // 4th -> endsWith

        System.out.println("------------endsWith--------------");

        String value3 = "Hello";

        boolean result3 = value3.endsWith("o");
        System.out.println(result3);

        // 5th -> contentEquals

        System.out.println("------------contentEquals-------------");

        String value4 = "Hello";

        boolean result4 = value4.contentEquals("Hello");
        System.out.println(result4);

        // 6th -> replace

        System.out.println("------------replace--------------");

        String value5 = "Mosquite are dangerous";

        String result5 = value5.replace("e", "o");
        System.out.println(result5);

        // 7th -> hashCode

        System.out.println("------------hasCode--------------");

        String value6 = "";

        int result6 = value6.hashCode();
        System.out.println(result6);

        // 8th -> equalsIgnoreCase

        System.out.println("------------equalsIgnoreCase-------------");

        String value7 = "Hello";

        boolean result7 = value7.equalsIgnoreCase("hello");
        System.out.println(result7);

        // 9th -> getBytes

        System.out.println("------------getBytes------------");

        String value8 = "Hi Manju";

        byte[] result8 = value8.getBytes();
        System.out.println(result8);

        // 10th -> toString

        System.out.println("------------toString------------");

        String value9 = "Hi Manju";

        String result9 = value9.toString();
        System.out.println(result9);













    }
}
