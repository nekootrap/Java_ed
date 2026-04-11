import java.time.LocalDate;

public class Hw11 {

    public static void checkLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " год — невисокосный год");
        } else if (year % 4 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void printAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            return 0;
        }

        return days;
    }

    public static void main(String[] args) {
        checkLeapYear(2020);

        int currentYear = LocalDate.now().getYear();
        printAppVersion(0, currentYear);

        int deliveryDistance = 42;
        int days = calculateDeliveryDays(deliveryDistance);
        
        if (days == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}