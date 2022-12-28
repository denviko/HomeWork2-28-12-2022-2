public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(763789);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        var TotalWeight = WeightBoxer1 + WeightBoxer2;
        System.out.println("Общий вес двух бойцов " + TotalWeight + "кг.");
        var WeightDifference = WeightBoxer2 - WeightBoxer1;
        System.out.println("Разница между весами бойцов " + WeightDifference + "кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        var WeightDifference1 = WeightBoxer2 - WeightBoxer1;
        System.out.println("Разница между весами бойцов1 " + WeightDifference1 + "кг.");
        var WeightDifference2 = WeightBoxer2 % WeightBoxer1;
        System.out.println("Разница между весами бойцов2 " + WeightDifference2 + "кг.");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var TotalHours = 640;
        var EmployeeTime = 8;
        var TotalNumberOfEmployees = TotalHours / EmployeeTime;
        System.out.println(" Всего работников в компании " + TotalNumberOfEmployees + " человек");
        var AdditionalEmployees = TotalNumberOfEmployees + 94;
        var EmployeeTime2 = TotalHours / AdditionalEmployees;
        System.out.println("Если в компании работает " + AdditionalEmployees + " человека, то всего " + EmployeeTime2 + " часа работы может быть поделено между сотрудниками");
    }
}