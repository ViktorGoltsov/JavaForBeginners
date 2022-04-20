package homeWork;

import static Utils.Utilss.task;

public class HW6 {

    //1. Print the sequance of numbers from 0 to 9\
    public static void sequence() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    //2. Распечатать последовательность чисел от 10 исключительно до 0 включительно
    public static void sequence2() {
        for (int i = 9; i > -1; i--) {
            System.out.println(i);
        }
    }

    //3. Распечатать последовательность чисел от 50  до 55 включительно с шагом 2
    public static void sequence3() {
        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }
    }

    //4.
    // распечатать послежовательность чисел кратных 7 в промежутке от 327 до 300
    public static void sequence4() {
        for (int i = 327; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    //5
    //распечатать послежовательность чисел  в промежутке [12;13] с шагом 0.1
    public static void sequence5() {
        for (double i = 12.0; i <= 13; i+=0.1) {
            System.out.printf("%.1f", i);
            System.out.println();
            }

    }

    //6
    //распечатать послежовательность четных чисел  в промежутке [215;237]
    public static void sequence6() {
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //7 Распечатать последовательность чисел кратных 7 в промежутке (7;14)
    public static void sequence7() {
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    //8 Распечатать последовательность, которая начинается с минимального значения типа шорт и заканчивается максимальным значением шорт. Числа в последовательности доолжны быть кратны 15001
    public static void sequence8() {
        for (Short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }
    }

    // 9. Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
    // должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом.
    // А ноль необходимо распечатать словом ZERO.

    public static void sequence9() {
        for (int i = -10; i <= 34; i++) {

            if ((i % 11 == 0) && (i != 0)) {
                System.out.println("\u001B[34m" + i + "\u001B[0m"); //blue
            }  else if ((i % 12 == 0) && (i != 0)) {
                System.out.println("\u001B[31m" + i + "\u001B[0m"); //red
            }  else if (i == 0) {
                System.out.println("ZERO");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void startEndStep (int start, int end, int step) {
        for (int i = start; i < end; i += step) {
            System.out.println((double) i);
        }
    }

    public static void sequence11 (int l) {
        int lenth = 0;
        for (int i = 0; lenth < l; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                lenth = lenth + 1;
            }
        }
    }

    //12 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
    public static void pow (int n) {
        for (int i = 1; i <= n;  i++) {
            System.out.println((int)Math.pow(2, i));
        }
    }

    //13 Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
    public static void sequence13() {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                int l = 1;
                while (l <= i) {
                    System.out.print(j);
                    l++;
                }
            }
        }
        System.out.println();
    }

    //14 Распечатайте последовательность чисел:
    //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
    public static void sequence14 () {
        int i = 0;
        while (Math.abs(i) < 6) {
            if (i == 0) {
                System.out.println(i);
                i++;
            } else if (i > 0) {
                System.out.println(i);
                i = i * (-1);
            } else {
                System.out.println(i);
                i = i * (-1) + 1;
            }
        }
    }

    //16 Написать метод, который принимает параметры n, m, , и печатает последовательность нечетных чисел начиная
    // с числа n, с шагом m,  длина последовательности l.

    public static void sequence16(int n, int m, int l) {
        if (n % 2 == 0) {
            n = n + 1;
        }
        int lon = 0;
        for (int i = n; lon < l  ; i+=m) {
            System.out.println(i);
            lon = lon + 1;
        }
    }

    //17. Сгенерируйте и распечатайте последовательность по формуле:
    //n + 1 = n + 2

    public static void sequence17 (int n, int l) { //n - начало последовательности l - количество членов последовательности
        for (int i = 1; i <= l; i++) {
            System.out.println(n);
            n += 2;
        }
    }

    //18. Написать метод, который принимает параметры l, n, и печатает последовательность чисел, начиная с числа n,
    // по формуле для n + 1 члена последовательности: n + 1 = 2n   Длина последовательности  - l .
    public static void sequence18 (int n, int l) {

        for (int i = 1; i <= l; i++) {
            System.out.println(n);
            n *= 2;
        }
    }

    //19 Сгенерируйте последовательность целых положительных  двузначных чисел, в которых разница между первой цифрой
    // (десятки) и второй цифрой (единицы) не превышает 3.
    public static void sequence19 () {
        for (int i = 10; i < 100; i++) {
            if (((int)(i / 10) - (int)(i % 10)) <= 3) {
                System.out.println(i);
            }
        }
    }

    //20
    public static double function (double x) {
        double y;
        if (x > 1.5) {
            y = 2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30;
        } else if (x >= 0 && x <= 1.5) {
            y = x + 1;
        } else {
            y = x;
        }
        return y;
    }

    public static void main(String[] args) {
        //1
        task();
        sequence();

        //2
        task();
        sequence2();

        //3
        task();
        sequence3();

        //4
        task();
        sequence4();

        //5
        task();
        sequence5();

        //6.
        task();
        sequence6();

        //7.
        task();
        sequence7();

        //8.
        task();
        sequence8();

        //9.
        task();
        sequence9();

        //10.
        task();
        startEndStep(5,15,2);

        //11.
        task();
        sequence11(5);

        //12.
        task();
        pow(5);

        //13.
        task();
        sequence13();

        //14.
        task();
        sequence14();

        //15
        task();

        //16
        task();
        sequence16(6,3, 4);

        //17.
        task();
        sequence17(5, 4);

        task();
        sequence18(5, 4);

        task();
        sequence19();

        task();
        System.out.println(function(1.6));
        System.out.println(function(1.5));
        System.out.println(function(0));
        System.out.println(function(-1));
        System.out.println(function(-0.1));
        System.out.println(function(1));
        System.out.println(function(2));
    }

}
