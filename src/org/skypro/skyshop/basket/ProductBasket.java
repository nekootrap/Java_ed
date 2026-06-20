package org.skypro.skyshop.basket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Map<String, List<Product>> basket = new HashMap<>();
    private int count = 0; 
    private int isSpecialProduct = 0;

    public ProductBasket() {
    }

    public String delProduct(String name) {
        List<Product> productList = basket.get(name);

        if (productList == null || productList.isEmpty()) {
            return "Список пуст или продукт не найден";
        }

        Product removedProduct = ((LinkedList<Product>) productList).removeLast();

        if (productList.isEmpty()) {
            basket.remove(name);
        }


        return "Удалено: " + removedProduct.toString();
    }

    public void addProduct(String userName, Product product) {
        if (!basket.containsKey(userName)) {
            basket.put(userName, new LinkedList<>());
        }
        
        basket.get(userName).add(product);
        
        count++; 
}


    public int getSumCost() {
        int sumCost = 0;

        for (List<Product> productList : basket.values()) {
            for (Product product : productList) {
                sumCost += product.getPrice();
            }
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

        for (List<Product> productList : basket.values()) {
            for (Product product : productList) {
                isSpecialProductCount(product);
                System.out.println(product.toString());
            }
        }

        System.out.println("Итого: " + getSumCost());
        System.out.println("Специальных товаров: " + isSpecialProduct);

    }

    public boolean checkName(String nameProduct) {
        for (List<Product> productList : basket.values()) {
            for (Product product : productList) {
                if (product.getProductName().equals(nameProduct)) {
                    return true;
            }
            }
        }
        return false;
    }

    public void clearBasket() {
        basket.clear();
    }
}