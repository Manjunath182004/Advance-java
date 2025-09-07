package com.tutorusdude.accessspecifiers.protectedex;

public class ProtectedRunner {
    public static void main(String[] args) {

        new VolleyballPlayer();

        VolleyballPlayer volleyballPlayer = new VolleyballPlayer("kalinga", 38, "male", "vollyball");
        System.out.println(volleyballPlayer.name+", "+volleyballPlayer.age+" ,"+volleyballPlayer.gender+" ,"+ " ,"+volleyballPlayer.sportName);

        VolleyballPlayer.volleyballPlayerEx();




    }
}
