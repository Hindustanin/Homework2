public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println();
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println();
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println();
        System.out.println("friend = " + friend);

        friend = friend + 2;
        System.out.println("friend = " + friend);

        friend = friend / 7;
        System.out.println("friend = " + friend);

        var frog = 3.5;
        System.out.println();
        System.out.println("frog = " + frog);

        frog = frog * 10;
        System.out.println("frog = " + frog);

        frog = frog / 3.5;
        System.out.println("frog = " + frog);

        frog = frog + 4;
        System.out.println("frog = " + frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightTotal = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;
        System.out.println();
        System.out.println("Общая масса = " + weightTotal + " кг");
        System.out.println("Разница = " + weightDifference + " кг");

        var divisionLeft = boxer2 % boxer1;
        System.out.println();
        System.out.println("Остаток деления = " + divisionLeft + " кг");

        var timeWork = 640;
        var timeWorker = 8;
        var workers = timeWork / timeWorker;
        System.out.println();
        System.out.println("Всего работников в компании — " + workers + " человек");

        var totalWorkers = workers + 94;
        var timeTotal = totalWorkers * timeWorker;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + timeTotal + " часов работы может быть поделено между сотрудниками");


    }
}