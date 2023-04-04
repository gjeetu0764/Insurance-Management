package com.example.insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.insurance.Model.Claim;

public interface ClaimRepository extends JpaRepository< Claim, Integer> {
    
}
