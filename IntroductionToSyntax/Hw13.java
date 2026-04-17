import java.util.Arrays;
import java.util.Objects;

class Product{

    public Product(int id, String name, int price, String category){
            this.id = id;
            this.name = name;
            this.price = price;
            this.category = category;
    }

    int id;
    String name;
    int price;
    String category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return id == product.id && Objects.equals(category, product.category);
    }

    @Override
    public String toString(){
        return "Товар[артикул=" + id + ", название=" + name 
                + ", цена=" + price + ", категория=" + category + "]\n";
    }

}

class Order{
    String customer;
    Product[] basket;

    @Override
    public String toString() {
        return "Заказ клиента: " + customer + "\n" +
               "Корзина: " + Arrays.toString(basket);
    }

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Order oreder = (Order) o;
        return customer == oreder.customer && basket.equals(oreder.basket);
    }
}

public class Hw13{
    public static void main(String[] args) {
        Product product1 = new Product(123, "Масло", 120, "молочная продукция");
        Product product2 = new Product(123, "Масло сливушка", 130, "молочная продукция");
        Product product3 = new Product(456, "Хлеб", 80, "хлебобулочные изделия");
        Product product4 = new Product(789, "Шоколад", 250, "кондитерские изделия");

        System.out.println(product1.toString());
        System.out.println(product1.equals(product2) + "\n");
        System.out.println(product1.equals(product3) + "\n");

        Product[] basket = {product1, product2, product3, product4};

        Order order1 = new Order("Иван Петров", basket);
        Order order2 = new Order("Иван Петров", basket);

        System.out.println(order1);
        System.out.println(order1.equals(order2));


    }
}