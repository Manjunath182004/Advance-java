package com.tutorusdude.mysql.repository;

import com.mysql.cj.jdbc.Driver;
import com.tutorusdude.mysql.constants.DbConstants;
import com.tutorusdude.mysql.constants.QueryConstants;
import com.tutorusdude.mysql.dto.MobileRechargeDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MobileRechargeRepository {

    public  boolean save(MobileRechargeDto dto){


        try {
            Class.forName(DbConstants.DRIVER.getValue());

            Connection connection = DriverManager.getConnection(DbConstants.URL.getValue(), DbConstants.USER_NAME.getValue(), DbConstants.PASSWORD.getValue());

            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.INSERT_QUERY);

            preparedStatement.setInt(1, dto.getPhoneNumber());
            preparedStatement.setString(2, dto.getRechargeType());
            preparedStatement.setString(3, dto.getSim());
            preparedStatement.setInt(4, dto.getBalance());
            preparedStatement.setString(6, dto.getThrough());

            preparedStatement.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
