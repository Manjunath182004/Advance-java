package com.tutorusdude.mysql.dto;

public class MobileRechargeDto {

    private int phoneNumber;
    private String rechargeType;
    private String sim;
    private int balance;
    private String through;

    public MobileRechargeDto(){

    }

    public MobileRechargeDto(int phoneNumber, String rechargeType, String sim, int balance, String through){
        this.phoneNumber = phoneNumber;
        this.rechargeType = rechargeType;
        this.sim = sim;
        this.balance = balance;
        this.through = through;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getRechargeType(){
        return rechargeType;
    }

    public void setRechargeType(String rechargeType){
        this.rechargeType = rechargeType;
    }

    public String getSim(){
        return sim;
    }

    public void setSim(String sim){
        this.sim = sim;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getThrough(){
        return through;
    }

    public void setThrough(String through){
        this.through = through;
    }

    @Override
    public String toString() {
        return "MobileRechargeDto{" +
                "phoneNumber=" + phoneNumber +
                ", rechargeType='" + rechargeType + '\'' +
                ", sim='" + sim + '\'' +
                ", balance=" + balance +
                ", through='" + through + '\'' +
                '}';
    }
}
