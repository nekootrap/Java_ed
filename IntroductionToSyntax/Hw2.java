public class Hw2 {
    public static void main(String[] args) {
        // task 1
        int a = 1000;
        byte b = 0;
        short c = 300;
        long d = 10000L;
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
        long two = 987678965549L;
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
        float ban = 5 * 80;
        float milk = 2 * 105;
        float ice = 2 * 100;
        float egg = 4 * 70;
        float grams = ban + milk + ice + egg;
        float kg = grams / 1000;
        System.out.println(grams + " грамм");
        System.out.printf("%.2f килограмм\n", kg);

        
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
        float masha = 67760; 
        float denis = 83690; 
        float  kristina = 76230; 
        float mashaNew = masha + masha * 10 / 100; 
        float denisNew = denis + denis * 10 / 100; 
        float kristinaNew = kristina + kristina * 10 / 100; 
        float mashaDiff = (mashaNew - masha) * 12; 
        float denisDiff = (denisNew - denis) * 12; 
        float kristinaDiff = (kristinaNew - kristina) * 12; 
        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", mashaNew, mashaDiff );
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", denisNew, denisDiff);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", kristinaNew, kristinaDiff);

                




    }
}
