package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();

        System.out.println("Добавляем продукты в корзину:");
        Product p1 = new Product("Молоко", 50);
        Product p2 = new Product("Хлеб", 30);
        Product p3 = new Product("Яблоки", 70);
        Product p4 = new Product("Сыр", 100);
        Product p5 = new Product("Колбаса", 150);
        Product p6 = new Product("Шоколад", 80);

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