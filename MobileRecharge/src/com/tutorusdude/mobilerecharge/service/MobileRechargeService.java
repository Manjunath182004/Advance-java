package com.tutorusdude.mobilerecharge.service;

import com.tutorusdude.mobilerecharge.common.RechargeResultHandler;
import com.tutorusdude.mobilerecharge.dto.MobileRechargeDto.RechargeRequest;
import com.tutorusdude.mobilerecharge.dto.MobileRechargeDto.RechargeResult;
import com.tutorusdude.mobilerecharge.dto.PlanDto;
import com.tutorusdude.mobilerecharge.repository.MobileRechargeRepository;

import java.util.List;

public class MobileRechargeService {

    private final RechargeResultHandler resultHandler = new RechargeResultHandler();
    private final MobileRechargeRepository repository = new MobileRechargeRepository();

    public boolean doRecharge(RechargeRequest request, RechargeResult result) {
        if (request != null && result != null) {
            int required = request.getPlan().getPrice();
            if (request.getBalance() >= required) {
                resultHandler.getSuccess(request, result);
                repository.save(request);
                return true;
            } else {
                resultHandler.getFailure(request, result);
            }
        } else {
            resultHandler.getInvalid(result);
        }
        return false;
    }

    public void addPlan(PlanDto plan) {
        repository.addPlan(plan);
    }

    public PlanDto searchPlanByName(String planName) {
        return repository.searchPlan(planName);
    }

    public List<RechargeRequest> getRechargesByPhone(Long phoneNumber) {
        return repository.getRecharge(phoneNumber);
    }

    public List<RechargeRequest> getAllRecharges() {
        return repository.getAllRecharge();
    }
}
