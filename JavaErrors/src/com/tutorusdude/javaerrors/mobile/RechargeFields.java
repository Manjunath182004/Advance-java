package com.tutorusdude.javaerrors.mobile;

public class RechargeFields {

    public static class RechargeRequest {
        private Long phoneNumber;
        private String rechargeType;
        private String sim;
        private String plans;
        private Integer balance;
        private String through;

        public RechargeRequest(Long phoneNumber, String rechargeType, String sim, String plans, Integer balance, String through) {
            this.phoneNumber = phoneNumber;
            this.rechargeType = rechargeType;
            this.sim = sim;
            this.plans = plans;
            this.balance = balance;
            this.through = through;
        }

        public Long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getRechargeType() {
            return rechargeType;
        }

        public void setRechargeType(String rechargeType) {
            this.rechargeType = rechargeType;
        }

        public String getSim() {
            return sim;
        }

        public void setSim(String sim) {
            this.sim = sim;
        }

        public String getPlans() {
            return plans;
        }

        public void setPlans(String plans) {
            this.plans = plans;
        }

        public Integer getBalance() {
            return balance;
        }

        public void setBalance(Integer balance) {
            this.balance = balance;
        }

        public String getThrough() {
            return through;
        }

        public void setThrough(String through) {
            this.through = through;
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
