package com.tutorusdude.postgres.service;

import com.tutorusdude.postgres.dto.MobileRechargeDto;
import com.tutorusdude.postgres.repository.MobileRechargeRepository;
import com.tutorusdude.postgres.repository.MobileRechargeRepositoryImpl;

import java.util.List;

public class MobileRechargeService  {

    private final MobileRechargeRepositoryImpl repository;

    public MobileRechargeService(MobileRechargeRepositoryImpl repository) {
        this.repository = repository;
    }

    public boolean doRecharge(MobileRechargeDto dto){
        if (dto != null){
            if (dto.getBalance() >= 100){
                System.out.println("New data Saved Successfully..");
                repository.save(dto);
                return true;
            } else {
                System.out.println("Recharge Failed...low Balance");
            }
        } else {
            System.out.println("Recharge Dto is null");
            return false;
        }
        return false;
    }

    public boolean updateRecharge(MobileRechargeDto dto){
        if(dto != null){
            if (dto.getPlan() != null && dto.getSim() != null && dto.getSim().length() >= 2){
                System.out.println("Updated Successfully...");
                repository.update(dto);
                return true;
            } else {
                System.out.println("Check plan and sim properly..");
            }
        } else {
            System.out.println("Recharge Dto is null");
            return false;
        }
        return false;
    }

    public boolean deleteRecharge(MobileRechargeDto dto){
        if(dto != null){
            if (String.valueOf(dto.getPhoneNumber()).length() >= 5){
                System.out.println("deleted Successfully...");
                repository.delete(dto);
                return true;
            } else {
                System.out.println("Check plan and sim properly..");
            }
        } else {
            System.out.println("Recharge Dto is null");
            return false;
        }
        return false;
    }

    public List<MobileRechargeDto> getAllRecharges() {
        List<MobileRechargeDto> list = repository.readAll();
        if (list.isEmpty()) {
            System.out.println("No recharge records found in DB!");
        } else {
            repository.readAll();
            System.out.println(list);
            System.out.println("Found " + list.size() + " recharge record(s).");

        }
        return list;
    }

    public List<MobileRechargeDto> findByPlan(String plan){
        List<MobileRechargeDto> list = repository.findByPlan(plan);
        if (list.isEmpty()){
                System.out.println("Plan not found : " + plan);
        } else {
            System.out.println("Found " + list.size() + " records of plan: " + plan);
        }
       return list;
    }

    public List<String> getAllPlans(){
        return repository.getAllPlans();
    }
}
