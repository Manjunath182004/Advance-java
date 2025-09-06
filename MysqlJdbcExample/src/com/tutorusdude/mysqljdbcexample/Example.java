package com.tutorusdude.mysqljdbcexample;

import java.sql.*;

public class Example {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/MOBILERECAHRGE";
        String username = "root";
        String password = "M@nju2004";

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);

            Statement statement = connection.createStatement();

            int phoneNo = 90167;
            String rechargeType = "PrePaid";
            String sim = "VN";
            int balance = 5000;
            String through = "Gpay";


            String insertQuery = "insert into rechargerequest(phone_number, recharge_type, sim, balance, through) values (?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, phoneNo);
            preparedStatement.setString(2, rechargeType );
            preparedStatement.setString(3, sim);
            preparedStatement.setInt(4, balance);
            preparedStatement.setString(5, through);

            preparedStatement.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
