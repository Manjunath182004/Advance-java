package com.tutorusdude.abstraction.channels;

public class Pogo extends Cartoon {

    String[] language = {"Hindi", "English", "Kannada", "telugu", "tamil"};

    @Override
    public void exclusiveShow(int time){
        if(time == 9){
            System.out.println("Pogo Exclusive Show: 'Chhota bheem'");
        } else if (time == 12) {
            System.out.println("Pogo Exclusive Show: 'Mighty Raju' ");
        } else {
            System.out.println("Pogo Exclusive Show: 'Special Movies'");
        }
    }

    @Override
    public void availableLanguages() {
        for (int i = 0; i < language.length; i++){
            System.out.println("Language: " + language[i]);
        }
    }

}
