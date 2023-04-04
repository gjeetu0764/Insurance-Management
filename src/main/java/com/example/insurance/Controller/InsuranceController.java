package com.example.insurance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.insurance.Model.Claim;
import com.example.insurance.Model.Client;
import com.example.insurance.Model.InsurancePolicy;
import com.example.insurance.Service.InsuranceService;

@RestController
public class InsuranceController {

    @Autowired
    private InsuranceService insuranceService;

    @GetMapping("/clients")
    public List<Client> showClients() {

        return insuranceService.getAllClients();
    }

    @GetMapping("/clients/{id}")
    public Client showClientById(@PathVariable Integer id) {

        Client clientId= insuranceService.getClientsById(id);
        return clientId;
    }

    @PostMapping("/clients")
    public Client addClient(@RequestBody Client client) {
        Client newClient= insuranceService.newClient(client);
        return newClient;
    }

    @PutMapping("/clients/{id}")
    public Client updateClient(@RequestBody Client client) {
    Client updateClient = insuranceService.updateClient(client);
    return updateClient;

    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable Integer id) {
        insuranceService.deleteClient(id);
    }

    @GetMapping("/policies")
    public List<InsurancePolicy> showPolicy() {

        return insuranceService.getAllPolicy();
    }

    @GetMapping("/policies/{id}")
    public InsurancePolicy showPolicyById(@PathVariable Integer id) {

        InsurancePolicy policyId= insuranceService.getPolicyById(id);
        return policyId;
    }

    @PostMapping("/policies")
    public InsurancePolicy addPolicy(@RequestBody InsurancePolicy policy) {
        InsurancePolicy newPolicy= insuranceService.newPolicy(policy);
        return newPolicy;
    }

    @PutMapping("/policies/{id}")
    public InsurancePolicy updatePolicy(@RequestBody InsurancePolicy policy) {
    InsurancePolicy updatePolicy = insuranceService.updatePolicy(policy);
    return updatePolicy;

    }

    @DeleteMapping("/policies/{id}")
    public void deletePolicy(@PathVariable Integer id) {
        insuranceService.deletePolicy(id);
    }

    @GetMapping("/claims")
    public List<Claim> showClaims() {

        return insuranceService.getAllClaims();
    }

    @GetMapping("/claims/{id}")
    public Claim showClaimById(@PathVariable Integer id) {

        Claim claimId= insuranceService.getClaimById(id);
        return claimId;
    }

    @PostMapping("/claims")
    public Claim addClaim(@RequestBody Claim claim) {
        Claim newClaim= insuranceService.newClaim(claim);
        return newClaim;
    }

    @PutMapping("/claims/{id}")
    public Claim updateClaim(@RequestBody Claim claim) {
    Claim updateClaim = insuranceService.updateClaim(claim);
    return updateClaim;

    }

    @DeleteMapping("/claims/{id}")
    public void deleteClaim(@PathVariable Integer id) {
        insuranceService.deleteClaim(id);
    }
}
