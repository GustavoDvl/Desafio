package com.devsuperior.desafio.entities;


public class Order {
    private Long code;
    private double basicValue;
    private double discountPercentage;

    public Order(Long code, double basicValue, double discountPercentage) {
        this.code = code;
        this.basicValue = basicValue;
        this.discountPercentage = discountPercentage;
    }

    // Getters e Setters
    public Long getCode() {
        return code;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}