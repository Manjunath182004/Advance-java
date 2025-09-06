package com.tutorusdude.collection;

import java.util.LinkedList;

public class RunnerLinkedList {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add("Abhijeet");
        linkedList.add("Manjunath");
        linkedList.add("Kalinga");
        linkedList.add("Siddu");
        linkedList.add("Jakiya");
        linkedList.add("Vanitha");
        linkedList.add("Keerthi");
        linkedList.add("Anushree");
        linkedList.add(5000);
        linkedList.add(5.6f);
        linkedList.add(6.66d);
        linkedList.add('A');
        linkedList.add(2, "Banana");
        linkedList.add(300);
        linkedList.add(600);
        linkedList.add("Cherry");
        linkedList.add("Chocalate");
        linkedList.add(true);
        linkedList.add(null);
        linkedList.add("GVT");


        System.out.println(linkedList);

        linkedList.remove(3);
        linkedList.remove(1);
        linkedList.remove(2);
        linkedList.remove(4);

        Object value = linkedList.get(3);
        System.out.println(value);

        System.out.println(linkedList.get(4));

        System.out.println(linkedList);

        for(Object obj: linkedList){
            System.out.println(obj);
        }

        linkedList.addFirst("Kumar naik");
        System.out.println(linkedList);

        boolean contain = linkedList.contains("Abhijeet");
        System.out.println(contain);

        // New Methods

        Object value1 = linkedList.peekLast();
        System.out.println(value1);

        Object value2 = linkedList.size();
        System.out.println(value2);

        System.out.println(linkedList.getFirst());

    }
}
