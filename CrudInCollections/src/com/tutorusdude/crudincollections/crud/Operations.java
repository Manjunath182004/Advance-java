package com.tutorusdude.crudincollections.crud;

import java.util.ArrayList;

public class Operations {

    ArrayList<String> names = new ArrayList<String>();

    public boolean saveNames(String input){

        if(input!=null && input.length()>3){
            names.add(input);
            System.out.println("Given input are saved");
            return true;
        }
        System.out.println("Given input are not saved");
        return false;
    }
    public ArrayList<String> getNames(){
        return names;
    }
    public boolean deleteNames(String name){
        names.remove(name);
        return true;
    }
    public boolean updateNames(int value, String newName){
        names.set(value, newName);
        return true;
    }
}
