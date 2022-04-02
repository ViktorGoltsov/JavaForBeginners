package lessons;

public class Lesson6 {

    public static void main(String[] args) {
        //Print "Java for beginners" for all numbers from 1 to 5 including.
        for (int i = 1; i < 6; i++) {
            System.out.println("Java for beginners");
        }

        //Print numbers from 1 to 5 including
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }


        //Print only odd numbers from 1 to 10 including
        for (int i = 1; i < 11; i++) {

            if ( i % 2 != 0) {
            System.out.println(i);}
        }

        for (int i = 1; i < 11; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 1; i < 11; i += 2) {  //+= - go with step = 2
            System.out.println(i);
        }

        //Print all numbers from 1 to 100 with gap = 10

        for (int i = 1; i < 101; i +=10) {
            System.out.println(i);
        }

        //Print all numbers in between 0 and 100, which is devided by 10
        for (int i =0 ; i < 101; i +=10) {
            System.out.println(i);
        }

        //Print all numbers in between -100 and 100, which is devided by 10
        for (int i = -100 ; i < 101; i +=10) {
            System.out.println(i);
        }

        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String NoMore = "No more ";
        String noMore = "no more";
        String ln = "\n";

        //Печатаем все числа от 5 до 1 включительно
        for (int i = 99; i > -1; i--) {
            if (i == 2) {
                System.out.println(i+ bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
            } else if (i == 1) {
                System.out.println(i+ bottle + wall + commaSpace + i + bottle + dot);
                System.out.println(take + commaSpace + noMore + bottles + wall + dot + ln);
            } else if (i == 0) {
                System.out.println(NoMore+ bottles + wall + commaSpace + noMore + bottles + dot);
                System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot);
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);

            }
        }
    }



}
