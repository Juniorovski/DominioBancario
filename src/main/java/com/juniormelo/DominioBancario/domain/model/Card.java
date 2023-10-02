package com.juniormelo.DominioBancario.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name="tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_card")
    private Long id;

    @Column(name="card_number",nullable = false,unique = true)
    private String number;
    @Column(name="card_limit",nullable = false)
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

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
