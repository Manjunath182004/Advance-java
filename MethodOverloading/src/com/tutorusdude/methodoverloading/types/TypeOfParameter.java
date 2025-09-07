package com.tutorusdude.methodoverloading.types;

public class TypeOfParameter {

    public static int group(int groupNo){

        if (groupNo == 1) {
            System.out.println("you are Belongs Group A");
        } else {
            System.out.println("you are belongs group B");
        }
        return 0;
    }

    public static int group(String age) {

        if (age == "18") {
            System.out.println("You re eligible to vote india");
        } else {
            System.out.println("you re not eligible to vote in India");
        }
        return 0;
    }

    public static int group(char grade){

        if (grade == 'A'){
            System.out.println("You r in Section A");
        } else {
            System.out.println("You r in Section B");
        }
        return 0;
    }
}
