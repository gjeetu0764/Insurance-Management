package com.example.insurance.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name="client")
public class Client {

    @Id
    private Integer ID;
    private String name;
    private String dob;
    private String address;
    private Integer contact;

    public Client() {
    }

    public Client(Integer iD, String name, String dob, String address, Integer contact) {
        ID = iD;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.contact = contact;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Client [ID=" + ID + ", name=" + name + ", dob=" + dob + ", address=" + address + ", contact=" + contact
                + "]";
    }
}
