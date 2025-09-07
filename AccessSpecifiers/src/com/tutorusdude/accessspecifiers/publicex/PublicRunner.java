package com.tutorusdude.accessspecifiers.publicex;

public class PublicRunner {

    public static void main(String[] args) {

        new PlayerEx();

        PlayerEx player = new PlayerEx("Virat", 38, "male", "cricket");
        System.out.println(player.name +" ,"+player.age +", "+player.gender + ", "+ player.sportName);

        PlayerEx.playerFamous();

    }
}
