package com.tutorusdude.crudoperations;

import com.tutorusdude.crudoperations.RUDoperations.CompanyNames;
import com.tutorusdude.crudoperations.RUDoperations.Laptops;
import com.tutorusdude.crudoperations.RUDoperations.Sorting;

public class Runner {

    public static void main(String[] args) {

        CompanyNames companyNames = new CompanyNames();

        companyNames.addCompanyNames("IBM");
        companyNames.addCompanyNames("Infosys");
        companyNames.addCompanyNames("Wipro");
        companyNames.addCompanyNames("MicroSoft");
//        companyNames.addCompanyNames("sales Force");
//        companyNames.addCompanyNames("Cognizant");
//        companyNames.addCompanyNames("Tech Mahindra");
//        companyNames.addCompanyNames("JSW Steel");
//        companyNames.addCompanyNames("Global Edge");
//        companyNames.addCompanyNames("Amazon");

        String[] readCompanyNames = companyNames.readAll();

        for(int i = 0; i < readCompanyNames.length; i++){
            System.out.println(readCompanyNames[i]);
        }

        boolean resultIs = companyNames.find("IBM");
        System.out.println(resultIs);

        boolean updatedResult = companyNames.updateCompanyNames("IBM", "Google");
        System.out.println(updatedResult);

        boolean deletedResult = companyNames.Delete("Google");
        System.out.println(deletedResult);


        //companyNames.sortCompanyNames();

        String[] readCompanyNames1 = companyNames.readAll();

        for(int i = 0; i < readCompanyNames1.length; i++){
            System.out.println(readCompanyNames[i]);
        }


        Laptops laptops = new Laptops();

        laptops.addLaptop("Hp");
        laptops.addLaptop("Lenovo");
        laptops.addLaptop("Dell");
        laptops.addLaptop("Acer");

        String[] readLaptops = laptops.readAll();

        for (int i = 0; i < readLaptops.length ; i++) {
            System.out.println(readLaptops[i]);
        }

        boolean result = laptops.find("Lenovo");
        System.out.println(result);

        boolean updatedValue = laptops.update("Hp", "Redmi");
        System.out.println(updatedValue);

        boolean deletedValue = laptops.Delete("Dell");
        System.out.println(deletedValue);

        String[] readLaptops1 = laptops.readAll();

        for (int i = 0; i < readLaptops1.length ; i++) {
            System.out.println(readLaptops1[i]);
        }



        // Sorting

        Sorting sorting = new Sorting();

        sorting.addPhoneNames("Redmi");
        sorting.addPhoneNames("Infinix");
        sorting.addPhoneNames("Vivo");
        sorting.addPhoneNames("nothing");
        sorting.addPhoneNames("samsung");
        sorting.addPhoneNames("poco");
        sorting.addPhoneNames("I phone");
        sorting.addPhoneNames("Apple");
        sorting.addPhoneNames("Nokia");
        sorting.addPhoneNames("Iq");

        String[] readValue = sorting.readAll();

        sorting.sort();

        for (int i = 0; i < readValue.length; i++) {
            System.out.println(readValue[i]);

        }



    }
}
