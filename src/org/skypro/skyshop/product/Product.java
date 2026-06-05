package org.skypro.skyshop.product;

public abstract class Product implements Searchable{
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
    
    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getSearchTerm() {
        return productName;
    }

    @Override
    public String getName() {
        return getProductName(); 
    }

    public abstract boolean isSpecial();
    public abstract int getPrice();
    public abstract String toString();
}