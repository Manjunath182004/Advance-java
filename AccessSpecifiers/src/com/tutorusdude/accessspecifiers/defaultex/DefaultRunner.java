package com.tutorusdude.accessspecifiers.defaultex;

public class DefaultRunner {
    public static void main(String[] args) {

        new CricketPlayer();


        CricketPlayer cricketPlayer = new CricketPlayer("Virat", 38, "male", "cricket");
        System.out.println(cricketPlayer.name +" ,"+cricketPlayer.age +" ,"+cricketPlayer.gender + ", "+ cricketPlayer.sportName);

        CricketPlayer.famous();

    }
}
