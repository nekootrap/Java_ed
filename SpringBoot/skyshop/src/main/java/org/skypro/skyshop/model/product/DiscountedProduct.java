package org.skypro.skyshop.model.product;

import java.util.UUID;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discount;
    private int priceWithDiscount;
    private final UUID id;

    public DiscountedProduct(String productName, int basePrice, int discount, UUID id) {
        super(productName);
        this.id = id;
        try {
            if (basePrice <= 0) {
                throw new IllegalArgumentException("Цена продукта должна быть строго больше 0");
            }
            this.basePrice = basePrice;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания продукта " + productName + ": " + e.getMessage());
            throw e;
        } 

        try {
            if (discount < 0 || discount > 100) {
                throw new IllegalArgumentException("Скидка продукта должна быть в диапазоне от 0 до 100 включительно");
            }
            this.discount = discount;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания продукта " + productName + ": " + e.getMessage());
            throw e;
        }

        this.priceWithDiscount = (basePrice * discount) / 100;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return priceWithDiscount;
    }

    @Override
    public String toString() {
        return getProductName() + " со скидкой: " + priceWithDiscount + " (скидка = " + discount + "%)";
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
