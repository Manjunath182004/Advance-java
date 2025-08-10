package com.tutorusdude.javaerrors.phone;

import com.tutorusdude.javaerrors.phone.RechargeFieldsII.RechargeRequestII;
import com.tutorusdude.javaerrors.phone.RechargeFieldsII.RechargeResultII;

public class MobileRechargeII {

    public static boolean doRecharge(RechargeRequestII rechargeRequestII, RechargeResultII rechargeResultII){
        // Validating the Input Fields
        if (rechargeRequestII != null && rechargeResultII != null){
            PhoneNumber phoneNumber = rechargeRequestII.getPhoneNumber();
            Integer requiredBalance = 0;

            // validating plan
            if (phoneNumber.getPlan().contains("1.5GB")){
                requiredBalance = 249;
            } else if (phoneNumber.getPlan().contains("1GB")){
                requiredBalance = 199;
            } else if (phoneNumber.getPlan().contains("2.5GB")) {
                requiredBalance = 499;
            } 

            if (rechargeRequestII.getBalance() >= requiredBalance){
                rechargeResultII.setResult(true);
                rechargeResultII.setMessage("Recharge Successful for" + " " + phoneNumber.getNumber());
                rechargeResultII.setValidity("up to 28 days");
                return true;
            } else {
                rechargeResultII.setResult(false);
                rechargeResultII.setMessage("Insufficient balance for " + phoneNumber.getNumber());
                rechargeResultII.setValidity("Not Available");
            }
        } else {
            System.out.println("Invalid Recharge Request or Result object.");
        }
        return false;
    }
}
