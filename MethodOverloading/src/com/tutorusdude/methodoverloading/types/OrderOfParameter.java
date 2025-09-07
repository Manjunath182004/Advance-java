package com.tutorusdude.methodoverloading.types;

public class OrderOfParameter {

    public static int job(int salaray) {
        int jobSalary = salaray;
        return jobSalary;
    }

    public static int job(int salary, String jobName){
        System.out.println("Slary be the : " + salary);
        return 0;
    }

    public static int job(String jobName, int salary){
        System.out.println("Job Role Be the: " + jobName);
        return 0;
    }
}
