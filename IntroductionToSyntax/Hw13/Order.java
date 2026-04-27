import java.util.Arrays;
import java.util.Objects;

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

