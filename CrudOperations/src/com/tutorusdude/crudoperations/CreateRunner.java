package com.tutorusdude.crudoperations;

public class CreateRunner {

    static String[] qualifications = new String[10];
    static String[] statesName = new String[26];

    public static void main(String[] args) {

        addQualifications("Manju");
        addQualifications("Abhi");
        addQualifications("Putta");

        addStatesName("Karnataka");
        addStatesName("Mp");
        addStatesName("UP");

        for (int i = 0; i < qualifications.length; i++){
            System.out.println(qualifications[i]);
        }
        for (int i = 0; i < statesName.length; i++){
            System.out.println(statesName[i]);
        }

    }

    public static void addQualifications(String values){
        for(int i = 0; i < qualifications.length; i++){
           if(qualifications[i]==null){
               qualifications[i] = values;
               return;
           }
        }
    }

    public static void addStatesName(String names){
        for(int i = 0; i < statesName.length; i++){
            if(statesName[i]==null){
                statesName[i]=names;
                return;
            }
        }
    }
}
