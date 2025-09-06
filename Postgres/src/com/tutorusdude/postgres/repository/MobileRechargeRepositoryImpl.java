package com.tutorusdude.postgres.repository;

import com.tutorusdude.postgres.dto.MobileRechargeDto;

import java.util.List;

public interface MobileRechargeRepositoryImpl {

    public boolean save(MobileRechargeDto dto);
    public List<MobileRechargeDto> readAll();
    public boolean update(MobileRechargeDto dto);
    public boolean delete(MobileRechargeDto dto);
    public List<MobileRechargeDto> findByPlan(String plan);
    public List<String> getAllPlans();
}
