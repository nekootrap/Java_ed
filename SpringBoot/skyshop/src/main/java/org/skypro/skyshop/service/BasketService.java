package org.skypro.skyshop.service;

import java.util.UUID;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;

import org.skypro.skyshop.model.basket.BasketItem;
import org.skypro.skyshop.model.basket.ProductBasket;
import org.skypro.skyshop.model.basket.UserBasket;
import org.skypro.skyshop.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BasketService {
    private final ProductBasket productBasket;
    private final StorageService storageService;

    @Autowired
    public BasketService(ProductBasket productBasket, StorageService storageService) {
        this.productBasket = productBasket;
        this.storageService = storageService;
    }

    public void addProductToBasket(UUID id) {
        storageService.getProductById(id)
            .orElseThrow(() -> new IllegalArgumentException("Товар не найден"));
        
        productBasket.addProduct(id);
    }

    public UserBasket getUserBasket() {
        Map<UUID, Integer> basketMap = productBasket.getBasket();

        List<BasketItem> items = basketMap.entrySet().stream()
            .map(entry -> {
                Product product = storageService.getProductById(entry.getKey())
                    .orElseThrow(() -> new IllegalStateException("Товар не найден"));
                
                return new BasketItem(product, entry.getValue());
            })
            .collect(Collectors.toList());

        return new UserBasket(items);
    }

}
