package com.example.insurance.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name="claim")
public class Claim {
    
    @Id
    private Integer number;
    private String description;
    private Date date ;
    private String status;

    public Claim() {}

    public Claim(Integer number, String description, Date date, String status) {
        this.number = number;
        this.description = description;
        this.date = date;
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim [number=" + number + ", description=" + description + ", date=" + date + ", status=" + status
                + "]";
    }  
    
}
