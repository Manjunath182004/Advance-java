package com.tutorusdude.collection.wrapperclass;

import java.util.Iterator;
import java.util.TreeSet;

public class WrapperTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeSet= new TreeSet<String>();

        treeSet.add("HDFC Bank");
        treeSet.add("TCS");
        treeSet.add("Bharati Airtle");
        treeSet.add("ICICI");
        treeSet.add("SBI");
        treeSet.add("JSW");
        treeSet.add("Tata Motors");
        treeSet.add("Tata Steel");
        treeSet.add("Wipro");
        treeSet.add("Bajaj Finance");
        treeSet.add("Axis Bank");
        treeSet.add("IBM");
        treeSet.add("Accenture");
        treeSet.add("Cognizant");
        treeSet.add("Capgemini");
        treeSet.add("BELL");
        treeSet.add("Tech Mahindra");
        treeSet.add("Infotech");
        treeSet.add("HCLtech");
        treeSet.add("Microsoft");


        System.out.println(treeSet);

        treeSet.remove("Infotech");
        treeSet.remove("Tech Mahindra");
        treeSet.remove("HCLtech");
        treeSet.remove("BELL");
        treeSet.remove("Accenture");

        Iterator iterator = treeSet.iterator();

        int count = 0;
        while (iterator.hasNext() && count < 10) {
            System.out.println(iterator.next());
            count++;
        }

        System.out.println(treeSet);

        for(Object obj: treeSet){
            System.out.println(obj);
        }

        treeSet.add("Infosys");
        System.out.println(treeSet);

        boolean contain = treeSet.contains("Abhijeet");
        System.out.println(contain);

        // New Methods

        Object value1 = treeSet.size();
        System.out.println(value1);

        Object value2 = treeSet.isEmpty();
        System.out.println(value2);
    }
}
