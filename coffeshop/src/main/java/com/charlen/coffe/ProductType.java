package com.charlen.coffe;

public enum ProductType {
    // Offerings
    SMALL_COFFEE("Small Coffee", 2.50, true, false),
    MEDIUM_COFFEE("Medium Coffee", 3.00, true, false),
    LARGE_COFFEE("Large Coffee", 3.50, true, false),
    BACON_ROLL("Bacon Roll", 4.50, false, false),
    ORANGE_JUICE("Freshly Squeezed Orange Juice (0.25l)", 3.95, false, false),
    
    // Extras
    EXTRA_MILK("Extra Milk", 0.30, false, true),
    FOAMED_MILK("Foamed Milk", 0.50, false, true),
    SPECIAL_ROAST("Special Roast Coffee", 0.90, false, true);

    private final String name;
    private final double price;
    private final boolean isBeverage;
    private final boolean isExtra;

    ProductType(String name, double price, boolean isBeverage, boolean isExtra) {
        this.name = name;
        this.price = price;
        this.isBeverage = isBeverage;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBeverage() {
        return isBeverage;
    }

    public boolean isExtra() {
        return isExtra;
    }
}

