package com.tutorusdude.staticc.examples;

public class Platform {

    public static String platform;
    public static String platformName;
    public String productName;
    public int productID;
    public int price;

    static {                                   // intializing Static Variables Using Static Blocks
        platform = "E-commerce Website";
        platformName = "Amazon";
    }

    // intializing non-static Variables Using Constructor

    public Platform(String productName, int productID, int price) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
    }

    public void printPlatform() {
        System.out.println("platform : " + platform);
        System.out.println("platformName : " + platformName);
        System.out.println("productName : " + productName);
        System.out.println("productID : " + productID);
        System.out.println("price : " + price);

    }

    public void ecommerce() {                           // Non-Static
        System.out.println("ecommerce plaform is best for buy");
    }

    public static void online() {                       // Static
        System.out.println("online is best for buy");
    }

}

