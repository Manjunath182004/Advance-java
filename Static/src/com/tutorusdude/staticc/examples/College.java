package com.tutorusdude.staticc.examples;

public class College {

    public static String collegeName;
    public static int collegePhoneNo;
    public static String collegeEmail;
    public int noOfStudents;
    public int noOfCourses;

    static {
        collegeEmail =  "gjhjd@gmail.com";
        collegePhoneNo = 322422;
    }

    public College(int noOfCourses, int noOfStudents) {
        this.noOfCourses = noOfCourses;
        this.noOfStudents = noOfStudents;
    }


    public void printCollege() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Phone No: " + collegePhoneNo);
        System.out.println("College Email: " + collegeEmail);
        System.out.println("No of Students: " + noOfStudents);
        System.out.println("No of Courses: " + noOfCourses);

    }

    public void college() {                                // Non-static

        System.out.println("College Name: " + collegeName);
    }

    public static void sendMessage() {                      // Static

        System.out.println("Sending Message");
    }


}
