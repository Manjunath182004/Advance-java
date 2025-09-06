package com.tutorusdude.collection.wrapperclass;

import java.util.ArrayList;

public class WrapperArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<Integer>();

        arrayList.add(12);
        arrayList.add(54);

        System.out.println(arrayList);

        ArrayList<String> arrayList1= new ArrayList<String>();

        arrayList1.add("Manjunath");
        arrayList1.add("Abhijeet");

        Object object1 = arrayList1.size();
        System.out.println(object1);

        System.out.println(arrayList1);


        ArrayList<Boolean> arrayList2= new ArrayList<Boolean>();

        arrayList2.add(true);
        arrayList2.add(false);

        System.out.println(arrayList2);


        ArrayList<Float> arrayList3= new ArrayList<Float>();

        arrayList3.add(3.4f);
        arrayList3.add(9.06f);

        System.out.println(arrayList3);


        ArrayList<Double> arrayList4= new ArrayList<Double>();

        arrayList4.add(33.43424d);
        arrayList4.add(9.06d);

        System.out.println(arrayList4);


        ArrayList<Character> arrayList5= new ArrayList<Character>();

        arrayList5.add('A');
        arrayList5.add('B');

        System.out.println(arrayList5);



        ArrayList<Byte> arrayList6= new ArrayList<Byte>();

        byte value = 3;
        byte value1 = 9;

        arrayList6.add(value);
        arrayList6.add(value1);

        ArrayList<Short> arrayList7= new ArrayList<Short>();

        arrayList7.add((short) 233);
        arrayList7.add((short) 456);

    }
}
