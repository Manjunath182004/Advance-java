package com.tutorusdude.mysql;

import com.tutorusdude.mysql.dto.MobileRechargeDto;
import com.tutorusdude.mysql.service.MobileRechargeService;

public class Runner {

    public static void main(String[] args) {

        MobileRechargeService service = new MobileRechargeService();

       // insert
        MobileRechargeDto dto = new MobileRechargeDto(
                9014,
                "Prepaid",
                "Jio",
                1000,
                "Gpay"
        );

        service.save(dto);

    }
}
