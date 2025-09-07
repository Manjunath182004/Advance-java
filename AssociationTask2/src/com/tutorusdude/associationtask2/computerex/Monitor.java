package com.tutorusdude.associationtask2.computerex;

public class Monitor {

    public String brand;
    public Display display;

    public void printMonitor(){
        System.out.println("brand: " + brand);

       if(display!=null){
           display.printDisplay();
       }
    }
}
