package HW8;

import java.util.Arrays;

import static HW8.HW8_1.*;
import static Utils.Utilss.*;

public class HW8 {

    //7.
    public static int[] arrNum (int a, int b, int c, int d, int e) {
        int [] arrNum = new int [5];
        arrNum[0] = a;
        arrNum[1] = b;
        arrNum[2] = c;
        arrNum[3] = d;
        arrNum[4] = e;
        return arrNum;
    }

    //8.
    public static double[] arrNum (double a, double b, double c, double d, double e) {
        double [] arrNum = new double [5];
        arrNum[0] = a;
        arrNum[1] = b;
        arrNum[2] = c;
        arrNum[3] = d;
        arrNum[4] = e;
        return arrNum;
    }

    //9. Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] arrNum (String a, String b, String c, String d, String e) {
        String [] arrNum = new String [5];
        arrNum[0] = a;
        arrNum[1] = b;
        arrNum[2] = c;
        arrNum[3] = d;
        arrNum[4] = e;
        return arrNum;
    }

    //10. Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел, умноженных на 2.5
    public static void arrDoubl (int[] array) {
        double[] arrDouble = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrDouble[i] = array[i] * 2.5;
        }
        arrayToPrint(arrDouble);
    }

    //11. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает количество четных
    // чисел в этом массиве

    public static int arrAmountOfEven (int [] array) {
        int amountOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                System.out.println("Введен член массива <=0");
                amountOfEven = 0;
                break;
            } else if (array[i] % 2 == 0) {
                amountOfEven++;
            }
        }
        return amountOfEven;
    }

    //12. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает количество нечетных
    // чисел в этом массиве

    public static int arrAmountOfOdd (int [] array) {
        int amountOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                amountOfOdd++;
            }  else if (array[i] == 0) {
                System.out.println("Введен член массива <=0");
                amountOfOdd = 0;
                break;
            }
        }
        return amountOfOdd;
    }

    //13 Написать метод, который принимает на вход массив целых чисел,  и возвращает массив значений true
    //   или false, если числа больше 10

    public static boolean[] ifNumbersMoreThenTenMeth (int [] array) {
        boolean[] ifNumbersMoreThenTen = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                ifNumbersMoreThenTen[i] = true;
            } else if (array[i] <= 0) {
                System.out.println("Введен член массива <=0");
               // ifNumbersMoreThenTen[i] = false;
                break;
            } else {
                ifNumbersMoreThenTen[i] = false;
            }
        }
        return ifNumbersMoreThenTen;
    }

    //14. Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
  //метод arrayToPrint ранее написан в Utils

    //15. Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
    public static int sumSecondHalfOfArray (int[]array) {
        int sum = 0;
        for (int i = (int)array.length/2; i < array.length; i++) {
            sum +=array[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        task(5);
        Integer newIntObj = 5;
        Double newDoubObj = 5.6;
        String newStringObj = "String";
        System.out.println(newIntObj);
        System.out.println(newDoubObj);
        System.out.println(newStringObj);

        task(6);
        boolean areEqualsInt = intObj.equals(newIntObj);
        boolean areEqualsDoub = doubObj.equals(newDoubObj);
        boolean areEqualsStr = strObj.equals(newStringObj);
        line();
        System.out.println("|       HW8     |       HW8_1       |       areEquals?      |");
        line();
        System.out.println("| intObj = " + intObj + "    |   newIntObj = " + newIntObj + "   |    " + areEqualsInt + "               |");
        line();
        System.out.println("| doubObj = " + doubObj + " |   newIntObj = " + newDoubObj + " |    " + areEqualsDoub + "               |");
        line();
        System.out.println("| str= " + strObj + "   |   newStr = " + newStringObj + " |    " + areEqualsStr + "               |");
        line();

        task(7); //Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
        System.out.println(Arrays.toString(arrNum(5,6,7,8,9)));

        task(8); //Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
        System.out.println(Arrays.toString(arrNum(5.5,6.4,7.4,8.8,9.9)));

        task(9); // Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        System.out.println(Arrays.toString(arrNum("one","two","three","four","five")));

        task(10); // Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел,
        // умноженных на 2.5
        arrDoubl( new int[] {4,8,56,3,4,56});

        task(11); //Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает
        // количество четных чисел в этом массиве
        System.out.println(arrAmountOfEven(new int[] {1,2,3,4,5,6}));
        System.out.println(arrAmountOfEven(new int[] {-1,2,3,4,5,6}));
        System.out.println(arrAmountOfEven(new int[] {0,2,3,4,5,6}));
        verifyEquals(3, arrAmountOfEven(new int[] {2,3,4,5,6}));

        task(12); //Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает
        // массив нечетных чисел
        System.out.println(arrAmountOfOdd(new int[] {1,3,7,8}));

        task(13); //Написать метод, который принимает на вход массив целых чисел,  и возвращает массив значений true
        // или false, если числа больше 10
        arrayToPrint(ifNumbersMoreThenTenMeth(new int[]{12,17,10,-1}));

        task(14); //Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
        arrayToPrint(new String[]{"one","two", "three"});

        task(15); //Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
        System.out.println(sumSecondHalfOfArray(new int[]{1,2,3,-2,-6}));

        task(16); //Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
        //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
    }
}
