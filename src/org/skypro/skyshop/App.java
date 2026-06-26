package org.skypro.skyshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Article;
import org.skypro.skyshop.product.BestResultNotFound;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SearchEngine;
import org.skypro.skyshop.product.Searchable;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();
        SearchEngine s1 = new SearchEngine(10);

        try {
            Product p1 = new SimpleProduct("  ", 50); 
            basket.addProduct("Иван",p1); 
            s1.add(p1);
        } catch (IllegalArgumentException e) {}

        

        try {
            Product p2 = new FixPriceProduct("Хлеб");
            basket.addProduct("Иван",p2);
            s1.add(p2);
        } catch (IllegalArgumentException e) {}

       try {
            Product p3 = new DiscountedProduct("Яблоки", 120, 110); 
            basket.addProduct("Иван",p3);
            s1.add(p3);
        } catch (IllegalArgumentException e) {}
        
        try {
            Product p4 = new SimpleProduct("Сыр", 100);
            basket.addProduct("Иван",p4);
            s1.add(p4);
        } catch (IllegalArgumentException e) {}

        try {
            Product p5 = new DiscountedProduct("Колбаса", 150, 20);
            basket.addProduct("Иван",p5);
            s1.add(p5);
        } catch (IllegalArgumentException e) {}

        try {
            Product p6 = new DiscountedProduct("Шоколад", 100, 10);
            basket.addProduct("Иван",p6);
            s1.add(p6);
        } catch (IllegalArgumentException e) {}

        try {
            Product p7 = new SimpleProduct("Яйца", -90);
            basket.addProduct("Иван",p7);
            s1.add(p7);
        } catch (IllegalArgumentException e) {}
        
        try {
            Product p8 = new SimpleProduct("Творог", 130);
            basket.addProduct("Иван",p8);
            s1.add(p8);
        } catch (IllegalArgumentException e) {}

        Article a1 = new Article("Творог", "Творог помогает желудку");
        Article a2 = new Article("Сок", "Сок очень вкусный");

        s1.add(a1);
        s1.add(a2);

        basket.printBasket();
        System.out.println(basket.delProduct("Шоколад"));
        basket.printBasket();
        System.out.println(basket.delProduct("Chocholate"));
        basket.printBasket();

        try {
            Searchable result = s1.goSearch("Шокола");
            System.out.println("Найден лучший результат: " + result.getSearchTerm());
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }

        try {
            Searchable result = s1.goSearch("Футболка");
            System.out.println("Найден лучший результат: " + result.getSearchTerm());
        } catch (BestResultNotFound e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }

    Map<String, Searchable> results1 = s1.search("Твор");

    for (Map.Entry<String, Searchable> entry : results1.entrySet()) {
        Searchable item = entry.getValue(); 
        
        System.out.println(item.getStringRepresentation());
    }

    Map<String, Searchable> results2 = s1.search("Молоко");

   for (Map.Entry<String, Searchable> entry : results2.entrySet()) {
        Searchable item = entry.getValue(); 
        System.out.println(item.getStringRepresentation());
        
    }

    
    }

    
}
       