package com.example.insurance.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name="policy")
public class InsurancePolicy {

@Id
private Integer pnumber;
private String type;
private Double amount;
private String premium ;
private Date start_date;
private Date end_date;

public InsurancePolicy() {
}

public InsurancePolicy(Integer pnumber, String type, Double amount, String premium, Date start_date, Date end_date) {
    this.pnumber = pnumber;
    this.type = type;
    this.amount = amount;
    this.premium = premium;
    this.start_date = start_date;
    this.end_date = end_date;
}

public Integer getPnumber() {
    return pnumber;
}

public void setPnumber(Integer pnumber) {
    this.pnumber = pnumber;
}

public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}

public Double getAmount() {
    return amount;
}

public void setAmount(Double amount) {
    this.amount = amount;
}

public String getPremium() {
    return premium;
}

public void setPremium(String premium) {
    this.premium = premium;
}

public Date getStart_date() {
    return start_date;
}

public void setStart_date(Date start_date) {
    this.start_date = start_date;
}

public Date getEnd_date() {
    return end_date;
}

public void setEnd_date(Date end_date) {
    this.end_date = end_date;
}

@Override
public String toString() {
    return "InsurancePolicy [pnumber=" + pnumber + ", type=" + type + ", amount=" + amount + ", premium=" + premium
            + ", start_date=" + start_date + ", end_date=" + end_date + "]";
}



}
