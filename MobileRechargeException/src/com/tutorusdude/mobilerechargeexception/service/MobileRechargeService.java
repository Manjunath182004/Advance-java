package com.tutorusdude.mobilerechargeexception.service;

import com.tutorusdude.mobilerechargeexception.common.RechargeResultHandler;
import com.tutorusdude.mobilerechargeexception.dto.MobileRechargeDto.RechargeRequest;
import com.tutorusdude.mobilerechargeexception.dto.MobileRechargeDto.RechargeResult;
import com.tutorusdude.mobilerechargeexception.dto.PlanDto;
import com.tutorusdude.mobilerechargeexception.exception.InsufficientBalanceException;
import com.tutorusdude.mobilerechargeexception.exception.InvalidRechargeResult;
import com.tutorusdude.mobilerechargeexception.exception.PhoneNumberNotExitsException;
import com.tutorusdude.mobilerechargeexception.exception.PlanNotExitsException;
import com.tutorusdude.mobilerechargeexception.repository.MobileRechargeRepository;

import java.util.List;

public class MobileRechargeService {

    private final RechargeResultHandler resultHandler = new RechargeResultHandler();
    private final MobileRechargeRepository repository = new MobileRechargeRepository();

    public boolean doRecharge(RechargeRequest request, RechargeResult result) throws InsufficientBalanceException, InvalidRechargeResult , PlanNotExitsException{
        if (request != null && result != null) {
            int required = request.getPlan().getPrice();
            if (request.getBalance() >= required) {
                resultHandler.getSuccess(request, result);
                repository.save(request);
                return true;
            } else {
                resultHandler.getFailure(request, result);
                throw new InsufficientBalanceException("Insufficient Bank Balance..");
            }
        } else {
            resultHandler.getInvalid(result);
        }
        return false;
    }

    public void addPlan(PlanDto plan) {
        repository.addPlan(plan);
    }

    public PlanDto searchPlanByName (String planName) throws PlanNotExitsException {
        return repository.searchPlan(planName);
    }

    public List<RechargeRequest> getRechargesByPhone(Long phoneNumber) throws PhoneNumberNotExitsException {
        return repository.getRecharge(phoneNumber);
    }

    public List<RechargeRequest> getAllRecharges() {
        return repository.getAllRecharge();
    }
}
