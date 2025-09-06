package com.tutorusdude.mysqljdbcexample;

import java.sql.*;

public class Runner {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/MOBILERECAHRGE";
        String username = "root";
        String password = "M@nju2004";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println(connection);

            Statement statement = connection.createStatement();

//            String insertQuery = "insert into rechargerequest(phone_number, recharge_type, sim, balance, through) values (11111, 'Prepaid', 'VN', 10000, 'PhonePay'); ";
//
//            statement.execute(insertQuery);

            String readQuery = "select * from rechargerequest where sim = 'Jio';";

            ResultSet resultSet = statement.executeQuery(readQuery);
            System.out.println(resultSet);

            while (resultSet.next()){
                int number = resultSet.getInt("phone_number");
                String type = resultSet.getString("recharge_type");
                String sim = resultSet.getString("sim");
                int balance = resultSet.getInt("balance");
                String through = resultSet.getString("through");

                System.out.println("Phone Number: " + number);
                System.out.println("Sim Name: " + sim);
                System.out.println("recharge type: " + type);
                System.out.println("balance: " + balance);
                System.out.println("through : " + through);
                System.out.println("------------------------------------------------");

            }
        } catch (ClassNotFoundException e){
           e.printStackTrace();

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
