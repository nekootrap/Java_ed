public class Hw6 {
    public static void main(String[] args) {
        System.out.println("task 1\n");
        int firstFriday = 5;
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", i);
                firstFriday += 7;
            }
        }

        System.out.println("task 2\n");
        int distance = 0;
        do {
            System.out.printf("Держитесь! Осталось %d метров\n", (42195 - distance));
            distance += 500;
        } while (distance <= 42195);

        int distance_for = 0;
        for (int i = 500; distance_for <= 42195; ) {
            System.out.printf("Держитесь! Осталось %d метров\n", (42195 - distance_for));
            distance_for += i;
        }

        System.out.println("task 3\n");
        int day = 1;
        int sum = 985;

        while (sum >= 100) {
            if (day % 5 == 0) {
                day++;
                continue;
            }
            day++;
            sum -= 100;
        }
        System.out.printf("Вы сможете оставить машину на %d дней (while)\n", day - 1);

        int day_for = 1;
        int sum_for = 985;
        
        for (; sum_for >= 100; day_for++) {
            if (day_for % 5 == 0) {
                continue;
            }
            sum_for -= 100;
        }
        System.out.printf("Вы сможете оставить машину на %d дней (for)\n", day_for - 1);

        System.out.println("task 4\n");
        int month = 0;
        double total = 0;
        final int TARGET = 12_000_000;
        final int MONTHLY_CONTRIBUTION = 15_000;

        while (true) {
            month++;
            total += MONTHLY_CONTRIBUTION;

            if (month % 6 == 0) {
                double interest = total * 0.07;
                total += interest;
            }

            System.out.printf("Месяц %d, сумма накоплений: %.0f рублей\n", month, total);

            if (total >= TARGET) {
                System.out.printf("Цель достигнута за %d месяцев!\n\n", month);
                break;
            }
        }

        System.out.println("task 5\n");
        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats < 3) { 
            minute++;

            if (minute % 10 == 0) {
                overheats++;
                System.out.printf("Минута %d: Перегрев! Зарядка приостановлена на 2 минуты. (Перегрев #%d)\n", minute, overheats);
                minute += 2;

                if (overheats >= 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    System.out.printf("Время зарядки составило %d минут.\n", minute);
                    return;
                }
                continue;
            }

            charge += 2;
            if (charge > 100) {
                charge = 100;
            }
        }

        if (charge >= 100) {
            System.out.println("Устройство полностью заряжено (100%).");
            System.out.printf("Время зарядки составило %d минут.\n", minute);
        } else {
            System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
            System.out.printf("Время зарядки составило %d минут.\n", minute);
        }
    }
}