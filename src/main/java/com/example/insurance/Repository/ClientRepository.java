package com.example.insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.insurance.Model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    
}
