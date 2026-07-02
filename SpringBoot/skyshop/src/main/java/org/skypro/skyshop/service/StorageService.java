package org.skypro.skyshop.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.DiscountedProduct;
import org.skypro.skyshop.model.product.FixPriceProduct;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.product.SimpleProduct;
import org.springframework.stereotype.Service;

@Service
public class StorageService {
    private final Map<UUID, Product> productStorage = new HashMap<>();
    private final Map<UUID,Article> articleStorage = new HashMap<>();

    public StorageService(Map<UUID, Product> productStorage,Map<UUID,Article> articleStorage) {
        this.productStorage.putAll(addProduct());
        this.articleStorage.putAll(addArticle());
    }

    private Map<UUID, Product> addProduct() {
        Product p1 = new SimpleProduct("Молоко", 50, UUID.randomUUID());
        Product p2 = new FixPriceProduct("Хлеб", UUID.randomUUID());
        Product p3 = new DiscountedProduct("Яблоки", 120, 10, UUID.randomUUID()); 
        Product p4 = new SimpleProduct("Творог", 100, UUID.randomUUID());
        Product p5 = new DiscountedProduct("Колбаса", 150, 20, UUID.randomUUID());
        Product p6 = new DiscountedProduct("Шоколад", 100, 10, UUID.randomUUID());
        Product p7 = new SimpleProduct("Яйца", 90, UUID.randomUUID());
        Product p8 = new SimpleProduct("Творожная", 130, UUID.randomUUID());

        productStorage.put(p1.getId(), p1);
        productStorage.put(p2.getId(), p2);
        productStorage.put(p3.getId(), p3);
        productStorage.put(p4.getId(), p4);
        productStorage.put(p5.getId(), p5);
        productStorage.put(p6.getId(), p6);
        productStorage.put(p7.getId(), p7);
        productStorage.put(p8.getId(), p8);

        return productStorage;
    }

    private Map<UUID, Article> addArticle(){
        Article a1 = new Article("Творог10%", "Творог помогает желудку", UUID.randomUUID());
        Article a2 = new Article("Сок", "Сок очень вкусный", UUID.randomUUID());
        Article a3 = new Article("Яблоки", "Яблоки очень полезны", UUID.randomUUID());

        articleStorage.put(a1.getId(), a1);
        articleStorage.put(a2.getId(), a2);
        articleStorage.put(a3.getId(), a3);

        return articleStorage;
    }

    public Collection<Product> getAllProducts() {
        return productStorage.values();
    }

    public Collection<Article> getAllArticles() {
        return articleStorage.values();
    }
}
