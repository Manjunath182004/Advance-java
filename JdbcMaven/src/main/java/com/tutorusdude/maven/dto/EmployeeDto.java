package com.tutorusdude.maven.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class EmployeeDto {
    private int empId;
    private String empName;
    private int salary;
    private long phoneNo;
    private String address;
}

