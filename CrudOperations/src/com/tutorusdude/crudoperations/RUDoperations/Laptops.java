package com.tutorusdude.crudoperations.RUDoperations;

public class Laptops {

    String[] laptopNames = new String[10];

    public void addLaptop(String names){
        if(names!=null && !names.isEmpty()){
            for (int i = 0; i < laptopNames.length; i++){
                if (laptopNames[i] == null){
                    laptopNames[i] = names;
                    System.out.println("Saved Laptop Names: " + names);
                    return;
                }
                else {
                    System.out.println("Index are Occupied, Move To Next one");
                }
            }
            System.out.println("Space is Over");
        }
        else {
            System.out.println("Company Name not Available");
        }
    }

    public String[] readAll(){
        return laptopNames;
    }

    public boolean find(String names){
        if(names!=null){
            for (int i = 0; i < laptopNames.length; i++) {
                if(laptopNames[i].equals(names)){
                    System.out.println("laptop is Found");
                    return true;
                }
            }
            System.out.println("Laptop not Found");
            return false;
        }
        System.out.println("Input is Not Valid");
        return false;
    }

    public boolean update(String oldNames, String newNames){                                      // Update Operation
        if(oldNames!=null && newNames!=null && !oldNames.isEmpty() && !newNames.isEmpty()){
            for (int i = 0; i < laptopNames.length; i++) {
                if (laptopNames[i].equals(oldNames)){
                    laptopNames[i]=newNames;
                    return true;
                }
            }
            System.out.println("The Laptop name is Not Found");
            return false;
        }
        else {
            System.out.println("Give Input is Not Valid");
            return false;
        }
    }

    public boolean Delete(String names){                               // Delete Operation
        if (names!=null && !names.isEmpty()){
            for (int i = 0; i < laptopNames.length; i++) {
                if (laptopNames[i].equals(names)){
                    laptopNames[i] = null;
                    return true;
                }
            }
            System.out.println("The Old Laptop is Not found");
            return false;
        }
        else {
            System.out.println("Given Input is Not Valid");
            return false;
        }
    }
}
