package org.skypro.skyshop.service;

import org.springframework.stereotype.Service;
import org.skypro.skyshop.model.search.SearchResult;
import org.skypro.skyshop.model.search.Searchable;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {
    private final StorageService storageService;

    public SearchService(StorageService storageService) {
        this.storageService = storageService;
    }
    
    public List<SearchResult> search(String query) {
        Collection<? extends Searchable> products = storageService.getAllProducts();
        Collection<? extends Searchable> articles = storageService.getAllArticles();

        return java.util.stream.Stream.concat(products.stream(), articles.stream())
                .filter(item -> item.getSearchTerm().toLowerCase().contains(query.toLowerCase()))
                .map(SearchResult::fromSearchable) 
                .collect(Collectors.toList());
    }
}