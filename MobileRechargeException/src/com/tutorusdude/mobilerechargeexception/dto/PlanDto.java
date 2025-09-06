package com.tutorusdude.mobilerechargeexception.dto;

public class PlanDto {

    private String planName;
    private int price;

    public PlanDto(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return planName + " ₹" + price;
    }
}
