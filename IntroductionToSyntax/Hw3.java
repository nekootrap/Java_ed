public class Hw3 {
    public static void main(String[] args) {

        //task 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        
        // task 2
        int temp = 13;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

<<<<<<< HEAD
        // task 3
        int speed = 50;
        var a = "Если скорость " + speed + " то придется заплатить штраф";
        var b = "Если скорость " + speed +  " то можно ездить спокойно";
        System.out.println(speed >= 60 ? a : b ); // эта конструкция из C++ работает на джаве, просто эксперемент, но рабочий. Остальные задачи сделаю нормально
        
=======

        // task 3
        int speed = 50;
        if (speed >= 60){
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed +  " то можно ездить спокойно");
        }


>>>>>>> 11a503c (h)
        // task 4
        int age4 = 10;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу");
        }

        // task 5
        int childAge = 12;
        boolean hasAdult = true;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // task 6
        int seats = 60;
        int total = 102;
        int people = 52;
        if (people < seats) {
            System.out.println("В вагоне есть сидячее место");
        } else if (people >= seats && people < total) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("Вагон полностью забит");
        }

        // task 7
        int one = 12;
        int two = 67;
        int three = 42;
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}
