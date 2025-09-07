package com.tutorusdude.accessspecifiers.protectedex;

public class VolleyballPlayer {

    protected String name;
    protected int age;
    protected String gender;
    protected String sportName;

    protected static class VolleyBall {
        public static void display(){
            System.out.println("this is protected class");
        }
    }

    public VolleyballPlayer() {                                            // constructor

        System.out.println("Volleyball Player constructor");
    }

    protected VolleyballPlayer(String name, int age, String gender, String sportName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sportName = sportName;

    }

    protected static void volleyballPlayerEx() {                               // method
        System.out.println("Volleyball Player is Famous name Abhijeet");

        VolleyBall.display();

    }

    public static void main(String[] args) {

        new VolleyballPlayer();

        VolleyballPlayer volleyballPlayer = new VolleyballPlayer("Famous Name", 20, "Male", "Sport");
        System.out.println(volleyballPlayer.name+" ,"+volleyballPlayer.age+" ,"+volleyballPlayer.gender+" ,"+volleyballPlayer.sportName);

        VolleyballPlayer.volleyballPlayerEx();

        VolleyBall.display();

        volleyballPlayerEx();

    }
}
