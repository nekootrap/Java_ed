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
        System.out.println("Ожидается: true (полностью одинаковые)\n");

        System.out.println("3. Тест equals() - разные товары:");
        System.out.println("product1.equals(product3) = " + product1.equals(product3));
        System.out.println("Ожидается: false (разные id и категория)\n");

        System.out.println("4. Тест equals() - одинаковый id и категория, разные name/price:");
        System.out.println("product1.equals(product4) = " + product1.equals(product4));
        System.out.println("Ожидается: true (совпадают id и category, name и price игнорируются)\n");

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
        System.out.println("Ожидается: true\n");

        System.out.println("3. Тест equals() - разные корзины (но равные товары внутри):");
        System.out.println("order1.equals(order3) = " + order1.equals(order3));
        System.out.println("Проверка работы массивов в Order.\n");

        System.out.println("4. Тест equals() - разные клиенты:");
        System.out.println("order1.equals(order4) = " + order1.equals(order4));
        System.out.println("Ожидается: false\n");

    }
}