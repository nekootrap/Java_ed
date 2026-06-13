package org.skypro.skyshop.basket;
import java.util.Arrays;
import java.util.LinkedList;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private LinkedList<Product> basket = new LinkedList<>(); 
    private int count = 0; 
    private int isSpecialProduct = 0;

    public ProductBasket() {
    }

    public String delProduct(String name){
        final LinkedList<Product> delProductList = new LinkedList<>(); 
        String messenge = "Удалено:";

        for (Product product: basket) {
            if (name == product.getName()){
                basket.remove(product);
                delProductList.add(product);
            }
        }

        if (delProductList.isEmpty()){
            messenge = "Список пуст";
            return messenge;
        } else {
            return "Удалено: " + delProductList.toString();
        }
    }

    public void addProduct(Product product) {
        basket.add(product);
        count++;
    }


    public int getSumCost() {
        int sumCost = 0;
        for (Product product: basket) {
            sumCost += product.getPrice();
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

        for (Product product: basket) {
            isSpecialProductCount(product);
            System.out.println(product.toString());
        }
        System.out.println("Итого: " + getSumCost());
        System.out.println("Специальных товаров: " + isSpecialProduct);

    }

    public boolean checkName(String nameProduct) {
        for (Product product: basket) {
            if (product.getProductName().equals(nameProduct)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        basket.clear();
    }
}