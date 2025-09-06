package com.tutorusdude.postgres.utils;

import com.tutorusdude.postgres.constants.DbConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

    public static Connection utils(){
        try {
            Class.forName(DbConstants.DRIVER.getValue());

            Connection connection = DriverManager.getConnection(
                    DbConstants.URL.getValue(),
                    DbConstants.USER_NAME.getValue(),
                    DbConstants.PASSWORD.getValue()
            );
            return connection;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }
}
