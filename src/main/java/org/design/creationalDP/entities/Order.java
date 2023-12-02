package org.design.creationalDP.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    // Other order attributes and methods

    private Order(OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.products = builder.products;
        // Other attributes initialization
    }

    // Getters for attributes

    public static class OrderBuilder {
        private final String orderId;
        private final List<Product> products;
        // Other builder attributes

        public OrderBuilder(String orderId) {
            this.orderId = orderId;
            this.products = new ArrayList<>();
            // Other attributes initialization
        }

        // Methods for adding products, setting other attributes

        public Order build() {

            return new Order(this);
        }
    }
}
