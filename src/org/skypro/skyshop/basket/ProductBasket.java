package org.skypro.skyshop.basket;
import java.util.Collection;
import java.util.HashMap;
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
        return basket.values().stream()
            .flatMap(Collection::stream)
            .mapToInt(Product::getPrice)
            .sum();
    }

    public void isSpecialProductCount(Product product) {
        if (product.isSpecial()) {
            isSpecialProduct += 1;
        }
    }

    private long getSpecialCount() {
    return basket.values().stream()     
        .flatMap(Collection::stream)     
        .filter(Product::isSpecial)     
        .count();                       
}

    public String printBasket() {
        if (basket.isEmpty()) {
            System.out.println("В корзине пусто");
            return "В корзине пусто";
        }

        basket.values().stream()
            .flatMap(Collection::stream)
            .forEach(product -> {
                System.out.println(product.toString());
            });

        int sumCost = getSumCost();
        long specialCount = getSpecialCount(); 

        String result = "Итого: " + sumCost + "\nСпециальных товаров: " + specialCount;
        
        System.out.println(result);
        
        return result;

    }

    public boolean checkName(String nameProduct) {
        return basket.values().stream()
            .flatMap(Collection::stream)
            .anyMatch(product -> product.getProductName().equals(nameProduct));
    }

    public void clearBasket() {
        basket.clear();
    }
}