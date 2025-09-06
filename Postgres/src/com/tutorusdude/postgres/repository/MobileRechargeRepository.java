package com.tutorusdude.postgres.repository;

import com.tutorusdude.postgres.constants.QueryConstants;
import com.tutorusdude.postgres.dto.MobileRechargeDto;
import com.tutorusdude.postgres.utils.DbUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MobileRechargeRepository implements MobileRechargeRepositoryImpl {

    DbUtils dbUtils = new DbUtils();

    public boolean save(MobileRechargeDto dto){

        try{

            Connection connection = DbUtils.utils();
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.INSERT_QUERY);

            preparedStatement.setInt(1, dto.getPhoneNumber());
            preparedStatement.setString(2, dto.getRechargeType());
            preparedStatement.setString(3, dto.getSim());
            preparedStatement.setInt(4, dto.getBalance());
            preparedStatement.setString(5, dto.getThrough());
            preparedStatement.setString(6, dto.getPlan());

            preparedStatement.execute();
            return true;

       } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<MobileRechargeDto> readAll() {
        List<MobileRechargeDto> list = new ArrayList<>();

        try{

            Connection connection = DbUtils.utils();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(QueryConstants.READ_ALL_QUERY);

            while (resultSet.next()){

                    int phoneNo = resultSet.getInt("phone_no");
                    String recharge_type = resultSet.getString("recharge_type");
                    String simName = resultSet.getString("sim");
                    int balance = resultSet.getInt("balance");
                    String through = resultSet.getString("through");
                    String planName = resultSet.getString("plan");

                    MobileRechargeDto dto = new MobileRechargeDto(phoneNo, planName, recharge_type,simName, balance, through);

                list.add(dto);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    public boolean update(MobileRechargeDto dto){
        try{

            Connection connection = DbUtils.utils();

            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.UPDATE_PLAN_BY_SIM);

            preparedStatement.setString(1, dto.getPlan());
            preparedStatement.setString(2, dto.getSim());

            preparedStatement.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(MobileRechargeDto dto){
        try{

            Connection connection = DbUtils.utils();

            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.DELETE_BY_PHONE_NUMBER);

            preparedStatement.setInt(1, dto.getPhoneNumber());

            preparedStatement.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<MobileRechargeDto> findByPlan(String plan){
        List<MobileRechargeDto> list = new ArrayList<>();
        try{

            Connection connection = DbUtils.utils();

            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.FIND_BY_PLAN_QUERY);

            preparedStatement.setString(1, plan);

           ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int phoneNo = resultSet.getInt("phone_no");
                String rechargeType = resultSet.getString("recharge_type");
                String simName = resultSet.getString("sim");
                int balance = resultSet.getInt("balance");
                String through = resultSet.getString("through");
                String planName = resultSet.getString("plan");

                MobileRechargeDto dto = new MobileRechargeDto(phoneNo, planName, rechargeType, simName, balance, through);
                list.add(dto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getAllPlans() {
        List<String> plans = new ArrayList<>();

        try{

            Connection connection = DbUtils.utils();
            PreparedStatement preparedStatement = connection.prepareStatement(QueryConstants.FIND_ALL_PLAN);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                plans.add(resultSet.getString("plan"));
            }

        }    catch (SQLException e) {
           e.printStackTrace();
        }
        return plans;
    }
}
