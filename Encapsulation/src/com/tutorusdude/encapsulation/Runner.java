package com.tutorusdude.encapsulation;

import com.tutorusdude.encapsulation.example.College;

public class Runner {
    public static void main(String[] args) {

        College college = new College();

        // college details

        System.out.println("-------------College details----------------");

        college.setCollegeName("Government Engineering College Gangavathi");
        System.out.println("College Name:" + college.getCollegeName());
        college.setCollegeCode("3NG");
        System.out.println("College Code:" + college.getCollegeCode());
        college.setCollegeAddress("Gangavathi");
        System.out.println("College Address:" + college.getCollegeAddress());
        college.setPrincipleName("Chennabasva gowda");
        System.out.println("Priciple Name:" + college.getPrincipleName());
        college.setEstablishedYear(2004);
        System.out.println("Established Year:" + college.getEstablishedYear());
        college.setHasHostelFacilities(false);
        System.out.println("College has Hostel: " + college.getHasHostelFacilities());
        college.setIsAutonomous(false);
        System.out.println("College isAutonomous: " + college.getIsAutonomous());

        // Academic Information

        System.out.println("-------------Academic Information----------------");

        college.setTotalNoDepartments(5);
        System.out.println("Total No Dept: " + college.getTotalNoDepartments());
        college.setTotalNoCourses(5);
        System.out.println("Total No Courses: " + college.getTotalNoCourses());
        college.setTotalNoFaculty(38);
        System.out.println("Total No Faculty: " + college.getTotalNoFaculty());
        college.setNameOfCourses("CSE, EC, EEE, MECH, CV");
        System.out.println("Courses available: " + college.getNameOfCourses());
        college.setTotalNoStudents(600);
        System.out.println("No of Students In Clg : " + college.getTotalNoStudents());
        college.setBlockName('A');
        System.out.println("dept Block : " + college.getBlockName());
        college.setAcademicRatio(8.33);
        System.out.println("College academic ratio: " + college.getAcademicRatio());

        //  Department Details

        System.out.println("-------------Department details----------------");

        college.setDepartmentName("CSE");
        System.out.println("dept Name: " + college.getDepartmentName());
        college.setDepartmentId(425);
        System.out.println("dept Id: " + college.getDepartmentId());
        college.setTotalStaffs(8);
        System.out.println("No of Staff: " + college.getTotalStaffs());
        college.setTotalLabs(2);
        System.out.println("No of Labs: " + college.getTotalLabs());
        college.setHighestCgpa(8.9);
        System.out.println("Highest cgpa: " + college.getHighestCgpa());
        college.setTotalNoClassrooms(4);
        System.out.println("total No classRooms: " + college.getTotalNoClassrooms());

        //    Admission Details

        System.out.println("-------------Admission details----------------");

        college.setApplicationOpen(true);
        System.out.println("Is Application form Open: " + college.getIsApplicationOpen());
        college.setTypeOfAdmission("KCET");
        System.out.println(" Entrance Exam Name: " + college.getTypeOfAdmission());
        college.setAdmissionFee(27000);
        System.out.println("College Fee per Year: " + college.getAdmissionFee());
        college.setTotalNoSeats(700);
        System.out.println("total No seats: " + college.getTotalNoSeats());
        college.setAdmissionYear(2021);
        System.out.println("tAdmission Year: " + college.getAdmissionYear());
        college.setFilledSeats(650);
        System.out.println("Filled seats: " + college.getFilledSeats());
        college.setVacantSeats(50);
        System.out.println("Vacant Seats: " + college.getVacantSeats());

        //    Exam and Results

        System.out.println("-------------Exam and Results----------------");
        
        college.setExamName("Sem Exam");
        System.out.println("Exam : " + college.getExamName());
        college.setSubjectName("Chemistry");
        System.out.println("Name of Sub: " + college.getSubjectName());
        college.setTotalMarks(800);
        System.out.println("Total Marks: " + college.getTotalMarks());
        college.setPassingMarks(35);
        System.out.println("Passing Marks: " + college.getPassingMarks());
        college.setHighestMarks(799);
        System.out.println("Highest marks: " + college.getHighestMarks());
        college.setGrade('A');
        System.out.println("Grade In Exam: " + college.getGrade());
        college.setPass(true);
        System.out.println("All are Passed In exam: " + college.getIsPass());
        college.setDurationOfHours(3.00);
        System.out.println("Duration of Hours: " + college.getDurationOfHours());
        college.setRevaluationApplied(false);
        System.out.println("Is student applied for revolution: " + college.getIsRevaluationApplied());



    }
}
