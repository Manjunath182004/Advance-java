package com.tutroysdude.crudpractice;

import java.lang.reflect.Array;

public class Values {

    String[] valuesNames = new String[10];

    public void create(String name){
        if(name!= null && name.length() >= 3){
            for (int i = 0; i < valuesNames.length ; i++) {
                if (valuesNames[i] == null){
                    valuesNames[i] = name;
                    System.out.println("Given Value is Valid" + name);
                    return;
                }
                else {
                    System.out.println("Index is already occupied Move to Next one");
                }
            }
            System.out.println("Space is over");
        }
        System.out.println("Given name is not valid");
    }

    public String[] read(){
        return valuesNames;
    }

    public boolean update(String oldValue, String newValue){
        if (oldValue!=null && newValue!=null && oldValue.length() >=3 && newValue.length()>= 2){
            for (int i = 0; i < valuesNames.length; i++) {
                if (valuesNames[i].equals(oldValue)){
                    valuesNames[i] = newValue;
                    System.out.println("Value being Updated : " +" " +  newValue);
                    return true;
                }
                else {
                    System.out.println("Error! Given Old Value Not Found :" + oldValue);
                    return false;
                }
            }
            System.out.println("Space is Occupied Move To next One");
            return false;
        }
        System.out.println("Given Input Value is not Valid");
        return false;
    }

    public boolean delete(String name){
        if (name!=null && !name.isEmpty()){
            for (int i = 0; i < valuesNames.length; i++) {
                if (valuesNames[i] == name){
                    valuesNames[i] = null;
                    System.out.println("Given Value deleted");
                    return true;
                }
                else {
                    System.out.println("Given Input Not Matches: " + " " + name);
                    return false;
                }
            }
            System.out.println("Given space is over Move Next One");
            return false;
        }
        System.out.println("Given input not matches the Condition");
        return false;
    }

    public boolean find(String name){
        if (name!=null && !name.isEmpty()){
            for (int i = 0; i < valuesNames.length; i++) {
                if (valuesNames[i]!=null && valuesNames[i].equals(name)){
                    System.out.println("Given Value is found:" +" " + name);
                    return true;
                }
            }
            System.out.println("Given input not Exit");
            return false;
        }
        System.out.println("Input is not Valid");
        return false;
    }
}
