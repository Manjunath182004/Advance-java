package com.tutorusdude.mysql.service;

import com.tutorusdude.mysql.dto.MobileRechargeDto;
import com.tutorusdude.mysql.repository.MobileRechargeRepository;

public class MobileRechargeService {

    MobileRechargeRepository repository = new MobileRechargeRepository();

    public boolean save(MobileRechargeDto dto){
        if (dto != null){
            if (String.valueOf(dto.getPhoneNumber()).length() <= 5 && dto.getBalance() >= 100){
                System.out.println("Value Inserted Successfully...");
                repository.save(dto);
                return true;
            } else {
                System.out.println("Phone Number is In valid and Balance not exits");
                return false;
            }
        } else {
            System.out.println("dto false");
        }
        return false;
    }
}
