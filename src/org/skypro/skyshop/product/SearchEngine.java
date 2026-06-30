package org.skypro.skyshop.product;

import java.util.Comparator; // Добавляем импорт для компаратора
import java.util.HashSet; 
import java.util.Set;    
import java.util.TreeSet; // Заменяем TreeMap на TreeSet

public class SearchEngine {
    private Set<Searchable> items; 

    public SearchEngine(int size) {
        this.items = new HashSet<>(size);
    }

    public void add(Searchable item) {
        items.add(item);
    }

    public Searchable goSearch(String search) throws BestResultNotFound {
        Searchable bestMatch = null;
        int maxCount = -1;

        for (Searchable item : items) {
            if (item == null) continue; 
            
            String term = item.getSearchTerm();
            int count = 0;
            int index = 0;
            
            while ((index = term.indexOf(search, index)) != -1) {
                count++;
                index += search.length();
            }

            if (count > maxCount && count > 0) { 
                maxCount = count;
                bestMatch = item;
            }
        }

        if (bestMatch == null) {
            throw new BestResultNotFound("Не найдено подходящих результатов для запроса: \"" + search + "\"");
        }

        return bestMatch;
    }

    public Set<Searchable> search(String query) {
        Set<Searchable> results = new TreeSet<>(new Comparator<Searchable>() {
            @Override
            public int compare(Searchable o1, Searchable o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();

                int lengthComparison = Integer.compare(name2.length(), name1.length());

                if (lengthComparison == 0) {
                    return name1.compareTo(name2);
                }

                return lengthComparison;
            }
        });

        for (Searchable item : items) {
            if (item != null && item.getSearchTerm().contains(query)) {
                results.add(item);
            }
        }

        return results; 
    }
}