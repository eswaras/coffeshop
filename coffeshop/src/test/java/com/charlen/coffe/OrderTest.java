package com.charlen.coffe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testSingleBeverage() {
        Product coffee = new Product(ProductType.LARGE_COFFEE);
        OrderItem item = new OrderItem(coffee);
        Order order = new Order();
        order.addItem(item);
        
        assertEquals(3.50, order.calculateTotal());
    }

    @Test
    public void testBeverageWithExtras() {
        Product coffee = new Product(ProductType.LARGE_COFFEE);
        Product extraMilk = new Product(ProductType.EXTRA_MILK);
        OrderItem item = new OrderItem(coffee);
        item.addExtra(extraMilk);
        Order order = new Order();
        order.addItem(item);
        
        assertEquals(3.80, order.calculateTotal());
    }

    @Test
    public void testBeverageAndSnack() {
        Product coffee = new Product(ProductType.LARGE_COFFEE);
        Product baconRoll = new Product(ProductType.BACON_ROLL);
        Product extraMilk = new Product(ProductType.EXTRA_MILK);

        OrderItem coffeeItem = new OrderItem(coffee);
        coffeeItem.addExtra(extraMilk);
        OrderItem snackItem = new OrderItem(baconRoll);
        Order order = new Order();
        order.addItem(coffeeItem);
        order.addItem(snackItem);
        
        // Extra Milk should be free
        assertEquals(8.00, order.calculateTotal());
    }

    @Test
    public void testFifthBeverageFree() {
        Product coffee = new Product(ProductType.LARGE_COFFEE);

        Order order = new Order();
        for (int i = 0; i < 5; i++) {
            order.addItem(new OrderItem(coffee));
        }

        // One coffee should be free
        assertEquals(14.00, order.calculateTotal());
    }
}
