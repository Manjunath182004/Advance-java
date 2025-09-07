package com.tutorusdude.associationtask2;

import com.tutorusdude.associationtask2.computerex.*;

public class AssociationRunner {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.brand = "HP";
        System.out.println(computer.brand);

        Monitor monitor = new Monitor();

        monitor.brand = "HP OMEN gaming Monitor";
        System.out.println(monitor.brand);

        Display display = new Display();
        display.brand = "iRiS";
        display.resolution = "1920*1080";

        Keyboard keyboard = new Keyboard();
        keyboard.brand = "acer";
        keyboard.prize = 800;
        keyboard.noOfKeys = 56;

        Ram ram1 = new Ram();
        ram1.storage = 256;
        ram1.prize = 100;

        Ram ram2 = new Ram();
        ram2.storage = 64;
        ram2.prize = 50;

        Ram[] ramArray = {ram1, ram2};
        computer.ram = ramArray;

        Speaker speaker1 = new Speaker();
        speaker1.brand = "HP";
        speaker1.prize = 290;
        speaker1.quality = "Good";

        Speaker speaker2 = new Speaker();
        speaker2.brand = "DELL";
        speaker2.prize = 300;
        speaker2.quality = "Very Good";

        Speaker[] speakersArray = {speaker1, speaker2};
        computer.speaker = speakersArray;

        computer.monitor = monitor;
        computer.display = display;
        computer.keyboard = keyboard;

        computer.printComputer();



    }
}
