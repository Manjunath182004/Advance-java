package com.tutorusdude.javaerrors;

import com.tutorusdude.javaerrors.mobile.MobileRecharge;
import com.tutorusdude.javaerrors.mobile.RechargeFields.RechargeRequest;
import com.tutorusdude.javaerrors.mobile.RechargeFields.RechargeResult;

import java.util.ArrayList;
import java.util.List;

public class MobileRechargeRunner {

    public static void main(String[] args) {

//        RechargeRequest request = new RechargeRequest(
//                9019195736L,
//                "prepaid",
//                "Jio",
//                "28 days Unlimited calls 1.5GB/day",
//                500,
//                "UPI"
//        );

        List<RechargeRequest> request = new ArrayList<>();

        request.add(new RechargeRequest(
                9019195736L,
                "prepaid",
                "Jio",
                "28 days Unlimited calls 1.5GB/day",
                1,
                "UPI"
        ));


        for(RechargeRequest r : request){
            MobileRecharge mobileRecharge = new MobileRecharge();
            RechargeResult result = new RechargeResult(false, "", "");
            boolean status = mobileRecharge.doRecharge(r, result, 50);

            System.out.println("--- Recharge Status ---");
            System.out.println("Success: " + result.getResult());
            System.out.println("Message: " + result.getMessage());
            System.out.println("Validity: " + result.getValidity());


        }

    }
}
