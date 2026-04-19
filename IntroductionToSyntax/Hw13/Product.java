import java.util.Objects;

class Product {
    private int id;
    private String name;
    private int price;
    private String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        // ИСПРАВЛЕНО: Сравниваем ТОЛЬКО id и category
        return id == product.id && 
               Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        // ИСПРАВЛЕНО: Хэш считается ТОЛЬКО от id и category
        return Objects.hash(id, category);
    }

    @Override
    public String toString() {
        return "Товар[артикул=" + id + 
               ", название=" + name + 
               ", цена=" + price + 
               ", категория=" + category + "]";
    }
}