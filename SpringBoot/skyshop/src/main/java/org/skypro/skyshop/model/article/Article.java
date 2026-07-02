package org.skypro.skyshop.model.article;

import java.util.UUID;
import org.skypro.skyshop.model.search.Searchable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Article implements Searchable{
    private final String titleArticle;
    private final String textArticle;
    private final UUID id; 

    public Article(String titleArticle, String textArticle, UUID id) {
        this.titleArticle = titleArticle;
        this.textArticle = textArticle;
        this.id = id;
    }



    @Override
    public UUID getId() {
        return id;
    }

    public String toString() {
        return titleArticle + "\n" + textArticle; 
    }
    
    @JsonIgnore
    @Override
    public String getSearchTerm() {
        return titleArticle + " " + textArticle; 
    }
    
    @Override
    public String getContentType() {
        return "ARTICLE"; 
    }
    
    @Override
    public String getName() {
        return titleArticle; 
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            
            if (o == null || getClass() != o.getClass()) return false;

            Article article = (Article) o;

            return java.util.Objects.equals(titleArticle, article.titleArticle);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(titleArticle);
        }
}
