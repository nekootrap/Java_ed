package org.skypro.skyshop;

import java.util.Arrays;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Article;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SearchEngine;
import org.skypro.skyshop.product.Searchable;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();

        Product p1 = new SimpleProduct("Молоко", 50);
        Product p2 = new FixPriceProduct("Хлеб");
        Product p3 = new DiscountedProduct("Яблоки", 120, 40);
        Product p4 = new SimpleProduct("Сыр", 100);
        Product p5 = new DiscountedProduct("Колбаса", 150, 20);
        Product p6 = new DiscountedProduct("Шоколад", 100, 10);
        Product p7 = new SimpleProduct("Яйца", 90);
        Product p8 = new SimpleProduct("Творог", 130);

        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.addProduct(p4); 
        basket.addProduct(p5); 
        basket.addProduct(p6); 
        basket.addProduct(p7); 
        basket.addProduct(p8); 
        
        
        SearchEngine s1 = new SearchEngine(10);
        s1.add(p1);
        s1.add(p2);
        s1.add(p3);
        s1.add(p4);
        s1.add(p5);
        s1.add(p6);
        s1.add(p7);
        s1.add(p8);

        Article a1 = new Article("Творог", "Творог помогает желудку");
        Article a2 = new Article("Сок", "Сок очень вкусный");

        s1.add(a1);
        s1.add(a2);

        
        Searchable[] results1 = s1.search("Творог");
        Searchable[] results2 = s1.search("Молоко");

        for (Searchable item : results1) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
            }
        }

        for (Searchable item : results2) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
            }
        }

    }
}
       