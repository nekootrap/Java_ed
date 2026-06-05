package org.skypro.skyshop.product;

public abstract class Product implements Searchable{
    private String productName;

    public Product(String productName) {
        try {
            if (productName == null || productName.isBlank()) {
                throw new IllegalArgumentException("Название продукта не может быть пустой строкой или null");
            }
            this.productName = productName;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания продукта: " + e.getMessage());
            throw e;
        } 
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