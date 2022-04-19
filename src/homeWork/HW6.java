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
    }
}
