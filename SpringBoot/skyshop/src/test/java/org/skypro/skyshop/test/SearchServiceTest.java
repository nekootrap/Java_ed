package org.skypro.skyshop.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skypro.skyshop.service.SearchService;
import org.skypro.skyshop.service.StorageService;
import org.skypro.skyshop.model.product.SimpleProduct;
import org.skypro.skyshop.model.product.Product;

@ExtendWith(MockitoExtension.class)
public class SearchServiceTest {

    @Mock
    private StorageService storageService;

    @InjectMocks
    private SearchService searchService;

    @Test
    void testSearchWhenStorageIsEmpty() {
        Mockito.when(storageService.getAllProducts()).thenReturn(Collections.emptyList());
        var result = searchService.search("test");
        assert result.isEmpty();
    }

    @Test
    void testSearchWhenStorageHasProducts() {
        Product product1 = new SimpleProduct("Product 1", 100, java.util.UUID.randomUUID()); 
        Product product2 = new SimpleProduct("Product 2", 150, java.util.UUID.randomUUID());
        Mockito.when(storageService.getAllProducts()).thenReturn(List.of(product1, product2));

        var result = searchService.search("Product");
        assert result.size() == 2;
    }

    @Test
    void testSearchWhenStorageHasSuitableProducts() {
        Product product1 = new SimpleProduct("Product 1", 165, java.util.UUID.randomUUID()); 
        Product product2 = new SimpleProduct("Product 2", 154, java.util.UUID.randomUUID());
        Mockito.when(storageService.getAllProducts()).thenReturn(List.of(product1, product2));

        var result = searchService.search("Product 1");
        assertEquals(1, result.size());
        assertEquals("Product 1", result.get(0).getName());
    }
}
