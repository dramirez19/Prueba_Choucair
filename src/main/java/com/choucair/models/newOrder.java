package com.choucair.models;

public class newOrder {

    private String quantity;
    private String discount;

    public newOrder(String quantity, String discount) {
        this.quantity = quantity;
        this.discount = discount;
    }

    public String getQuantity() {
        return quantity;
    }
    public String getDiscount() {
        return discount;
    }
}
