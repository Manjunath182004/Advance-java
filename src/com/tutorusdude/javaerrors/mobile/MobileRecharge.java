package com.tutorusdude.javaerrors.mobile;

import com.tutorusdude.javaerrors.mobile.RechargeFields.RechargeRequest;
import com.tutorusdude.javaerrors.mobile.RechargeFields.RechargeResult;

public class MobileRecharge {

    public boolean doRecharge(RechargeRequest rechargeRequest, RechargeResult rechargeResult, int amount){

        // validating input fields
        if (rechargeRequest != null && rechargeResult != null){
            // validating the amount
            if (amount > 0 && amount <= 100 ){
                // Checking Account Balance for validation
                if (rechargeRequest.getBalance() > amount) {

                    // Making the Recharge by taking phone number and amount
                    Long mobileNo = rechargeRequest.getPhoneNumber();
                    Integer balanceAmt = rechargeRequest.getBalance();

                    //getting message
                   rechargeResult.setResult(true);
                   rechargeResult.setMessage("Recharge has Successfull " + mobileNo);
                   rechargeResult.setValidity("Upto 28 days");
                } else {
                    rechargeResult.setResult(false);
                    rechargeResult.setMessage("Insufficient balance for recharge.");
                    rechargeResult.setValidity("Not Available");
                    System.out.println("Please check the balance.");
                }
            } else {
                System.out.println("given i/p is not Valid");
            }
        } else {
            System.out.println("Given conditions are not satisfied Please enter once again");
        }
        return false;
    }
}
