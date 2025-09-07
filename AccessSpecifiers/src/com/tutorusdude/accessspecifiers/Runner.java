package com.tutorusdude.accessspecifiers;

import com.tutorusdude.accessspecifiers.protectedex.VolleyballPlayer;
import com.tutorusdude.accessspecifiers.publicex.PlayerEx;

public class Runner extends VolleyballPlayer {

    public static void main(String[] args) {

        new PlayerEx();                //public

        PlayerEx player = new PlayerEx("Virat", 38, "male", "cricket");
        System.out.println(player.name +" "+player.age +" "+player.gender + " "+ player.sportName);

        PlayerEx.playerFamous();

        VolleyballPlayer volleyballPlayer = new VolleyballPlayer();  // protected

        VolleyballPlayer.volleyballPlayerEx();



    }
}
