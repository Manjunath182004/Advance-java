package com.tutorusdude.collection.wrapperclass;

import java.util.LinkedList;

public class WrapperLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList= new LinkedList<>();

        linkedList.add(12);
        linkedList.add(54);

        System.out.println(linkedList);

       LinkedList<String> linkedList1= new LinkedList<String>();

        linkedList1.add("Manjunath");
        linkedList1.add("Abhijeet");

        Object object1 = linkedList1.size();
        System.out.println(object1);

        System.out.println(linkedList1);


        LinkedList<Boolean> linkedList2= new LinkedList<Boolean>();

        linkedList2.add(true);
        linkedList2.add(false);

        System.out.println(linkedList1);


        LinkedList<Float> linkedList3= new LinkedList<Float>();

        linkedList3.add(3.4f);
        linkedList3.add(9.06f);

        System.out.println(linkedList1);


        LinkedList<Double> linkedList4= new LinkedList<Double>();

        linkedList4.add(33.43424d);
        linkedList4.add(9.06d);

        System.out.println(linkedList1);


        LinkedList<Character> linkedList5= new LinkedList<Character>();

        linkedList5.add('A');
        linkedList5.add('B');

        System.out.println(linkedList5);



//        LinkedList<Byte> linkedList6= new LinkedList<Byte>();
//
//        linkedList6.add(3);
//        linkedList6.add(9);
//
//        LinkedList<Short> linkedList7= new LinkedList<Short>();
//
//        linkedList7.add((short) 233);
//        linkedList7.add((short) 456);
    }
}
