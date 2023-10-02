package com.juniormelo.DominioBancario.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name="tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_account")
     private Long id;
    @Column(name = "number_account",nullable = false,unique = true)
     private String number;
    @Column(name="agency_account")
     private String agency;
    @Column(name = "balance_account",nullable = false)
     private BigDecimal balance;
    @Column(name = "limit_account",nullable = false )
     private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
