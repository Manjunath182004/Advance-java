package com.tutorusdude.javaerrors.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Recharge {

    public static void main(String[] args) {

       List<RechargeRequest> rechargeRequest = new ArrayList<>();

       rechargeRequest.add(new RechargeRequest(9019195736L, "JIO", 249, "Prepaid", "UPI"));


       rechargeRequest.add(new RechargeRequest(9632662892L, "Airtel", 349, "Paid", "creditCard"));

       for (RechargeRequest request: rechargeRequest){
           RechargeResult rechargeResult = mobileRecharge(request);

           System.out.println("Recharge status: " + " " + rechargeResult.getSuccess());
           System.out.println("Message: " + " " + rechargeResult.getMessage());
       }

    }



    public static RechargeResult mobileRecharge(RechargeRequest rechargeRequest){

        Long mobileNo = rechargeRequest.getMobileNo();
        Integer amount = rechargeRequest.getAmount();

        if (mobileNo  == null && mobileNo.longValue()!= 10 && amount == null && amount >= 100) {
            return new RechargeResult(false, "Invalid mobile number or amount.");
        }

        return new RechargeResult(true, "Recharge of  " + amount + "₹" + " successful for " +  mobileNo);
    }

    static class RechargeRequest{
        private Long mobileNo;
        private String simType;
        private Integer amount;
        private String typeOfRecharge;
        private String paymentType;

        public RechargeRequest(Long mobileNo, String simType, Integer amount, String typeOfRecharge, String paymentType){
            this.mobileNo = mobileNo;
            this.amount = amount;
            this.paymentType= paymentType;
            this.typeOfRecharge = typeOfRecharge;
            this.simType = simType;
        }

        public Long getMobileNo(){

            return this.mobileNo;
        }

        public String getSimType(){

            return this.simType;
        }

        public Integer getAmount(){

            return this.amount;
        }

        public String getTypeOfRecharge(){

            return this.typeOfRecharge;
        }

        public String getPaymentType(){
            return this.paymentType;
        }

    }

    static class RechargeResult{
        private Boolean success;
        private String message;

        public RechargeResult(Boolean success, String message){
            this.message = message;
            this.success = success;
        }

        public Boolean getSuccess(){
            return this.success;
        }

        public String getMessage(){
            return this.message;
        }
    }
}
