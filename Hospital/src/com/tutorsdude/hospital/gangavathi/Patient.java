package com.tutorsdude.hospital.gangavathi;

public class Patient {

    public String name;
    public int age;
    public PatientAddress patientAddress;

    public void printPatient() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if(patientAddress!=null){
            patientAddress.printPatientAddress();
        }



    }

}
