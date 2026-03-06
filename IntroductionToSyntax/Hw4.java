public class Hw4 {

    public static void main(String[] args) {
        // task 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // task 2
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // task 3
        int year = 2023;

        if (year > 1584) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            } else if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        // task 4
        int deliveryDistance = 95;
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            days = 0;
        }

        if (days == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }

        // task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
                System.out.println("Зима");
                break;

            case 1:
                System.out.println("Зима");
                break;

            case 2:
                System.out.println("Зима");
                break;

            case 3:
                System.out.println("Весна");
                break;

            case 4:
                System.out.println("Весна");
                break;

            case 5:
                System.out.println("Весна");
                break;

            case 6:
                System.out.println("Лето");
                break;

            case 7:
                System.out.println("Лето");
                break;

            case 8:
                System.out.println("Лето");
                break;

            case 9:
                System.out.println("Осень");
                break;

            case 10:
                System.out.println("Осень");
                break;

            case 11:
                System.out.println("Осень");
                break;
        
            default:
                System.out.println("Такого месяца нет");
                break;
        }
        
    }
}