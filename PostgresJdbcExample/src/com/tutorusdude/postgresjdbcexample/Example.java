package com.tutorusdude.postgresjdbcexample;

import java.sql.*;

public class Example {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "M@nju2004";


        try{

            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);
            
            int phoneNo = 901676;
            String rechargeType = "PrePaid";
            String sim = "VN";
            int balance = 90000;
            String through = "Gpay";
            String plan = "4.5GB/ day 28 days";

//            String insertQuery = "insert into rechargerequest(phone_no, recharge_type, sim, balance, through, plan) values (?,?,?,?,?,?)";
//
//            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//            preparedStatement.setInt(1, phoneNo);
//            preparedStatement.setString(2, rechargeType );
//            preparedStatement.setString(3, sim);
//            preparedStatement.setInt(4, balance);
//            preparedStatement.setString(5, through);
//            preparedStatement.setString(6, plan);

            String updateQuery = "update rechargerequest set balance = ?, sim = ? where plan = ?; ";

            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setInt(1, balance);
            preparedStatement.setString(2, sim);
            preparedStatement.setString(3, plan);

            preparedStatement.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
