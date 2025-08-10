package com.tutorusdude.abstraction.channels;

public abstract class Cartoon {

    // concrete Method

    public void broadcastSchedule(){
        System.out.println("Broadcasting cartoons from 9 AM to 6 PM daily..");
    }

    public void showPopularShow(){
        System.out.println("Popular Show: Tom and Jerry");
    }

    // Abstract Method

    public abstract void exclusiveShow(int time);

    public abstract void availableLanguages();

}
