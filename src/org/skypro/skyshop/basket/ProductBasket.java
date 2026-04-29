package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] basket = new Product[5]; 
    private int count = 0; 

    public ProductBasket() {
    }

    public void addProduct(Product product) {
        if (count >= basket.length) {
            System.out.println("Невозможно добавить продукт");
            return;
        }
        basket[count] = product;
        count++;
    }

    public int getSumCost() {
        int sumCost = 0;
        for (int i = 0; i < count; i++) {
            sumCost += basket[i].getProductCost();
        }
        return sumCost;
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(basket[i].getProductName() + ": " + basket[i].getProductCost());
        }
        System.out.println("Итого: " + getSumCost());
    }

    public boolean checkName(String nameProduct) {
        for (int i = 0; i < count; i++) {
            if (basket[i].getProductName().equals(nameProduct)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
        count = 0;
    }
}