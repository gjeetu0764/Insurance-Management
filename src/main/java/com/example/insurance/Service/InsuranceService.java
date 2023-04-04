package com.example.insurance.Service;

import java.util.List;

import com.example.insurance.Model.Claim;
import com.example.insurance.Model.Client;
import com.example.insurance.Model.InsurancePolicy;

public interface InsuranceService {

    public List<Client> getAllClients();

    public Client getClientsById(Integer id);

    public Client newClient(Client client);

    public Client updateClient(Client client);

    public void deleteClient(Integer id);

    public List<InsurancePolicy> getAllPolicy();

    public InsurancePolicy getPolicyById(Integer id);

    public InsurancePolicy newPolicy(InsurancePolicy policy);

    public InsurancePolicy updatePolicy(InsurancePolicy policy);

    public void deletePolicy(Integer id);

    public List<Claim> getAllClaims();

    public Claim getClaimById(Integer id);

    public Claim newClaim(Claim claim);

    public Claim updateClaim(Claim claim);

    public void deleteClaim(Integer id);
}
