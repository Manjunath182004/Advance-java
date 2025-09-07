package com.tutorusdude.accessspecifiers.defaultex;

import java.sql.SQLOutput;

class CricketPlayer {

     String name;                               // Variablles
     int age;
     String gender;
     String sportName;

    public static void main(String[] args) {

        new CricketPlayer();

        CricketPlayer cricketPlayer = new CricketPlayer("Virat", 38, "male", "cricket");
        System.out.println(cricketPlayer.name +", "+cricketPlayer.age +", "+cricketPlayer.gender + " ,"+ cricketPlayer.sportName);

        CricketPlayer.famous();   // or famous();



    }

    class cricket {


    }

     CricketPlayer() {                           // Constructor

         System.out.println("Cricket player created");
     }

     CricketPlayer(String name, int age, String gender, String sportName) {
         this.name = name;
         this.age = age;
         this.gender = gender;
         this.sportName = sportName;

     }

      static void famous(){                      //Method

         System.out.println("famous in India ");
     }


}
