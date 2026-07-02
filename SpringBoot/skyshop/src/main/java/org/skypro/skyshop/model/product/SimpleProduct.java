package org.skypro.skyshop.model.product;

import java.util.UUID;

public class SimpleProduct extends Product {
    private int price;
    private final UUID id;

    public SimpleProduct(String productName, int price, UUID id) {
        super(productName);
        this.id = id;
        try {
            if (price <= 0) {
                throw new IllegalArgumentException("Цена продукта должна быть строго больше 0");
            }
            this.price = price;
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка создания продукта " + productName + ": " + e.getMessage());
            throw e;
        }
        
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getProductName() + ": " + price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}