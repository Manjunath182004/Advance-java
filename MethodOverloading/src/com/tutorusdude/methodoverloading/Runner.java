package com.tutorusdude.methodoverloading;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.tutorusdude.methodoverloading.types.NoOfParameter;
import com.tutorusdude.methodoverloading.types.OrderOfParameter;
import com.tutorusdude.methodoverloading.types.TypeOfParameter;

public class Runner {

    public static void main(String[] args) {

        // Nunmer Of Parameter

        String value = NoOfParameter.details("Manjunath");
        System.out.println("Name of The Person:" + " " + value);

        String fullValue = NoOfParameter.details("L" , "Manjunatha");
        System.out.println("Name of The Person:" + " " + fullValue);

        String values = NoOfParameter.details("L", "Manjunatha" , "AppuRathod");
        System.out.println("Name of The Person:" + " " + values);

        // Type Of Parameter

        int group = TypeOfParameter.group(1);
        System.out.println("You are Belongs Group : " + group);

        int groupValue = TypeOfParameter.group("18");
        System.out.println(groupValue);

        int classRoom = TypeOfParameter.group('A');
        System.out.println(classRoom);

        // Order Of Parameter

        int job = OrderOfParameter.job(50000);
        System.out.println("Salary Of Employee: " + job);

        int jobRole = OrderOfParameter.job(50000, "Full Stack Developper");
        System.out.println(jobRole);

        int jobValue = OrderOfParameter.job("Full Stack Developper" , 50000);
        System.out.println(jobValue);

    }
}
