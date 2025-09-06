package com.tutorusdude.postgres.constants;

public class QueryConstants {

    public static String INSERT_QUERY = "insert into rechargerequest(phone_no, recharge_type, sim, balance, through, plan) values (?,?,?,?,?,?)";
    public static String READ_ALL_QUERY = "select * from rechargerequest;";
    public static String UPDATE_PLAN_BY_SIM = "update rechargerequest set plan = ? where sim = ?;";
    public static String FIND_BY_PLAN_QUERY = "SELECT * FROM rechargerequest WHERE plan = ?";
    public static String DELETE_BY_PHONE_NUMBER = "delete from rechargerequest where phone_no = ?;";
    public static String FIND_ALL_PLAN = "SELECT DISTINCT plan FROM rechargerequest;";
}
