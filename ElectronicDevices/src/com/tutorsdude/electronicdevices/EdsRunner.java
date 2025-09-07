package com.tutorsdude.electronicdevices;

import com.tutorsdude.electronicdevices.devices.*;

public class EdsRunner {
    public static void main(String[] args) {

        System.out.println("------------SmartPhones------------");

        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone.batteryCapacity);
        System.out.println(smartPhone.lightWeight);
        System.out.println(smartPhone.brand);
        System.out.println(smartPhone.model);


        smartPhone.batteryCapacity = 100;
        System.out.println(smartPhone.batteryCapacity);

        smartPhone.lightWeight = true;
        System.out.println(smartPhone.lightWeight);

        smartPhone.brand = "Samsung";
        System.out.println(smartPhone.brand);

        smartPhone.model = "Samsung s25";
        System.out.println(smartPhone.model);

        smartPhone.useOfLightWeight();
        smartPhone.useElectronicDevices();

        AndroidPhone androidPhone = new AndroidPhone();
        System.out.println(androidPhone.model);
        System.out.println(androidPhone.playStoreVersion);
        System.out.println(androidPhone.lightWeight);
        System.out.println(androidPhone.batteryCapacity);


        androidPhone.model = "Samsung Galaxy S24";
        System.out.println(androidPhone.model);

        androidPhone.playStoreVersion = "Samsung Galaxy S24";
        System.out.println(androidPhone.lightWeight);

        androidPhone.batteryCapacity = 100;
        System.out.println(androidPhone.batteryCapacity);

        androidPhone.model = "Samsung Galaxy S24";
        System.out.println(androidPhone.model);

        androidPhone.whyAndroidPhone();
        androidPhone.useOfLightWeight();
        androidPhone.useElectronicDevices();

        Iphone iphone = new Iphone();
        System.out.println(iphone.appStoreVersion);

        iphone.appStoreVersion = "332S24";
        System.out.println(iphone.appStoreVersion);

        iphone.whyIphone();
        iphone.useOfLightWeight();
        iphone.useElectronicDevices();

        System.out.println("------------Laptop------------");

        Laptop laptop = new Laptop();
        System.out.println(laptop.brand);
        System.out.println(laptop.model);


        laptop.brand = "Samsung Galaxy";
        System.out.println(laptop.brand);

        laptop.useOfLaptop();

        GamingLaptop gamingLaptop = new GamingLaptop();
        System.out.println(gamingLaptop.ramSize);

        gamingLaptop.ramSize = 258;
        System.out.println(gamingLaptop.ramSize);

        gamingLaptop.whyGamingLaptop();

        NormalLaptop normalLaptop = new NormalLaptop();
        System.out.println(normalLaptop.screenSize);

        normalLaptop.screenSize = 258;
        System.out.println(normalLaptop.screenSize);

        normalLaptop.whyNormalLaptop();

        System.out.println("------------Tablet------------");

        Tablet tablet = new Tablet();
        System.out.println(tablet.screenSize);

        tablet.screenSize = 258;
        System.out.println(tablet.screenSize);

        tablet.useOfTablet();

        AndroidTablet androidTablet = new AndroidTablet();
        System.out.println(androidTablet.androidVersion);

        androidTablet.androidVersion = "332S24";
        System.out.println(androidTablet.androidVersion);

        androidTablet.whyAndroidTablet();

        Ipad ipad = new Ipad();
        System.out.println(ipad.iosVersion);

        ipad.iosVersion = "332S24";
        System.out.println(ipad.iosVersion);

        ipad.whyIpad();

        

    }
}
