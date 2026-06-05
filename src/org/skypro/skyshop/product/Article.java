package org.skypro.skyshop.product;

public class Article implements Searchable{
    private final String titleArticle;
    private final String textArticle;

    public Article(String titleArticle, String textArticle) {
        this.titleArticle = titleArticle;
        this.textArticle = textArticle;
    }

    public String toString() {
        return titleArticle + "\n" + textArticle; 
    }
    
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
}
