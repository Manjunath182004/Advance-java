package com.tutorusdude.collection.wrapperclass;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class WrapperLinkedhashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("Iron Man");
        linkedHashSet.add("The Incredible Hulk");
        linkedHashSet.add("Iron Man 2");
        linkedHashSet.add("Thor");
        linkedHashSet.add("Captain Amarica");
        linkedHashSet.add("The Avengers");
        linkedHashSet.add("Iron Man 3");
        linkedHashSet.add("Thor: The Dark World");
        linkedHashSet.add("Captain Amarica: The Winter Soldier");
        linkedHashSet.add("Guardians of Galaxy");
        linkedHashSet.add("Avengers age of Ultron");
        linkedHashSet.add("Ant-Man");
        linkedHashSet.add("Captain Amarica: Civil War");
        linkedHashSet.add("Doctor Strange");
        linkedHashSet.add("Spider Man");
        linkedHashSet.add("Thor: Rongork");
        linkedHashSet.add("Black Panther");
        linkedHashSet.add("Avengers: Infinity War");
        linkedHashSet.add(null);
        linkedHashSet.add("Captain Marvel");


        System.out.println(linkedHashSet);

        linkedHashSet.remove(3);
        linkedHashSet.remove(1);
        linkedHashSet.remove(2);
        linkedHashSet.remove(4);
        linkedHashSet.remove(6);

        Iterator iterator = linkedHashSet.iterator();

        int count = 0;
        while (iterator.hasNext() && count < 10) {
            System.out.println(iterator.next());
            count++;
        }

        System.out.println(linkedHashSet);

        for(Object obj: linkedHashSet){
            System.out.println(obj);
        }

        linkedHashSet.add("Infinity War");
        System.out.println(linkedHashSet);

        boolean contain = linkedHashSet.contains("Abhijeet");
        System.out.println(contain);

        // New Methods

        Object value1 = linkedHashSet.size();
        System.out.println(value1);

        Object value2 = linkedHashSet.isEmpty();
        System.out.println(value2);

    }
}
