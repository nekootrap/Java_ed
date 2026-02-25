public class Hw1 {

    public static void main(String[] args) {
        // Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);
        
        // Task 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog + " " + cat + " " + paper);

        // Task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog + " " + cat + " " + paper);

        // Task 4
        var friend = 19;
        System.out.println(friend);

        friend *= 2;
        System.out.println(friend);

        friend /= 7;
        System.out.println(friend);

        // Task 5
        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);

        // Task 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var b1pb2 = boxer1 + boxer2;
        var b2mb2 = boxer2 - boxer1;
        System.out.println(b1pb2);
        System.out.println(b2mb2);

        // Task 7
        var b1ob2 = boxer2 % boxer1;
        System.out.println(b1ob2);

        // Task 8
        var workers = 640 / 8;
        System.out.println("Всего работников в компании — " + workers +  " человек");
        workers += 94;
        var worktime = workers * 8;
        System.out.println("Если в компании работает " + (workers) + " человек, то всего " + (worktime) + " часов работы может быть поделено между сотрудниками");

    }

}


