package com.tutorusdude.encapsulation.example;

import java.util.concurrent.TimeoutException;

public class College {

    // College details - 7 Variables
    private String collegeName;
    private String collegeCode;
    private String collegeAddress;
    private String principleName;
    private int establishedYear;
    private boolean hasHostelFacilities;
    private boolean isAutonomous;

    // Academic Information - 7 Variables
    private int totalNoDepartments;
    private int totalNoCourses;
    private int totalNoFaculty;
    private String nameOfCourses;
    private int totalNoStudents;
    private char blockName;
    private double academicRatio;

    // Department Details  - 6 Variables
    private String departmentName;
    private int departmentId;
    private int totalStaffs;
    private int totalLabs;
    private double highestCgpa;
    private int totalNoClassrooms;

    // Admission Details - 7 Variables
    private boolean isApplicationOpen;
    private String typeOfAdmission;
    private int admissionFee;
    private int totalNoSeats;
    private int admissionYear;
    private int filledSeats;
    private int vacantSeats;

    // Exam and Results - 9 Variables
    private String examName;
    private String subjectName;
    private int totalMarks;
    private int passingMarks;
    private int highestMarks;
    private char grade;
    private boolean isPass;
    private double durationOfHours;
    private boolean isRevaluationApplied;

    // getters

    // for College Details

    public String getCollegeName(){
        return collegeName;
    }

    public String getCollegeCode(){
        return collegeCode;
    }

    public String getCollegeAddress(){
        return collegeAddress;
    }

    public String getPrincipleName(){
        return principleName;
    }

    public int getEstablishedYear(){
        return establishedYear;
    }

    public boolean getHasHostelFacilities(){
        return hasHostelFacilities;
    }

    public boolean getIsAutonomous(){
        return isAutonomous;
    }

    // for Academic Information

    public int getTotalNoDepartments(){
        return totalNoDepartments;
    }

    public int getTotalNoFaculty(){
        return totalNoFaculty;
    }

    public int getTotalNoCourses(){
        return totalNoCourses;
    }

    public String getNameOfCourses(){
        return nameOfCourses;
    }

    public int getTotalNoStudents(){
        return totalNoStudents;
    }

    public char getBlockName(){
        return blockName;
    }

    public double getAcademicRatio(){
        return academicRatio;
    }

    // for Department Details

    public String getDepartmentName (){
        return departmentName;
    }

    public int getDepartmentId(){
        return departmentId;
    }

    public int getTotalStaffs(){
        return totalStaffs;
    }

    public int getTotalLabs(){
        return totalLabs;
    }

    public double getHighestCgpa(){
        return highestCgpa;
    }

    public int getTotalNoClassrooms(){
        return totalNoClassrooms;
    }

    // for admission Details

    public boolean getIsApplicationOpen(){
        return isApplicationOpen;
    }

    public String getTypeOfAdmission(){
        return typeOfAdmission;
    }

    public int getAdmissionFee(){
        return admissionFee;
    }

    public int getTotalNoSeats(){
        return totalNoSeats;
    }

    public int getAdmissionYear(){
        return admissionYear;
    }

    public int getFilledSeats(){
        return filledSeats;
    }

    public int getVacantSeats(){
        return vacantSeats;
    }

    // for Exam and Results

    public String getExamName(){
        return examName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public int getTotalMarks(){
        return totalMarks;
    }

    public int getPassingMarks(){
        return passingMarks;
    }

    public int getHighestMarks(){
        return highestMarks;
    }

    public char getGrade(){
        return grade;
    }

    public boolean getIsPass(){
        return isPass;
    }

    public double getDurationOfHours(){
        return durationOfHours;
    }

    public boolean getIsRevaluationApplied(){
        return isApplicationOpen;
    }

    // setters

    // College

    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }

    public void setCollegeAddress(String collegeAddress){
        this.collegeAddress = collegeAddress;
    }

    public void setCollegeCode(String collegeCode){
        this.collegeCode = collegeCode;
    }

    public void setPrincipleName(String principleName){
        this.principleName = principleName;
    }

    public void setEstablishedYear(int establishedYear){
        this.establishedYear = establishedYear;
    }

    public void setHasHostelFacilities(boolean hasHostelFacilities){
        this.hasHostelFacilities = hasHostelFacilities;
    }

    public void setIsAutonomous(boolean isAutonomous){
        this.isAutonomous = isAutonomous;
    }

    // academic Info

    public void setTotalNoDepartments(int totalNoDepartments){
        this.totalNoDepartments = totalNoDepartments;
    }

    public void setTotalNoCourses(int totalNoCourses){
        this.totalNoCourses = totalNoCourses;
    }

    public void setTotalNoFaculty(int totalNoFaculty){
        this.totalNoFaculty = totalNoFaculty;
    }

    public void setNameOfCourses(String nameOfCourses){
        this.nameOfCourses = nameOfCourses;
    }

    public void setTotalNoStudents(int totalNoStudents){
        this.totalNoStudents = totalNoStudents;
    }

    public void setBlockName(char blockName){
        this.blockName = blockName;
    }

    public void setAcademicRatio(double academicRatio){
        this.academicRatio = academicRatio;
    }

    // Department Details

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }

    public void setTotalStaffs(int totalStaffs){
        this.totalStaffs = totalStaffs;
    }

    public void setTotalLabs(int totalLabs){
        this.totalLabs = totalLabs;
    }

    public void setHighestCgpa(double highestCgpa){
        if (highestCgpa >= 7.5) {
            this.highestCgpa = highestCgpa;
            System.out.println("Able to apply scholarship");
        } else {
            System.out.println("You are not able");
        }
    }

    public void setTotalNoClassrooms(int totalNoClassrooms){
        this.totalNoClassrooms = totalNoClassrooms;
    }

    // Admission Details

    public void setApplicationOpen(boolean isApplicationOpen){
        this.isApplicationOpen = isApplicationOpen;
    }

    public void setTypeOfAdmission(String typeOfAdmission){
        this.typeOfAdmission = typeOfAdmission;
    }

    public void setAdmissionFee(int admissionFee){
        this.admissionFee = admissionFee;
    }

    public void setTotalNoSeats(int totalNoSeats){
        this.totalNoSeats = totalNoSeats;
    }

    public void setAdmissionYear(int admissionYear){
        this.admissionYear = admissionYear;
    }

    public void setFilledSeats(int filledSeats){
        this.filledSeats = filledSeats;
    }

    public void setVacantSeats(int vacantSeats){
        this.vacantSeats = vacantSeats;
    }

    // Exam and Results
    
    public void setExamName(String examName){
        this.examName = examName;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public void setTotalMarks(int totalMarks){
        this.totalMarks = totalMarks;
    }

    public void setPassingMarks(int passingMarks){
        this.passingMarks = passingMarks;
    }

    public void setHighestMarks(int highestMarks){
        this.highestMarks = highestMarks;
    }

    public void setGrade(char grade){
        if (grade == 'A') {
            this.grade = grade;
            System.out.println("Very Good Results");
        } else if (grade == 'B') {
            System.out.println("Good results");
        } else {
            System.out.println("Better Luck Next Time");
        }
    }

    public void setPass(boolean isPass){
        this.isPass = isPass;
    }

    public void setDurationOfHours(double durationOfHours){
        this.durationOfHours = durationOfHours;
    }

    public void setRevaluationApplied(boolean isRevaluationApplied){
        this.isRevaluationApplied = isRevaluationApplied;
    }

}
