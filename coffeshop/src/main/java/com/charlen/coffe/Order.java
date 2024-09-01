package com.charlen.coffe;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private int beverageCount;

    public Order() {
        this.items = new ArrayList<>();
        this.beverageCount = 0;
    }

    public void addItem(OrderItem item) {
        items.add(item);
        if (item.getProduct().isBeverage()) {
            beverageCount++;
        }
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0.0;
        int freeBeverages = beverageCount / 5;
        int freeExtras = 0;

        for (OrderItem item : items) {
            if (freeBeverages > 0 && item.getProduct().isBeverage()) {
                freeBeverages--;
                continue;
            }
            
            if (item.getProduct().isBeverage() && hasSnack()) {
                freeExtras = 1;
            }

            total += item.getProduct().getPrice();
            
            for (Product extra : item.getExtras()) {
                if (freeExtras > 0) {
                    freeExtras--;
                } else {
                    total += extra.getPrice();
                }
            }
        }

        return total;
    }

    private boolean hasSnack() {
        for (OrderItem item : items) {
            if (!item.getProduct().isBeverage() && !item.getProduct().isExtra()) {
                return true;
            }
        }
        return false;
    }
}
