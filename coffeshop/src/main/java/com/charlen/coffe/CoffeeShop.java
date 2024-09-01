package com.charlen.coffe;

public class CoffeeShop {

    public static void main(String[] args) {
        // Create a new order
        Order order = new Order();

        // Create and add first item (Large Coffee with Extra Milk)
        Product largeCoffee = new Product(ProductType.LARGE_COFFEE);
        OrderItem coffeeItem = new OrderItem(largeCoffee);
        coffeeItem.addExtra(new Product(ProductType.EXTRA_MILK));
        order.addItem(coffeeItem);

        // Create and add second item (Bacon Roll)
        Product baconRoll = new Product(ProductType.BACON_ROLL);
        OrderItem baconRollItem = new OrderItem(baconRoll);
        order.addItem(baconRollItem);

        // Create and add third item (Medium Coffee with Special Roast)
        Product mediumCoffee = new Product(ProductType.MEDIUM_COFFEE);
        OrderItem mediumCoffeeItem = new OrderItem(mediumCoffee);
        mediumCoffeeItem.addExtra(new Product(ProductType.SPECIAL_ROAST));
        order.addItem(mediumCoffeeItem);

        // Create and add fourth item (Orange Juice)
        Product orangeJuice = new Product(ProductType.ORANGE_JUICE);
        OrderItem orangeJuiceItem = new OrderItem(orangeJuice);
        order.addItem(orangeJuiceItem);

        // Generate and print the receipt
        String receipt = ReceiptGenerator.generateReceipt(order);
        System.out.println(receipt);
    }
}
