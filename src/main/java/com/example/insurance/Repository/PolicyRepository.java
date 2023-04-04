package com.example.insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.insurance.Model.InsurancePolicy;

public interface PolicyRepository extends JpaRepository<InsurancePolicy, Integer> {
    
}
