public class Hw5 {
    public static void main(String[] args) {
        // task 1
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // task 2
        for (int j = 10; j >= 1; j--){
            System.out.println(j);
        }

        // task 3
        for (int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }

        // task 4
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        // task 5
        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосным");
        }

        // task 6
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }

        // task 7
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }

        // task 8
        int sum = 0;
        for (int i = 1; i <= 12; i++){
            sum += 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, sum);
        }

        // task 9
        double sumper = 0;
        for (int i = 1; i <= 12; i++){
            sumper += sumper * 0.01;
            sumper += 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, sumper);
        }

        // task 10
        for (int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}
