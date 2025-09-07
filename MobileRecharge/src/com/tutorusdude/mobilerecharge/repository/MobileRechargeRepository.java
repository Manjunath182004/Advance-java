package com.tutorusdude.mobilerecharge.repository;

import com.tutorusdude.mobilerecharge.dto.MobileRechargeDto.RechargeRequest;
import com.tutorusdude.mobilerecharge.dto.PlanDto;

import java.util.ArrayList;
import java.util.List;

public class MobileRechargeRepository {

    private List<RechargeRequest> rechargeHistory = new ArrayList<>();
    private List<PlanDto> availablePlans = new ArrayList<>();

    public void save(RechargeRequest request) {
        rechargeHistory.add(request);
        System.out.println("Recharge saved for: " + request.getPhoneNumber());
    }

    public List<RechargeRequest> getRecharge(Long phoneNumber) {
        List<RechargeRequest> matches = new ArrayList<>();
        for (RechargeRequest r : rechargeHistory) {
            if (r.getPhoneNumber().equals(phoneNumber)) {
                matches.add(r);
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

    public PlanDto searchPlan(String planName) {
        for (PlanDto dto : availablePlans) {
            if (dto.getPlanName().equalsIgnoreCase(planName)) {
                return dto;
            }
        }
        return null;
    }
}
