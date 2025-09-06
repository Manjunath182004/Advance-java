package com.tutorusdude.crudoperations.RUDoperations;

public class CompanyNames {

    String[] companyNames = new String[10];


    public void addCompanyNames(String names){
        if(names!=null && !names.isEmpty()){
            for (int i = 0; i < companyNames.length; i++){
                if(companyNames[i]==null){
                    companyNames[i] = names;
                    System.out.println("Saved Company Names:" + names);
                    return;
                }
                else {
                    System.out.println("Index are Occupied; Moves to Next One");
                }
            }
            System.out.println("Space is Over");
        }
        else {
            System.out.println("Company Is Not Available");
        }

    }

    public String[] readAll(){
        return companyNames;
    }

    public boolean find(String names){
        if(names!= null){
            for (int i = 0; i < companyNames.length; i++) {
                if(companyNames[i].equals(names)){
                    System.out.println("Company Is Found");
                    return true;
                }
            }
            System.out.println("Company not found");
            return false;
        }
        else {
            System.out.println("Given Input is not valid");
            return false;
        }
    }

    public boolean updateCompanyNames(String oldNames, String newNames){                               // Update Operation
        if (oldNames!=null && newNames!=null && !newNames.isEmpty() && !oldNames.isEmpty()){
            for (int i = 0; i < companyNames.length; i++) {
                if (companyNames[i].equals(oldNames)){
                    companyNames[i] = newNames;
                    return true;
                }
            }
            System.out.println("The Old Company is Not found");
            return false;
        }
        else {
            System.out.println("Given Input is Not Valid");
            return false;
        }
    }

    public boolean Delete(String names){                               // Delete Operation
        if (names!=null && !names.isEmpty()){
            for (int i = 0; i < companyNames.length; i++) {
                if (companyNames[i].equals(names)){
                    companyNames[i] = null;
                    return true;
                }
            }
            System.out.println("The Old Company is Not found");
            return false;
        }
        else {
            System.out.println("Given Input is Not Valid");
            return false;
        }
    }

}
