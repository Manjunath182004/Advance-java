package com.tutorusdude.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class RunnerArrayList {

    public static void main(String[] args) {

                ArrayList arrayList= new ArrayList();

                arrayList.add("KTM");
                arrayList.add("Yamaha");
                arrayList.add("Royal Enfield Hunter");
                arrayList.add("MT 15");
                arrayList.add("Bajaj Pulsar");
                arrayList.add("Hero Xtream");
                arrayList.add("Royal Enfield Bullet");
                arrayList.add("Hero Honda");
                arrayList.add("TVS Apache");
                arrayList.add("TVS raider");
                arrayList.add("Honda SP");
                arrayList.add("Splender");
                arrayList.add(2, "TVS Ronin");
                arrayList.add("RX 100");
                arrayList.add(" KTM Duke");
                arrayList.add("Plusar");
                arrayList.add("Dio");
                arrayList.add("Honda shine");
                arrayList.add(null);
                arrayList.add("Kawasaki Ninja");


                System.out.println(arrayList);

                arrayList.remove(3);
                arrayList.remove(1);
                arrayList.remove(2);
                arrayList.remove(4);

                Object value = arrayList.get(3);
                System.out.println(value);

                System.out.println(arrayList.get(4));

                System.out.println(arrayList);

                for(Object obj: arrayList){
                    System.out.println(obj);
                }

                arrayList.add("Kumar naik");
                System.out.println(arrayList);

                boolean contain = arrayList.contains("Abhijeet");
                System.out.println(contain);

                // New Methods

                Object value1 = arrayList.size();
                System.out.println(value1);

                Object value2 = arrayList.isEmpty();
                System.out.println(value2);


    }
}
