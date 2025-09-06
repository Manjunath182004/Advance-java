package com.tutorusdude.crudincollections;

import com.tutorusdude.crudincollections.crud.Operations;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Operations value = new Operations();

        value.saveNames("Abhijeet");
        value.saveNames("Manjunatha");
        value.saveNames("Kalinaga");
        value.saveNames("Siddu");
        value.saveNames("Vanitha");
        value.saveNames("Jakiya");

        ArrayList<String> returnValue = value.getNames();
        System.out.println(returnValue);

        boolean removeName = value.deleteNames("Siddu");
        System.out.println(removeName);

        boolean updateName = value.updateNames(3, "Aniketh");
        System.out.println(updateName);

        System.out.println(returnValue);
    }
}
