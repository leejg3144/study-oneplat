package com.oneplat.study.stream;

public class Product {

    private int amount;
    private int price;
    private String name;

    public Product() { }

    public Product(int amount, int price, String name) {
        this.amount = amount;
        this.price = price;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
