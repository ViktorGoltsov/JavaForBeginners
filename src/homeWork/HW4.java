package homeWork;

import javax.crypto.spec.PSource;

public class HW4 {

    public static int i = 3;
    public static void task() {
        System.out.println("_____________________________________________________");
        System.out.println("                      Task " + i);
        System.out.println("-----------------------------------------------------");
        i++;
    }

    public static void testToExpRez (Integer nInit, Integer expectedResult){
        int n = nInit;
        if (n % 2 == 0) {
            n = n * 2;
        } else {
            n= n * n;
        }

        if (expectedResult == n) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public static void testTo20Task(int Age, String expRez) {
        String resolution = "---";
        if (Age >= 18) {
        resolution = "В школу можно идти. Машину можно водить. Голосовать можно.";
        } else if (Age >= 16) {
        resolution = "В школу можно идти. Машину можно водить.";
        } else if (Age >= 5) {
        resolution = "В школу можно идти.";
        }
        System.out.println("\nTest with " + Age + " years\nActual rezult = " + resolution + "\nExpected result = " + expRez);

        if (expRez == resolution) {
        System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
        System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
}


    public static void main(String[] args) {

        task();
        System.out.println("(2 == 2) && (7 == 7) - " + ((2 == 2) && (7 == 7)));
        System.out.println("!(15 < 3) - " + !(15 < 3));
        System.out.println("(Сосна = Дуб) ИЛИ (Вишня = Клён) - " + (("Сосна" == "Дуб") || ("Вишня" == "Клён")));
        System.out.println("Не(Сосна = Дуб) - " + !("Сосна" == "Дуб"));
        System.out.println("(Не(15 < 3)) И (10 > 20) - " + (!(15 < 3) && (10 > 20)));
        System.out.println("(Глаза даны, чтобы видеть) И (Под третьим этажом находится второй этаж) - "
                + ((true) && (true)));
        System.out.println("(6/2 = 3) ИЛИ (7*5 = 20) - " + ((6 / 2 == 3) || (7 * 5 == 20)));

        task();
        //1
        String cond1 = "В минуте 70 секунд";
        String cond2 = "Работающие часы показывают время";
        System.out.println("(В минуте 70 секунд) ИЛИ (Работающие часы показывают время) - "
                + ((cond1.equals("В минуте 70 секунд")) || (cond2.equals("Работающие часы показывают время"))));

        //2
        System.out.println("!(28 > 7) И !(300/5 = 60) - " + (!(28 > 7) && !(300 / 5 == 60)));

        //3
        String TV = "электрический прибор";
        String Glass = "материал из кварца";
        System.out.println("(Телевизор - электрический прибор) И (Стекло - дерево) - " +
        ((TV.equals("электрический прибор") && (Glass.equals("дерево")))));

        //4
        if (!(300 < 100)) {
            System.out.println("Жажду можно утолить водой");
        }

        //5
        if (75 < 81) {
            if (88 == 88) {
                System.out.println("true");
            }
        }
        //a
        task();
        int ageOfAndrey = 30;
        int ageOfNatasha = 25;
        int ageOfSveta = 18;
        System.out.println("Андрей старше Светы. Наташа старше Светы. - "
                + ((ageOfAndrey > ageOfSveta) && (ageOfNatasha > ageOfSveta)));

        //b
        String thingsOnTheShelf = "учебники";
        String thingsOnTheTable = "справочники";
        System.out.println("На полке стоят учебники, а на столе лежат справочники. - "
                + ((thingsOnTheShelf.equals("учебники")) || (thingsOnTheTable.equals("справочники"))));

        //c
        float percentageOfBoys = 45;
        float percentageOfGirls = 55;
        System.out.println("БОльшая часть детей — девочки. Остальные - мальчики. - "
                + (percentageOfBoys < percentageOfGirls));

        task();
        //6.“Водительские права можно получить, только когда исполнится 16 лет.”
        int age = 16;
        if (age >= 16) {
            System.out.println("age = " + age + " - driver's license available");
        } else {
            System.out.println("age = " + age + " - driver's license not available until 16 y.o.");
        }

        task();
        //7.”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”

        String act1 = "едет в автобусе";
        String act2 = "читает книгу";
        String act3 ="смотрит в окно";
        System.out.println("(Петя && !(едет в автобусе)) && (читает книгу || !смотрит в окно))");

        task();
        //8. “Если с другом ты, это хорошо, а когда наоборот - плохо”
        Boolean ifYouHaveAFriend = true;
        if (ifYouHaveAFriend) {
            System.out.println("Если с другом ты - это хорошо");
        } else {
            System.out.println("а когда наоборот (без друга) - плохо");
        }
        System.out.println("((с другом) && (хорошо))||(!(с другом) && !(хорошо))");


        task();
        //9.
        // - Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        int age1 = 18;
        if (age1 > 18) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are child");
        }

        // Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        String conditionOfGround = "wet";
        if (conditionOfGround == "dry") {
            System.out.println("there is no rain");
        } if (conditionOfGround == "wet") {
            System.out.println("it's raining");
        }

        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        String conditionOfGround2 = "?";
        if (conditionOfGround2 == "dry") {
            System.out.println("there is no rain");
        } if (conditionOfGround2 == "wet") {
            System.out.println("it's raining");
        } else {
            System.out.println("it snows");
        }

        //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
        boolean isTheCloudsInTheSky = false;
        if (isTheCloudsInTheSky) {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет “слепой” дождь");
        }

        //Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
        //Иначе вчера был не четверг, а завтра - не воскресенье
        String dayOfToday = "суббота";

        if (dayOfToday == "суббота") {
            System.out.println("значит, завтра воскресенье");
        } else if (dayOfToday == "пятница") {
            System.out.println("значит, вчера был четверг");
        } else {
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }

        //Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        boolean ifCrayfishWhistle = false;
        if (ifCrayfishWhistle) {
            System.out.println("значит, прошла вечность");
        } else {
            System.out.println("иначе ждите дальше.");
        }

        //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
        age = 17;
        boolean ifTheScoolPassed = false;

        if ((age == 18) || ifTheScoolPassed) {
            System.out.println("ты можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями");
        }

        task();
        //Part 2
        //10
        //Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        //Выведите результат работы алгоритма на печать.
        //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.


        int n = 5;
        if (n % 2 == 0) {
            n = n * 2;
        } else {
            n= n * n;
        }
        System.out.println(n);

        //test from task 19

        testToExpRez(2,4);
        testToExpRez(5,25);
        testToExpRez(0,0);

        //11
        task();
        //Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //Голосовать можно с 18 лет
        //Машину можно водить с 16 лет
        //В школу можно идти с 5 лет
        //Выведите результат работы алгоритма на печать.
        //
        //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

        age = 17;
        String resolution = "---";
        if (age >= 18) {
            resolution = "В школу можно идти. Машину можно водить. Голосовать можно.";
        } else if (age >= 16) {
            resolution = "В школу можно идти. Машину можно водить.";
        } else if (age >= 5) {
            resolution = "В школу можно идти.";
        }
            System.out.println(resolution);

        //test from task 20
        testTo20Task (19, "В школу можно идти. Машину можно водить. Голосовать можно.");
        testTo20Task (17, "В школу можно идти. Машину можно водить.");
        testTo20Task (15, "В школу можно идти.");
        testTo20Task (4, "---");

        //12
        task();

        //Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //5 - выдать похвальную грамоту и перевести в следующий класс
        //4 - перевести в следующий класс
        //3 - дать задание на лето и перевести в следующий класс
        //2 - вызвать родителей и оставить в текущем классе на второй год
        //Выведите результат работы алгоритма на печать.
        //
        //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        int mark = 1;
        if (mark == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (mark == 4) {
            System.out.println("перевести в следующий класс");
        } else if (mark == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else if (mark == 2) {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        } else  {
            System.out.println("оцените по шкале от 2 до 5");
        }

        task();
        //13. Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа,
        // которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка. Программа умножает числа,
        // которые делятся на 2 без остатка, но если хотя бы одно число отрицательное, программа умножает результат предыдущего действия на (-1).
        //Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.

        double x = -30;
        double y = 60;

        if ((x % 3 == 0) && (y % 3 == 0)) {
            System.out.println(x + y);
        } if ((x % 5 == 0) && (y % 5 == 0)) {
            System.out.println(x - y);
        } if ((x % 2 == 0) && (y % 2 == 0) && ((x < 0)||(y < 0))) {
            System.out.println(x * y * (-1));
        } if ((x % 2 == 0) && (y % 2 == 0) && ((x >= 0) || (y >= 0))) {
            System.out.println(x * y);
        } else {
            System.out.println("ошибка о невозможности произвести действия");
        }

    }
}
