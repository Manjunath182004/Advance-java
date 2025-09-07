package com.tutorusdude.associationtask2.computerex;

public class Computer {

    public String brand;
    public Monitor monitor;
    public Keyboard keyboard;
    public Ram[] ram;
    public Speaker[] speaker;
    public Display display;

    public void printComputer(){

       //  Computer computer = new Computer();
        //        computer.monitor = monitor;
        //        computer.display = display;
        //        computer.keyboard = keyboard;

        System.out.println("brand: " + brand);

        if (monitor!=null) {
            monitor.printMonitor();
        }

        if (display!=null) {
            display.printDisplay();
        }

        if (keyboard!=null) {
            keyboard.printKeyboard();
        }

        if(ram!=null){
            for (int i = 0; i < ram.length; i++) {
                if(ram[i]!=null){
                    ram[i].printRam();
                }

            }
        }

        if(speaker!=null){
            for (int i = 0; i < speaker.length; i++) {
                if(speaker[i]!=null){
                    speaker[i].printSpeaker();
                }
            }
        }


    }
}
