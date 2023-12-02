package org.design.creationalDP;

import org.design.creationalDP.dal.UserDatabase;
import org.design.creationalDP.entities.Order;
import org.design.creationalDP.entities.Product;
import org.design.creationalDP.entities.ProductFactory;
import org.design.creationalDP.entities.UserAccount;

public class ShopWorldApp {
    public static void main(String[] args) {
        // Singleton
        UserDatabase userDatabase = UserDatabase.getInstance();

        // Factory
        ProductFactory productFactory = new ProductFactory();
        Product electronicsProduct = productFactory.createProduct("electronics");
        electronicsProduct.displayInfo();

        // Builder
        UserAccount.UserAccountBuilder userBuilder = new UserAccount.UserAccountBuilder("username", "password");
        UserAccount userAccount = userBuilder.build();

        Order.OrderBuilder orderBuilder = new Order.OrderBuilder("orderId");
        Order order = orderBuilder.build();

    }
}
