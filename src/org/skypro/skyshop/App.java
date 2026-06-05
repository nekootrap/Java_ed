package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();

        System.out.println("Добавляем продукты в корзину:");
        Product p1 = new SimpleProduct("Молоко", 50);
        Product p2 = new FixPriceProduct("Хлеб");
        Product p3 = new DiscountedProduct("Яблоки", 120, 40);
        Product p4 = new SimpleProduct("Сыр", 100);
        Product p5 = new DiscountedProduct("Колбаса", 150, 20);
        Product p6 = new SimpleProduct("Шоколад", 100);

        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        System.out.println("Добавлено: Молоко, Хлеб, Яблоки\n");

        basket.addProduct(p4); 
        basket.addProduct(p5);   
        basket.addProduct(p6);   
        System.out.println();

        basket.printBasket();
        System.out.println();

        System.out.println("Общая стоимость корзины: " + basket.getSumCost());
        System.out.println();

        System.out.println("Есть ли хлеб в корзине: " + basket.checkName("Хлеб"));
        System.out.println();

        System.out.println("Есть ли бананы в корзине: " + basket.checkName("Бананы"));
        System.out.println();

        System.out.println("Очищаем корзину...");
        basket.clearBasket();
        System.out.println("Корзина очищена.\n");

        System.out.println("Печатаем пустую корзину:");
        basket.printBasket();
        System.out.println();

        System.out.println("Стоимость пустой корзины: " + basket.getSumCost());
        System.out.println();

        System.out.println("Ищем 'Молоко' в пустой корзине: " + basket.checkName("Молоко"));
  
    }
}