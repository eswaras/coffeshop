package com.charlen.coffe;

public class ReceiptGenerator {
    public static String generateReceipt(Order order) {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Charlene's Coffee Corner\n\n");
        
        for (OrderItem item : order.getItems()) {
            receipt.append(item.getProduct().getName())
                   .append(": ")
                   .append(item.getProduct().getPrice())
                   .append(" CHF\n");

            for (Product extra : item.getExtras()) {
                receipt.append("  - ")
                       .append(extra.getName())
                       .append(": ")
                       .append(extra.getPrice())
                       .append(" CHF\n");
            }
        }

        receipt.append("\nTotal: ")
               .append(order.calculateTotal())
               .append(" CHF");

        return receipt.toString();
    }
}
