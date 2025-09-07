package com.tutorusdude.staticc.examples;

import javax.xml.bind.SchemaOutputResolver;

public class Pogo {

    public static String channelName;
    public String cartoonName;
    public static String time;
    public boolean isCartoonChannel;

    static {                              // intializing Static Variables Using Static Blocks
        channelName = "Cartoon Network";
        time = "9AM & 5PM Daily";
    }

    public Pogo (String cartoonName, boolean isCartoonChannel) {       // intializing non-static Variables Using Constructor
        this.cartoonName = cartoonName;
        this.isCartoonChannel = isCartoonChannel;
    }

    public void printPogo() {
        System.out.println("ChannelName: "+ channelName);
        System.out.println("CartoonName: "+ cartoonName);
        System.out.println("Time: "+ time);
        System.out.println("isCartoonChannel: "+ isCartoonChannel);
    }

    public void channel() {                                // Non-Static Method
        System.out.println(" Its an Pogo Channel");
    }

    public static void famousCartoon() {                     // Static Method
        System.out.println("FamousCartoon Is chota Bheem");
    }

}

