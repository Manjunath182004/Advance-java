package com.tutorsdude.hospital.gangavathi;

public class Hospital {

    public String name;
    public String ceoName;

    public Department[] department;
    public Doctor[] doctor;
    public Disease[] disease;
    public Patient[] patient;
    public Address address;

    public void printHospital() {

        System.out.println("Hospital Name: " + name);
        System.out.println("CEO Name: " + ceoName);

        if(department!=null){                                // Null Pointer Exceptions
            for (int i = 0; i < department.length; i++) {
                if(department[i]!=null){
                    department[i].printDepartment();
                }
            }
        }

        if(doctor!=null){
            for (int i = 0; i < doctor.length; i++) {
                if(doctor[i]!=null){
                    doctor[i].printDoctor();
                }
            }

        }

        if(disease!=null){
            for (int i = 0; i < disease.length; i++) {
                if(disease[i]!=null){
                    disease[i].printDisease();
                }
            }
        }

        if(patient!=null){
            for (int i = 0; i < patient.length; i++) {
               if(patient[i]!=null){
                   patient[i].printPatient();
               }
            }
        }

        if (address!=null){
            address.printAddress();
        }


    }




}
