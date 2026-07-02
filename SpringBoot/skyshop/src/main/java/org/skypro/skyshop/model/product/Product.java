package org.skypro.skyshop.model.product;

import org.skypro.skyshop.model.search.Searchable;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    
    @JsonIgnore
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

       
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
         if (o == null || !(o instanceof Product)) return false;

        Product product = (Product) o;

       return java.util.Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(productName);
    }
}