package com.tutorusdude.javaerrors.phone;

public class PhoneNumber {

    private Long number;
    private String plan;

    public PhoneNumber(Long number, String plan) {
        this.number = number;
        this.plan = plan;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
