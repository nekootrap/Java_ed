package org.skypro.skyshop.model.basket;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class ProductBasket {
    private final Map<UUID, Integer> basket = new HashMap<>();

    public void addProduct(UUID id) {
        basket.computeIfAbsent(id, k -> 0);
        basket.put(id, basket.get(id) + 1);
    }

    public Map<UUID, Integer> getBasket() {
        return Collections.unmodifiableMap(basket);
    }

}
