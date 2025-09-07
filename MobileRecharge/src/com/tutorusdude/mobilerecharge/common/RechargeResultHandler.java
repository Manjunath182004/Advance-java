package com.tutorusdude.mobilerecharge.common;

import com.tutorusdude.mobilerecharge.dto.MobileRechargeDto.RechargeRequest;
import com.tutorusdude.mobilerecharge.dto.MobileRechargeDto.RechargeResult;

public class RechargeResultHandler {

    public void getSuccess(RechargeRequest request, RechargeResult result) {
        result.setResult(true);
        result.setMessage("Recharge Successful for " + request.getPhoneNumber());
        result.setValidity("up to 28 days");
    }

    public void getFailure(RechargeRequest request, RechargeResult result) {
        result.setResult(false);
        result.setMessage("Insufficient balance for " + request.getPhoneNumber());
        result.setValidity("Not Available");
    }

    public void getInvalid(RechargeResult result) {
        result.setResult(false);
        result.setMessage("Invalid Recharge Request");
        result.setValidity("Invalid Request");
    }
}
