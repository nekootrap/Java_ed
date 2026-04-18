import java.util.Arrays;
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
        return id == product.id && 
               price == product.price &&
               Objects.equals(name, product.name) &&
               Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, category);
    }

    @Override
    public String toString() {
        return "Товар[артикул=" + id + 
               ", название=" + name + 
               ", цена=" + price + 
               ", категория=" + category + "]";
    }
}

class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    public String getCustomer() {
        return customer;
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) &&
               Arrays.equals(basket, order.basket);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(customer);
        result = 31 * result + Arrays.hashCode(basket);
        return result;
    }

    @Override
    public String toString() {
        return "Заказ клиента: " + customer + "\n" +
               "Корзина: " + Arrays.toString(basket);
    }
}

public class Hw13 {
    public static void main(String[] args) {
        
        Product product1 = new Product(123, "Масло", 120, "молочная продукция");
        Product product2 = new Product(123, "Масло", 120, "молочная продукция");
        Product product3 = new Product(456, "Хлеб", 80, "хлебобулочные изделия");
        Product product4 = new Product(123, "Масло сливочное", 130, "молочная продукция");

        System.out.println("1. Вывод toString():");
        System.out.println(product1);
        System.out.println();

        System.out.println("2. Тест equals() - одинаковые товары:");
        System.out.println("product1.equals(product2) = " + product1.equals(product2));
        System.out.println("Ожидается: true (одинаковые id, name, price, category)\n");

        System.out.println("3. Тест equals() - разные товары:");
        System.out.println("product1.equals(product3) = " + product1.equals(product3));
        System.out.println("Ожидается: false (разные id, name, price, category)\n");

        System.out.println("4. Тест equals() - одинаковый id, разные name:");
        System.out.println("product1.equals(product4) = " + product1.equals(product4));
        System.out.println("Ожидается: false (разные name и price)\n");

        System.out.println("=== ТЕСТИРОВАНИЕ CLASS ORDER ===\n");

        Product[] basket1 = {product1, product3};
        Product[] basket2 = {product1, product3};
        Product[] basket3 = {product2, product4};

        Order order1 = new Order("Иван Петров", basket1);
        Order order2 = new Order("Иван Петров", basket2);
        Order order3 = new Order("Иван Петров", basket3);
        Order order4 = new Order("Анна Сидорова", basket1);

        System.out.println("1. Вывод toString():");
        System.out.println(order1);
        System.out.println();

        System.out.println("2. Тест equals() - одинаковые заказы:");
        System.out.println("order1.equals(order2) = " + order1.equals(order2));
        System.out.println("Ожидается: true (одинаковые customer и basket)\n");

        System.out.println("3. Тест equals() - разные корзины:");
        System.out.println("order1.equals(order3) = " + order1.equals(order3));
        System.out.println("Ожидается: false (разные продукты в корзине)\n");

        System.out.println("4. Тест equals() - разные клиенты:");
        System.out.println("order1.equals(order4) = " + order1.equals(order4));
        System.out.println("Ожидается: false (разные customer)\n");

    }
}