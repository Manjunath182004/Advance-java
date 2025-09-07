package com.tutorusdude.accessspecifiers.publicex;

public class PlayerEx {

    public String name;                          //Variables
    public int age;
    public String gender;
    public String sportName;

    public PlayerEx() {                           // Constructor

        System.out.println("Virat , Rohit, rahul there are the cricket players");
    }

    public PlayerEx(String name, int age, String gender, String sportName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sportName = sportName;


    }

    public static void playerFamous(){                // Method
        System.out.println("Player is famous in playing in Cricket");

    }

    public static void main(String[] args) {

        new PlayerEx();

        PlayerEx player = new PlayerEx("Virat", 38, "male", "cricket");
        System.out.println(player.name +" ,"+player.age +" ,"+player.gender + " ,"+ player.sportName);

        PlayerEx.playerFamous();

    }


}
