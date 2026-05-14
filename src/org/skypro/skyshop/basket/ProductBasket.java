package org.skypro.skyshop.basket;
import java.util.Arrays;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] basket = new Product[10]; 
    private int count = 0; 
    private int isSpecialProduct = 0;

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
            sumCost += basket[i].getPrice();
        }
        return sumCost;
    }

    public void isSpecialProductCount(Product product) {
        if (product.isSpecial()) {
            isSpecialProduct += 1;
        }
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("в корзине пусто");
            return;
        }

        for (int i = 0; i < count; i++) {
            isSpecialProductCount(basket[i]);
            System.out.println(basket[i].toString());
        }
        System.out.println("Итого: " + getSumCost());
        System.out.println("Специальных товаров: " + isSpecialProduct);

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
        Arrays.fill(basket, null);
    }
}