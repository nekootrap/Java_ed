package org.skypro.skyshop.product;

public class SearchEngine {
    private Searchable[] items;
    private int count;

    public SearchEngine(int size) {
        this.items = new Searchable[size];
        this.count = 0;
    }

    public void add(Searchable item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

    public Searchable goSearch(String search) throws BestResultNotFound{
        Searchable bestMatch = null;
        int maxCount = -1;

        for (Searchable item : items) {
            if (item == null) {
                continue; 
            }
            String term = item.getSearchTerm();
            int count = 0;
            int index = 0;
            
            while ((index = term.indexOf(search, index)) != -1) {
                count++;
                index += search.length();
            }

            if (count > maxCount & count > 0) {
                maxCount = count;
                bestMatch = item;
            }
        }
        if (bestMatch == null) {
            throw new BestResultNotFound("Не найдено подходящих результатов для запроса: \"" + search + "\"");
        }

        return bestMatch;
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5]; 
        int resultCount = 0;

        for (int i = 0; i < count; i++) {
            Searchable item = items[i];
            
            if (item.getSearchTerm().contains(query)) {
                results[resultCount] = item;
                resultCount++;
                
                if (resultCount >= 5) {
                    break;
                }
            }
        }

        return results; 
    }
}