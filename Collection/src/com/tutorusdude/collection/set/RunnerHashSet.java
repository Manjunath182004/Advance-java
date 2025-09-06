package com.tutorusdude.collection.set;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RunnerHashSet {

    public static void main(String[] args) {

                HashSet hashSet= new HashSet();

                hashSet.add(null);
                hashSet.add("Andra pradesh");
                hashSet.add("Arunchal pradesh");
                hashSet.add("Assam");
                hashSet.add("Bihar");
                hashSet.add("Chhatisgarh");
                hashSet.add("Goa");
                hashSet.add("Gujarat");
                hashSet.add("Hariyana");
                hashSet.add("Himachal pradesh");
                hashSet.add("Jharkhand");
                hashSet.add("Karnataka");
                hashSet.add("Kerala");
                hashSet.add("Maharastara");
                hashSet.add("Madhya pradesh");
                hashSet.add("Manipur");
                hashSet.add("Odisha");
                hashSet.add("Punjab");
                hashSet.add("Rajstan");
                hashSet.add("Sikkim");


                System.out.println(hashSet);

                hashSet.remove(3);
                hashSet.remove(1);
                hashSet.remove(2);
                hashSet.remove(4);
                hashSet.remove(5);

                ArrayList arrayList = new ArrayList(hashSet);


                System.out.println(hashSet);

                for(Object obj: hashSet){
                    System.out.println(obj);
                }

                hashSet.add("Tamil Nadu");
                System.out.println(hashSet);

                boolean contain = hashSet.contains("Abhijeet");
                System.out.println(contain);

                // New Methods

                Object value1 = hashSet.size();
                System.out.println(value1);

                Object value2 = hashSet.isEmpty();
                System.out.println(value2);


    }
}
