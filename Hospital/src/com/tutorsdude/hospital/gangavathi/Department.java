package com.tutorsdude.hospital.gangavathi;

public class Department {

    public String name;
    public String chiefDoctor;
    public int deptId;

    public void printDepartment() {          //  or we can use printAll()
        System.out.println("Name: " + name);
        System.out.println("ChiefDoctor: " + chiefDoctor);
        System.out.println("DeptId: " + deptId);
    }
}
