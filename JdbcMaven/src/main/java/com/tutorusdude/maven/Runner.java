package com.tutorusdude.maven;

import com.tutorusdude.maven.dto.EmployeeDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {

        public static void main(String[] args) {
            EmployeeDto dto = new EmployeeDto();

            dto.setEmpId(101);
            dto.setEmpName("Manjunatha");

            System.out.println(dto.getEmpId());
            System.out.println(dto.getEmpName());
        }
}
