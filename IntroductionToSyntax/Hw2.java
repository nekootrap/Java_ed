public class Hw2 {
    public static void main(String[] args) {
        // task 1
        int a = 1000;
        byte b = 0;
        short c = 300;
        long d = 10000l;
        double doub = 5.2322;
        float fl = 0.1f;

        System.out.println("Значение переменной с типом int равно " + a +
         " Значение переменной с типом byte равно " + b +
         " Значение переменной с типом short равно " + c +
         " Значение переменной с типом long равно " + d +
         " Значение переменной с типом double равно " + doub +
         " Значение переменной с типом float равно " + fl);

        // task 2
        float one = 27.12f;
        long two = 987678965549l;
        double three = 2.786;
        short four = 569;
        int five = -159;
        var six = 27897;
        byte seven = 67;

        // task 3
        byte ludm = 23;
        byte anna = 27;
        byte ek = 30;
        short paper = 480;
        int pep = paper / (ludm + anna + ek);
        System.out.println("На каждого ученика рассчитано " +  pep + " листов бумаги");

        // task 4
        int proiz = 16 / 2;
        int proiz20Min = proiz * 20;
        int proizDay = proiz * 60 * 24;
        int proiz3Day = proizDay * 3;
        int proizMoun = proizDay * 30;
        System.out.println("За " + 20 + " минут машина произвела " + proiz20Min + " штук бутылок");
        System.out.println("За " + 1 + " день машина произвела " + proizDay + " штук бутылок");
        System.out.println("За " + 3 + " дня машина произвела " + proiz3Day + " штук бутылок");
        System.out.println("За " + 1 + " месяц машина произвела " + proizMoun + " штук бутылок");

        // task 5
        int total = 120;
        byte white = 2;
        byte brown = 4;
        int perClass = white + brown;
        int cl = total / perClass;
        int whiteTotal = cl * white;
        int brownTotal = cl * brown;
        System.out.println("В школе, где " + cl + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");

        // task 6
        int ban = 5 * 80;
        int milk = 2 * 105;
        int ice = 2 * 100;
        int egg = 4 * 70;
        int grams = ban + milk + ice + egg;
        int kg = grams / 1000;
        System.out.println(grams + " грамм");
        System.out.println(kg + " килограмм");

        // task 7
        int weight = 7 * 1000;
        int day1 = 250;
        int day2 = 500;
        int days1 = weight / day1;
        int days2 = weight / day2;
        int avg = (days1 + days2) / 2;
        System.out.println("При потере 250: " + days1 + " дней");
        System.out.println("При потере 500: " + days2 + " дней");
        System.out.println("В среднем: " + avg + " дней");

        // task 8
        int masha = 67760; // это не var, а int
        int denis = 83690; // это не var, а int
        int kristina = 76230; // это не var, а int
        int mashaNew = masha + masha * 10 / 100; // это не var, а int
        int denisNew = denis + denis * 10 / 100; // это не var, а int
        int kristinaNew = kristina + kristina * 10 / 100; // это не var, а int
        int mashaDiff = (mashaNew - masha) * 12; // это не var, а int
        int denisDiff = (denisNew - denis) * 12; // это не var, а int
        int kristinaDiff = (kristinaNew - kristina) * 12; // это не var, а int
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей");

                




    }
}
