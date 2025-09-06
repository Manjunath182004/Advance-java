package com.tutorusdude.postgresjdbcexample;

import java.sql.*;

public class Runner {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "M@nju2004";

        try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);

            Statement statement = connection.createStatement();

//            String insertQuery = "insert into rechargerequest(phone_no, recharge_type, sim, balance, through, plan) values (098778, 'prepaid', 'gdhdjhs', 4000, 'PhonePay', '1GB/Day 28 days Unlimited calls');";
//
//            statement.execute(insertQuery);

            String updateQuery = "update rechargerequest set balance = 10000 where sim = 'Jio';";
            statement.execute(updateQuery);

            String readQuery = "select * from rechargerequest;";
            ResultSet resultSet = statement.executeQuery(readQuery);

            System.out.println(resultSet);

           while (resultSet.next()){
               int phoneNo = resultSet.getInt("phone_no");
               String recharge_type = resultSet.getString("recharge_type");
               String simName = resultSet.getString("sim");
               int balance = resultSet.getInt("balance");
               String through = resultSet.getString("through");
               String planName = resultSet.getString("plan");

               System.out.println("Phone Number: " + phoneNo);
               System.out.println("Sim Name: " + simName);
               System.out.println("recharge type: " + recharge_type);
               System.out.println("balance: " + balance);
               System.out.println("through : " + through);
               System.out.println("plan name : " + planName);
               System.out.println("------------------------------------------------");
           }

        } catch (ClassNotFoundException e){
            e.printStackTrace();
            
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
