package com.tutorsdude.hospital.gangavathi;

public class PatientAddress {

    public int no;
    public String name;
    public String area;
    public String city;
    public int pincode;

    public void printPatientAddress() {
        System.out.println("No.: " + no);
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("City: " + city);
        System.out.println("Pincode: " + pincode);

    }
}
