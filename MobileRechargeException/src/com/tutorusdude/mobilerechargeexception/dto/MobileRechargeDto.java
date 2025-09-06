package com.tutorusdude.mobilerechargeexception.dto;

public class MobileRechargeDto {

    public static class RechargeRequest {
        private Long phoneNumber;
        private PlanDto plan;
        private String rechargeType;
        private String sim;
        private Integer balance;
        private String through;

        public RechargeRequest(Long phoneNumber, PlanDto plan, String rechargeType, String sim, Integer balance, String through) {
            this.phoneNumber = phoneNumber;
            this.plan = plan;
            this.rechargeType = rechargeType;
            this.sim = sim;
            this.balance = balance;
            this.through = through;
        }

        public Long getPhoneNumber() {
            return phoneNumber;
        }

        public PlanDto getPlan() {
            return plan;
        }

        public Integer getBalance() {
            return balance;
        }

        public String getRechargeType() {
            return rechargeType;
        }

        public String getSim() {
            return sim;
        }

        public String getThrough() {
            return through;
        }
    }

    public static class RechargeResult {
        private Boolean result;
        private String message;
        private String validity;

        public RechargeResult(Boolean result, String message, String validity) {
            this.result = result;
            this.message = message;
            this.validity = validity;
        }

        public Boolean getResult() {
            return result;
        }

        public void setResult(Boolean result) {
            this.result = result;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getValidity() {
            return validity;
        }

        public void setValidity(String validity) {
            this.validity = validity;
        }
    }
}
