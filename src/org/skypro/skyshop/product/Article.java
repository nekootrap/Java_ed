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
