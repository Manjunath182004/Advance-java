package com.tutorsdude.hospital;

import com.tutorsdude.hospital.gangavathi.*;

public class HospitalRunner {
    public static void main(String[] args) {

        System.out.println("-------------Hospital 01 : Gangavathi Hospital------------");

        Hospital hospital1 = new Hospital();

        hospital1.name = "Gov Hospital Gangavathi";
        hospital1.ceoName = "Dr. Ishwar";

        Department department01 = new Department();

        department01.name = "Dental Department";
        department01.chiefDoctor = "Dr Manjunath";
        department01.deptId = 22;

        Department department02 = new Department();

        department02.name = "Ayurvedic Department";
        department02.chiefDoctor = "Dr Abhijeet";
        department02.deptId = 21;

        Department department03 = new Department();

        department03.name = "Ayurvedic Department";
        department03.chiefDoctor = "Dr Abhijeet";
        department03.deptId = 21;

        Department department04 = new Department();

        department04.name = "Exray Department";
        department04.chiefDoctor = "Dr Ghorpade";
        department04.deptId = 21;

        Department[] departmentArray1 = {department01,department02,department03, department04};

        hospital1.department = departmentArray1;

        //department01.printDepartment();
        //department02.printDepartment();
        //department03.printDepartment();
        //department04.printDepartment();

        Doctor doctor01 = new Doctor();

        doctor01.name = "Dr. IshwarSheety";
        doctor01.specialization = "Mbbs";
        doctor01.noOfOperations = 45;

        Doctor doctor02 = new Doctor();

        doctor02.name = "Dr. kalinga";
        doctor02.specialization = "denist ";
        doctor02.noOfOperations = 45;

        Doctor doctor03 = new Doctor();

        doctor03.name = "Dr. Abhijeet";
        doctor03.specialization = "delivery";
        doctor03.noOfOperations = 45;

        Doctor[] doctorArray1 = {doctor01,doctor02,doctor03};
        hospital1.doctor = doctorArray1;

        //doctor01.printDoctor();
        //doctor02.printDoctor();
        //doctor03.printDoctor();

        Disease disease01 = new Disease();

        disease01.name = "Cancer";
        disease01.seviority = "Mostly rare cases";
        disease01.cause = "Death of person";

        Disease disease02 = new Disease();

        disease02.name = "Fever";
        disease02.seviority = "Mostly no rare cases";
        disease02.cause = "hot body of person";

        Disease disease03 = new Disease();

        disease03.name = "Dengu";
        disease03.seviority = "Mostly no rare cases";
        disease03.cause = "death of person";

        Disease[] diseaseArray1 = {disease01,disease02,disease03};
        hospital1.disease = diseaseArray1;

        //disease01.printDisease();
        //disease02.printDisease();
        //disease03.printDisease();

        Patient patient01 = new Patient();

        patient01.name = "Manjunath";
        patient01.age = 21;

        Patient patient02 = new Patient();

        patient02.name = "Abhijeet";
        patient02.age = 21;

        Patient[] patientArray1 = {patient01,patient02};
        hospital1.patient = patientArray1;


        PatientAddress patientaddress01 = new PatientAddress();

        patientaddress01.no = 25;
        patientaddress01.name = "Nagalapura";
        patientaddress01.area = "Vishnnu circle";
        patientaddress01.city = "Hagaribommanahalli";
        patientaddress01.pincode = 583214;

        patientaddress01.printPatientAddress();

        Address address01 = new Address();

        address01.no = 20;
        address01.name = "Govt hospital";
        address01.area = "pampanagar";
        address01.city = "Gangavathi";
        address01.pincode = 583227;

        address01.printAddress();


        hospital1.printHospital();


    }
}
