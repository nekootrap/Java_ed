package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discount;
    private int priceWithDiscount;

    public DiscountedProduct(String productName, int basePrice, int discount) {
        super(productName);
        this.basePrice = basePrice;
        this.discount = discount;
        this.priceWithDiscount = (basePrice * discount) / 100;
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
