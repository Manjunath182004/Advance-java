package com.tutorusdude.staticc.examples;

public class Bluetooth {

    public static String deviceType;
    public static String connectionType;
    public String deviceName;
    public static int range;
    public int price;

    static {                                                              // Static block
        deviceType = "Electronic";
        connectionType = "Wireless";
        range = 10;
    }

    public Bluetooth(String deviceName, int price) {                     // Constructor
        this.deviceName = deviceName;
        this.price = price;
    }

    public void printBluetooth() {
        System.out.println("Device Type: " + deviceType);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Range: "+ range + " " + "meter");
        System.out.println("Price: " + price);

    }

    public void device() {                                          // Non-static

        System.out.println("Its an electric device");
    }
    public static void connection() {                              // Static
        System.out.println("its always Wireless connection");

    }
}
