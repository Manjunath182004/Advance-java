package com.tutorusdude.javaerrors.exceptions;

import java.security.SecureRandom;

public class otpGenerate {

    public static void main(String[] args) {

        System.out.println(generateOtp());
        System.out.println(generateOtp());
        System.out.println(generateOtp());

    }

    public static int generateOtp(){
        SecureRandom secureRandom = new SecureRandom();
        int otp = 100000 + secureRandom.nextInt(80000);
        return otp;
    }
}
