package com.tutrousdude.revision;

public class Constructor {

    String name;
    int age;
    String address;
    String qualification;

    public Constructor(){
        System.out.println("This Block code which is executed Whenever Object is Created");
    }

    public Constructor(String name, int age, String address, String qualification){
        this.name = name;
        this.age = age;
        this.address = address;
        this.qualification = qualification;
    }



    public static void main(String[] args) {
        new Constructor();

        Constructor cons = new Constructor("Manjunath", 20, "hb halli", "Degree" );
        System.out.println("My Name is :" + cons.name +" "+ "age is: " + " "+ cons.age+ "address: " +" "+ cons.address + "address: " + " "+ cons.qualification);

        cons.name = "Manju";
        System.out.println(cons.name);
    }
}
