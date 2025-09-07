package com.tutorusdude.staticc;

import com.tutorusdude.staticc.examples.*;

public class Runner {
    public static void main(String[] args) {
        Pogo.channelName = "Pogo";                              // Static Variables
        Pogo.time = "Daily @ 9AM & 7PM";

        Pogo pogo = new Pogo("Choota Bheem", true);  // using Constructors
        System.out.println(pogo.cartoonName + pogo.isCartoonChannel);

        pogo.cartoonName = "Choota Bheem";                                    // Non-static Variables
        pogo.isCartoonChannel = true;

        pogo.channel();         // Non-Static --> using Object Reference
        Pogo.famousCartoon();  // Static --> Using Class name



        pogo.printPogo();


        Hotel.hotelAddress = "Vijayanagara";

        Hotel hotel = new Hotel("hampi", "Masala", 344);
        System.out.println(hotel.hotelName + hotel.foodName + hotel.foodPrice);

        hotel.foodName = "Kholapuri Chiken";
        hotel.foodPrice = 200;
        hotel.hotelName = "Hampi Hotel";

        hotel.deliveryAvailabe();  //Non-static
        Hotel.famousFood();   // Static

        hotel.printHotel();

        Platform.platform = "E-Commerce Platform";
        Platform.platformName = "Flipkart";

        Platform platform = new Platform("Mouse", 12325, 8902);
        System.out.println(platform.productName + platform.productID + platform.price);

        platform.productName = "Laptop";
        platform.productID = 232434;
        platform.price = 12255364;

        platform.ecommerce();        // Non-Static
        Platform.online();           // static
        
        platform.printPlatform();


        Bluetooth.deviceType = "Electronic Device";                 // Static variables
        Bluetooth.connectionType = "Wireless Connection";
        Bluetooth.range = 10;

        Bluetooth bluetooth = new Bluetooth("airpods", 56);    // Non-static Variables
        System.out.println(bluetooth.deviceName + bluetooth.price);
        
        bluetooth.deviceName = "Bloat";                      // non-static variables
        bluetooth.price = 1000;

        bluetooth.printBluetooth();

        bluetooth.device();        // Non-static --> Using Object reference
        Bluetooth.connection();   // static --> Using Class Name

        College.collegeName = "Government Engineering College Gangavathi";
        College.collegePhoneNo = 8548950;
        College.collegeEmail = "gangavathi@gmail.com";

        College college = new College(22, 50);
        System.out.println(college.noOfCourses + college.noOfStudents);

        college.noOfStudents = 2000;
        college.noOfCourses = 5;

        college.printCollege();

        college.college();       // Non-static
        College.sendMessage();   // Static

    }
}
