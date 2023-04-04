package com.example.insurance.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.Model.Claim;
import com.example.insurance.Model.Client;
import com.example.insurance.Model.InsurancePolicy;
import com.example.insurance.Repository.ClaimRepository;
import com.example.insurance.Repository.ClientRepository;
import com.example.insurance.Repository.PolicyRepository;

@Service
public class ServiceImplemented implements InsuranceService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClaimRepository claimRepository;

    @Autowired
    PolicyRepository policyRepository;

    

    public ServiceImplemented(InsuranceService iService) {
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientsById(Integer id) {
        Client client = clientRepository.getReferenceById(id);
        return client;
    }

    @Override
    public Client newClient(Client client) {
        clientRepository.save(client);
        return client;
    }

    @Override
    public Client updateClient(Client client) {
        clientRepository.save(client);
        return client;
    }

    @Override
    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<InsurancePolicy> getAllPolicy() {
        return policyRepository.findAll();
    }

    @Override
    public InsurancePolicy getPolicyById(Integer id) {
        InsurancePolicy policy = policyRepository.getReferenceById(id);
        return policy;
    }

    @Override
    public InsurancePolicy newPolicy(InsurancePolicy policy) {
        policyRepository.save(policy);
        return policy;
    }

    @Override
    public InsurancePolicy updatePolicy(InsurancePolicy policy) {
        policyRepository.save(policy);
        return policy;
    }

    @Override
    public void deletePolicy(Integer id) {
        policyRepository.deleteById(id);
    }

    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public Claim getClaimById(Integer id) {
        Claim claim = claimRepository.getReferenceById(id);
        return claim;
    }

    @Override
    public Claim newClaim(Claim claim) {
        claimRepository.save(claim);
        return claim;
    }

    @Override
    public Claim updateClaim(Claim claim) {
        claimRepository.save(claim);
        return claim;
    }

    @Override
    public void deleteClaim(Integer id) {
        claimRepository.deleteById(id);
    }

}
