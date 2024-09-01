package com.charlen.coffe;

public class Product {
    private final ProductType type;

    public Product(ProductType type) {
        this.type = type;
    }

    public String getName() {
        return type.getName();
    }

    public double getPrice() {
        return type.getPrice();
    }

    public boolean isBeverage() {
        return type.isBeverage();
    }

    public boolean isExtra() {
        return type.isExtra();
    }
}
