public class Main {
    public static void main(String[] args) {

        //Задание 6
        System.out.println("Задание 6:");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println ("Вес одного боксера – " + boxer1Weight + " кг");
        System.out.println ("Вес второго боксера – " + boxer2Weight + " кг");
        System.out.println("Общий вес двух бойцов равен "+ (boxer1Weight + boxer2Weight) + " кг");
        System.out.println("Разница между весами бойцов составляет "+ (boxer2Weight-boxer1Weight) + " кг");

        //Задание 7
        System.out.println("Задание 7:");
        System.out.println("1. " + (boxer2Weight-boxer1Weight));//Использована операция вычитания
        System.out.println("2. " + (boxer2Weight%boxer1Weight));//Использована операция остаток от деления

        //Задание 8
        System.out.println("Задание 8:");
        var workTime = 640;
        var workTimeForOne = 8;
        System.out.println("Всего работников в компании – " + (workTime/workTimeForOne) + " человек");

        var workers = workTime/workTimeForOne;
        var newWorkers = 94;
        var newWorkTime = (workers + newWorkers)*workTimeForOne;
        System.out.println("Если в компании работает " + (workers + newWorkers) + " человек, то всего " + (newWorkTime) + " часа работы может быть поделено между сотрудниками");

    }
}