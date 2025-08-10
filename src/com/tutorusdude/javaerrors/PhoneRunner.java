package com.tutorusdude.javaerrors;

import com.tutorusdude.javaerrors.phone.MobileRechargeII;
import com.tutorusdude.javaerrors.phone.PhoneNumber;
import com.tutorusdude.javaerrors.phone.RechargeFieldsII.RechargeRequestII;
import com.tutorusdude.javaerrors.phone.RechargeFieldsII.RechargeResultII;

import java.util.ArrayList;
import java.util.List;

public class PhoneRunner {

    public static void main(String[] args) {

        List<RechargeRequestII> requestIIList = new ArrayList<>();

        // creating phone number object

        PhoneNumber phoneNumber1 = new PhoneNumber(9019195736L, "1GB");

        RechargeRequestII request1 = new RechargeRequestII(
                phoneNumber1,
                "prepaid",
                "Jio",
                290,
                "UPI"
        );

        requestIIList.add(request1);

        for (RechargeRequestII r1 : requestIIList){
            RechargeResultII resultII = new RechargeResultII(false, "","");

            boolean success = MobileRechargeII.doRecharge(r1, resultII);

            System.out.println("-----------Recharge Status-----------");

            System.out.println("Phone:" + r1.getPhoneNumber().getNumber());
            System.out.println("Plan:" + r1.getPhoneNumber().getPlan());
            System.out.println("Message:" + resultII.getMessage());
            System.out.println("validity:" + resultII.getValidity());
        }
    }
}
