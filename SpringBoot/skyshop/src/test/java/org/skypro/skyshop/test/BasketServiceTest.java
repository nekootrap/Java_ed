package org.skypro.skyshop.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skypro.skyshop.service.BasketService;
import org.skypro.skyshop.service.StorageService;
import org.skypro.skyshop.model.basket.ProductBasket;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.product.SimpleProduct;
import java.util.Optional;
import java.util.UUID;

import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BasketServiceTest {
    @Mock
    private StorageService storageService;

    @Mock
    private ProductBasket productBasket;

    @InjectMocks
    private BasketService basketService;

    @Test
    void addNonExistentProductThrowsException() {
        UUID randomId = UUID.randomUUID();

        when(storageService.getProductById(randomId)).thenReturn(null);

        assertThrows(NullPointerException.class, () -> {
            basketService.addProductToBasket(randomId);
        });

        verify(productBasket, never()).addProduct(any());
    }

    @Test
    void addExistingProductCallsBasketAddMethod() {
        UUID productId = UUID.randomUUID();
        Product product = new SimpleProduct("Product 1", 100, productId);

        when(storageService.getProductById(productId)).thenReturn(Optional.of(product));
        basketService.addProductToBasket(productId);
        basketService.addProductToBasket(productId);
    }

    @Test
    void getUserBasketReturnsEmptyWhenBasketIsEmpty() {
        when(productBasket.getBasket()).thenReturn(Collections.emptyMap());
        var result = basketService.getUserBasket();
        assertTrue(result.getItems().isEmpty());
    }

    @Test
    void getUserBasketReturnsItemsWhenBasketHasProducts() {
        UUID id1 = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        
        Product product1 = new SimpleProduct("Product 1", 100, id1);
        Product product2 = new SimpleProduct("Product 2", 150, id2);

        Map<UUID, Integer> basketMap = Map.of(
            id1, 1,
            id2, 2
        );

        when(storageService.getProductById(id1)).thenReturn(Optional.of(product1));
        when(storageService.getProductById(id2)).thenReturn(Optional.of(product2));

        when(productBasket.getBasket()).thenReturn(basketMap);
        var result = basketService.getUserBasket();

        assertEquals(2, result.getItems().size());
        assertEquals("Product 2", result.getItems().get(0).getProduct().getName());
        assertEquals("Product 1", result.getItems().get(1).getProduct().getName());
    }
}