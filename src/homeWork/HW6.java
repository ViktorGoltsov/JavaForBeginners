package homeWork;

import static Utils.Utilss.task;

public class HW6 {

    //1. Print the sequance of numbers from 0 to 9\
    public static void sequance () {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    //2. Распечатать последовательность чисел от 10 исключительно до 0 включительно
    public static void sequance2 () {
        for (int i = 9; i > -1; i--) {
            System.out.println(i);
        }
    }

    //3. Распечатать последовательность чисел от 50  до 55 включительно с шагом 2
    public static void sequance3 () {
        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }
    }

    //4. распечатать послежовательность чисел кратных 7 в промежутке от 327 до 300
    public static void sequance4 () {
        for (int i = 327; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        //1
        task();
        sequance();

        //2
        task();
        sequance2();

        //3
        task();
        sequance3();

        //4
        task();
        sequance4();

    }
}
