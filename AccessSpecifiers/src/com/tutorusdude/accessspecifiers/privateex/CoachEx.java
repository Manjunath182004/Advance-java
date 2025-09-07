package com.tutorusdude.accessspecifiers.privateex;

public class CoachEx {

    private String name;                                    //Variables
    private int age;
    private String gender;
    private String sportName;
    
    public static void main(String[] args) {

        new CoachEx();

        CoachEx coach = new CoachEx("Rahul", 38, "male", "cricket");
        System.out.println(coach.name+" ,"+coach.age+" ,"+coach.gender+" ,"+coach.sportName);

        coach.coachFamousIn();

    }

    private static class Coach1 {                                       // private class

        private void display(){
            System.out.println("this is an private class");


        }

    }

    private CoachEx() {                                      // Constructors

        System.out.println("Coach is Famous in Cricket");
    }

    private CoachEx(String name, int age, String gender, String sportName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sportName = sportName;
    }

    private void coachFamousIn(){                             // Method
        System.out.println("Coach famous for Giving training");

        Coach1 coach1 = new Coach1();
        coach1.display();

        new CoachEx();
    }

}
