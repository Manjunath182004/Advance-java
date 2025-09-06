package com.tutorusdude.crudoperations.RUDoperations;

public class Sorting {

    String[] phoneNames = new String[10];

    public void addPhoneNames(String names){
        if(names!=null && !names.isEmpty()){
            for (int i = 0; i < phoneNames.length; i++){
                if(phoneNames[i]==null){
                    phoneNames[i] = names;
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
        return phoneNames;
    }

    public void sort(){
        for (int i = 0; i < phoneNames.length; i++) {
            for (int j = 0; j < phoneNames.length; j++) {
                if (phoneNames[i]!=null && phoneNames[j]!= null ){
                    if (phoneNames[i].compareTo(phoneNames[j])>0){

                        String temp = phoneNames[i];
                        phoneNames[i] = phoneNames[j];
                        phoneNames[j] = temp;
                    }

                }

            }

        }
    }
}
