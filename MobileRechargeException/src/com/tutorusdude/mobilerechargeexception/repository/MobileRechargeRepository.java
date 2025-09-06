package com.tutorusdude.mobilerechargeexception.repository;

import com.tutorusdude.mobilerechargeexception.dto.MobileRechargeDto.RechargeRequest;
import com.tutorusdude.mobilerechargeexception.dto.PlanDto;
import com.tutorusdude.mobilerechargeexception.exception.PhoneNumberNotExitsException;
import com.tutorusdude.mobilerechargeexception.exception.PlanNotExitsException;

import java.util.ArrayList;
import java.util.List;

public class MobileRechargeRepository {

    private List<RechargeRequest> rechargeHistory = new ArrayList<>();
    private List<PlanDto> availablePlans = new ArrayList<>();

    public void save(RechargeRequest request) {
        rechargeHistory.add(request);
        System.out.println("Recharge saved for: " + request.getPhoneNumber());
    }

    public List<RechargeRequest> getRecharge(Long phoneNumber) throws PhoneNumberNotExitsException {
        List<RechargeRequest> matches = new ArrayList<>();
        for (RechargeRequest r : rechargeHistory) {
            if (r.getPhoneNumber().equals(phoneNumber)) {
                matches.add(r);
            }
            if (matches.isEmpty()){
                throw new PhoneNumberNotExitsException("For this Phone Number Recharge History NA...Please Recharge");
            }
        }
        return matches;
    }

    public List<RechargeRequest> getAllRecharge() {
        return rechargeHistory;
    }

    public void addPlan(PlanDto plan) {
        availablePlans.add(plan);
    }

    public PlanDto searchPlan(String planName) throws PlanNotExitsException {
        for (PlanDto dto : availablePlans) {
            if (dto.getPlanName().equalsIgnoreCase(planName)) {
                return dto;
            }
        }
        throw new PlanNotExitsException("Given plan not exits Please Check..");
    }
}
