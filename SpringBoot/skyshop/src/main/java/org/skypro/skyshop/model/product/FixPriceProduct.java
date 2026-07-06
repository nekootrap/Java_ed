package org.skypro.skyshop.model.product;

import java.util.UUID;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE = 50;
    private final UUID id;

    public FixPriceProduct(String productName, UUID id) {
        super(productName);
        this.id = id;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return getProductName() + " с фиксированной ценой: Фиксированная цена " + FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
