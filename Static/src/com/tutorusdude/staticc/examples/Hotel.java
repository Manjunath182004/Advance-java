package com.tutorusdude.staticc.examples;

public class Hotel {

    public  String hotelName;
    public String foodName;
    public int foodPrice;
    public static String hotelAddress;

    static {                                   // using Static block
        hotelAddress = "Hampi";
    }

    public Hotel(String hotelName, String foodName, int foodPrice) {
        this.hotelName = hotelName;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public void printHotel() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Hotel Address: " + hotelAddress);
        System.out.println("Food Prize " + foodPrice);
        System.out.println("Food Name: " + foodName);
    }

    public void deliveryAvailabe() {                     // Non-Static

        System.out.println("Is Available Any Time ");
    }

    public static void famousFood(){                   // Static

        System.out.println("Is Famous for Kolhapur chicken");
    }

}
