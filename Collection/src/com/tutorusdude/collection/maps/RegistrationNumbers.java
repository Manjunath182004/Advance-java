package com.tutorusdude.collection.maps;

import java.util.HashMap;

public class RegistrationNumbers {

    public static void main(String[] args) {

        HashMap<String, String> registrationNo = new HashMap<String, String>();

        System.out.println("-----------------Student Details------------------");

        registrationNo.put("3NG21CS022", "L MANJUNATHA");
        registrationNo.put("3NG21CS001", "ABHIJEET");
        registrationNo.put("3NG21CS020", "KALINGA");
        registrationNo.put("3NG21CS030", "SIDDALINGA");
        registrationNo.put("3NG21CS015", "KEERTHI");
        registrationNo.put("3NG21CS017", "JAKIYA");
        registrationNo.put("3NG21CS019", "ANUSHREE");
        registrationNo.put("3NG21CS032", "VANITHA");
        registrationNo.put("3NG21CS023", "KARTHIK");
        registrationNo.put("3NG21CS005", "ANIKET");

        System.out.println(registrationNo);

        for (String s : registrationNo.values()){
            System.out.println(s);
        }

        for (String k : registrationNo.keySet()){
            System.out.println(k);
        }

        HashMap<Integer, String> registrationNo1 = new HashMap<Integer, String>();

        System.out.println("-----------------Village Details------------------");

        registrationNo1.put(583214, "Hampasagara");
        registrationNo1.put(583123, "Toranagallu");
        registrationNo1.put(583227, "Gangavathi");
        registrationNo1.put(591237, "Nippani");
        registrationNo1.put(591219, "Galataga");
        registrationNo1.put(583119, "Sandur");

        System.out.println(registrationNo1);

        for (String s : registrationNo1.values()){
            System.out.println(s);
        }

        for (Integer k : registrationNo1.keySet()){
            System.out.println(k);
        }

        System.out.println("-----------------Country Code------------------");

        HashMap<Short, String> registrationNo2 = new HashMap<Short , String>();

        registrationNo2.put((short) 91, "India");
        registrationNo2.put((short) 98, "Iran");
        registrationNo2.put((short) 81, "Japan");
        registrationNo2.put((short) 880, "Bangaladesh");
        registrationNo2.put((short) 61, "Australia");
        registrationNo2.put((short) 1, "Canada");

        System.out.println(registrationNo2);

        for (String s : registrationNo2.values()){
            System.out.println(s);
        }

        for (Short k : registrationNo2.keySet()){
            System.out.println(k);
        }

        System.out.println("-----------------Sections------------------");

        HashMap<Character, String> registrationNo3 = new HashMap<Character , String>();

        registrationNo3.put('A', "85-100");
        registrationNo3.put('B', "75-84");
        registrationNo3.put('C', "65-74");
        registrationNo3.put('D', "35-64");

        System.out.println(registrationNo3);

        for (String s : registrationNo3.values()){
            System.out.println(s);
        }

        for (Character k : registrationNo3.keySet()){
            System.out.println(k);
        }


        // NEW METHODS

        System.out.println(registrationNo.getOrDefault("3NG21CS043", "MANJU"));

        System.out.println(registrationNo.toString());


    }
}
