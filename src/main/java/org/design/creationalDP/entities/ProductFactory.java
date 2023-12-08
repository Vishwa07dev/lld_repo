package org.design.creationalDP.entities;


/**
 * Factory design pattern
 */
public class ProductFactory {
    public Product createProduct(String category) {
        switch (category.toLowerCase()) {
            case "electronics":
                return new ElectronicsProduct();
            case "clothing":
                return new ClothingProduct();
            // Add cases for other product categories as needed
            default:
                throw new IllegalArgumentException("Invalid product category: " + category);
        }
    }
}
