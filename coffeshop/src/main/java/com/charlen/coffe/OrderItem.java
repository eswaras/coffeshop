package com.charlen.coffe;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Product product;
    private List<Product> extras;

    public OrderItem(Product product) {
        this.product = product;
        this.extras = new ArrayList<>();
    }

    public void addExtra(Product extra) {
        if (extra.isExtra()) {
            this.extras.add(extra);
        } else {
            throw new IllegalArgumentException("Only extras can be added as extras.");
        }
    }

    public Product getProduct() {
        return product;
    }

    public List<Product> getExtras() {
        return extras;
    }

    public double getTotalPrice() {
        double totalPrice = product.getPrice();
        for (Product extra : extras) {
            totalPrice += extra.getPrice();
        }
        return totalPrice;
    }
}

