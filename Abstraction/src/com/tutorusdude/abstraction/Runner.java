package com.tutorusdude.abstraction;

import com.tutorusdude.abstraction.channels.Pogo;

public class Runner {

    public static void main(String[] args) {


        Pogo pogo = new Pogo();

        pogo.availableLanguages();
        pogo.exclusiveShow(9);
        pogo.broadcastSchedule();
        pogo.showPopularShow();




    }
}
