package HW8;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

import static HW8.HW8_1.*;
import static Utils.Utilss.*;

public class HW8 {

    //7.
    public static int[] arrNum(int a, int b, int c, int d, int e) {
        int[] arrNum = new int[5];
        arrNum[0] = a;
        arrNum[1] = b;
        arrNum[2] = c;
        arrNum[3] = d;
        arrNum[4] = e;
        return arrNum;
    }

    //8.
    public static double[] arrNum(double a, double b, double c, double d, double e) {
        double[] arrNum = new double[5];
        arrNum[0] = a;
        arrNum[1] = b;
        arrNum[2] = c;
        arrNum[3] = d;
        arrNum[4] = e;
        return arrNum;
    }

    //9. Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] arrNum(String a, String b, String c, String d, String e) {
        String[] arrNum = new String[5];
        arrNum[0] = a;
        arrNum[1] = b;
        arrNum[2] = c;
        arrNum[3] = d;
        arrNum[4] = e;
        return arrNum;
    }

    //10. Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел, умноженных на 2.5
    public static void arrDoubl(int[] array) {
        double[] arrDouble = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrDouble[i] = array[i] * 2.5;
        }
        arrayToPrint(arrDouble);
    }

    //11. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает количество четных
    // чисел в этом массиве

    public static int arrAmountOfEven(int[] array) {
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

    public static int arrAmountOfOdd(int[] array) {
        int amountOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                amountOfOdd++;
            } else if (array[i] == 0) {
                System.out.println("Введен член массива <=0");
                amountOfOdd = 0;
                break;
            }
        }
        return amountOfOdd;
    }

    //13 Написать метод, который принимает на вход массив целых чисел,  и возвращает массив значений true
    //   или false, если числа больше 10

    public static boolean[] ifNumbersMoreThenTenMeth(int[] array) {
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
    public static int sumSecondHalfOfArray(int[] array) {
        int sum = 0;
        for (int i = (int) array.length / 2; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    //16.
    public static int[] tabMultip(int a) {
        int[] tablUmn = new int[11];
        if (a > 0 && a < 10) {
            for (int i = 0; i < 11; i++) {
                tablUmn[i] = a * i;
            }
        } else {
            System.out.println("Введено число за пределами интервала [1; 10)");
        }

        return tablUmn;
    }

    //17.Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел
    // больше, или массив нечетных чисел, если нечетных чисел больше. Если по ровну, то возвращает пустой массив.
    public static int[] arrayOddOrEvenWichLarger(int[] array) {

        checkzwro(array);

        int[] arrNull = {};

        int amountOfOdd = 0;
        int amountOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                amountOfEven++;
            } else {
                amountOfOdd++;
            }
        }
        if (amountOfEven > amountOfOdd) {
            int[] arrayEven = new int[amountOfEven];
            int evenCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrayEven[evenCount] = array[i];
                    evenCount++;
                }
            }
            return arrayEven;

        } else if (amountOfEven < amountOfOdd) {
            int[] arrayOdd = new int[amountOfOdd];
            int oddCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    arrayOdd[oddCount] = array[i];
                    oddCount++;
                }
            }
            return arrayOdd;
        } else {
            return arrNull;
        }
    }

    //18 Написать метод, который принимает на вход длину массива и генерирует массив случайных положительных чисел
    // от 0 до 100 исключительно.
    public static int[] randomArrWithlength(int length) {
        int[] randomArr = new int[length];
        for (int i = 0; i < length; i++) {
            randomArr[i] = Math.abs((int) (Math.random() * 100));
        }

        return randomArr;
    }

    //19 // Написать метод, который принимает на вход длину массива l и количество знаков d (однозначные,
    //        // двузначные, трехзначные и тд числа), и генерирует массив случайных целых положительных чисел длины l,
    //        // в котором все числа имеют количество знаков d
    public static int[] randomArrWithlengthAndNumOfDigit(int length, int numOfDigit) {
        if (length <= 0 || numOfDigit <= 0) {
            return (new int[]{});
        }
        int[] randomArr = new int[length];
        for (int i = 0; i < length; i++) {

            while (randomArr[i] % Math.pow(10, numOfDigit) < Math.pow(10, numOfDigit - 1)) {
                randomArr[i] = Math.abs((int) (Math.random() * Math.pow(10, numOfDigit)));
            }
        }

        return randomArr;
    }

    // 20. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив
    // только двузначных чисел. Пhоверить работу метода на массиве из задания 18.
    public static int[] arrTwoDigitNum(int[] array) {
        int newArrLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 99) {
                newArrLength++;
            }
        }
        int[] twoDigitArr = new int[newArrLength];
        int newArrInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] <= 99) {
                twoDigitArr[newArrInd] = array[i];
                newArrInd++;
            }
        }
        return twoDigitArr;
    }

    //21. Написать метод, который принимает на вход массив целых положительных двузначных чисел, и возвращает
    // массив разниц между десятками и единицами
    public static int[] deltaBetweenTensAndOnes(int[] array) {

        System.out.println(Arrays.toString(array));

        int[] arrDelta = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 10) && (array[i] <= 99)) {
                arrDelta[i] = Math.abs((int) (array[i] / 10) - array[i] % 10);
            } else {
                System.out.println("Введен член массива <=0 - provide 'массив целых положительных двузначных чисел'");
                break;

            }
        }

        return arrDelta;
    }

    //22   Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
    // который содержит номер телефона, состоящий из этих чисел,  и название страны, которой номер принадлежит.
    ////        Например:
    ////        method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}

    public static String PhoneNumOfTheCountry(int[] array) {
        String[] arrCounryICode = {"", "USA", "Kenya", "Spain", "Poland", "Argentina", "Indonesia", "RF", "Japan", "India"};
        String country = "";
        if (array.length != 11) {
            return ("Введен некорректный номер, проверьте номер и убедитесь, что общее количество цифр в нём равно 11");
        } else {
            for (int i = 0; i < arrCounryICode.length; i++) {
                if (array[0] == i) {
                    country = arrCounryICode[i];
                }
            }
            if (country.equalsIgnoreCase("")) {
                country = "введен некорректный номер, - укажите действующий код страны";
            }
            return ("“+" + array[0] + "(" + array[1] + array[2] + array[3] + ")" + array[4] + array[5] + array[6] + "-"
                    + array[7] + array[8] + "-" + array[9] + array[10] + "“, " + country);
        }
    }

    //23. Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив
    // уникальных чисел.
    public static int[] arrUnicNumbers(int[] array) {
        if (array.length == 0) {
            System.out.println("Введен пустой массив.");
            return (new int[]{});
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= 0) {
                    System.out.println("Массив может принимает только целые положительные числа больше 0");
                    return (new int[]{});
                }
            }
            Arrays.sort(array);
            int numOfRepeat = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1]) {
                    numOfRepeat++;
                }
            }

            int namOfUnic = array.length - numOfRepeat;
            int[] newArr = new int[namOfUnic];
            newArr[0] = array[0];
            int newArrCounter = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1]) {
                    continue;
                } else {
                    newArr[newArrCounter] = array[i];
                    newArrCounter++;
                }
            }

            return newArr;
        }
    }

    //(24) Написать метод, который принимает на вход массив целых положительных чисел, и возвращает
    //     количество уникальных и неуникальных элементов в этом массиве
    public static String arrUnicAndUnunicNumbers(int[] array) {
        if (array.length == 0) {
            System.out.println("Введен пустой массив.");
            return "---";
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= 0) {
                    System.out.println("Массив может принимает только целые положительные числа больше 0");
                    return "---";
                }
            }
            Arrays.sort(array);
            int numOfRepeat = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1]) {
                    numOfRepeat++;
                }
            }
            int namOfUnic = array.length - numOfRepeat * 2;
            return ("количество уникальных элементов = " + namOfUnic + ", количество неуникальных элементов = "
                    + numOfRepeat);
        }
    }

    //25
    public static int[] arrCutBetweenParam(int[] array, int ind1, int ind2) {
        if (array.length == 0) {
            System.out.println("Введен пустой массив.");
            return new int[]{};
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= 0) {
                    System.out.println("Массив может принимает только целые положительные числа больше 0");
                    return new int[]{};
                }
            }
            int[] newArrCut = new int[ind2 - ind1 + 1];
            int newArrInd = 0;
            for (int i = ind1; i <= ind2; i++) {
                newArrCut[newArrInd] = array[i];
                newArrInd++;
            }
            return newArrCut;
        }
    }

    //26 Написать метод, который принимает на вход 2 массива int[] и возвращает объединенный массив
    //   уникальных неповторяющихся элементов
    public static int[] arrUnicNumbersFromTwoArrays(int[] array, int[] array2) {
        if ((array.length == 0)||(array2.length == 0)) {
            System.out.println("Введен пустой массив.");
            return (new int[]{});
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= 0) {
                    System.out.println("Массив может принимает только целые положительные числа больше 0");
                    return (new int[]{});
                }
            }
            for (int i = 0; i < array2.length; i++) {
                if (array2[i] <= 0) {
                    System.out.println("Массив может принимает только целые положительные числа больше 0");
                    return (new int[]{});
                }
            }
            int[] arrnew = new int[array.length + array2.length];
            for (int i = 0; i < (array.length); i++) {
            arrnew[i] = array[i];
            }
            for (int i = array.length; i < (array.length + array2.length); i++) {
                arrnew[i] = array2[i - array.length];
            }

            Arrays.sort(arrnew);

            int numOfRepeat = 0;
            for (int i = 1; i < arrnew.length; i++) {
                if (arrnew[i] == arrnew[i - 1]) {
                    numOfRepeat++;
                }
            }

            int namOfUnic = arrnew.length - numOfRepeat;
            int[] newArrUnic = new int[namOfUnic];
            newArrUnic[0] = arrnew[0];
            int newArrCounter = 1;
            for (int i = 1; i < arrnew.length; i++) {
                if (arrnew[i] == arrnew[i - 1]) {
                    continue;
                } else {
                    newArrUnic[newArrCounter] = arrnew[i];
                    newArrCounter++;
                }
            }

            return newArrUnic;
        }
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
        System.out.println(Arrays.toString(arrNum(5, 6, 7, 8, 9)));

        task(8); //Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
        System.out.println(Arrays.toString(arrNum(5.5, 6.4, 7.4, 8.8, 9.9)));

        task(9); // Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
        System.out.println(Arrays.toString(arrNum("one", "two", "three", "four", "five")));

        task(10); // Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел,
        // умноженных на 2.5
        arrDoubl(new int[]{4, 8, 56, 3, 4, 56});

        task(11); //Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает
        // количество четных чисел в этом массиве
        System.out.println(arrAmountOfEven(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println(arrAmountOfEven(new int[]{-1, 2, 3, 4, 5, 6}));
        System.out.println(arrAmountOfEven(new int[]{0, 2, 3, 4, 5, 6}));
        verifyEquals(3, arrAmountOfEven(new int[]{2, 3, 4, 5, 6}));

        task(12); //Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает
        // массив нечетных чисел
        System.out.println(arrAmountOfOdd(new int[]{1, 3, 7, 8}));

        task(13); //Написать метод, который принимает на вход массив целых чисел,  и возвращает массив значений true
        // или false, если числа больше 10
        arrayToPrint(ifNumbersMoreThenTenMeth(new int[]{12, 17, 10, -1}));

        task(14); //Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
        arrayToPrint(new String[]{"one", "two", "three"});

        task(15); //Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
        System.out.println(sumSecondHalfOfArray(new int[]{1, 2, 3, -2, -6}));

        task(16); //Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10
        // исключительно, и возвращает таблицу умножения на это число в виде массива
        //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
        arrayToPrint(tabMultip(9));

        task(17); //Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если
        // четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
        arrayToPrint(arrayOddOrEvenWichLarger(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 6}));

        task(18); //Написать метод, который принимает на вход длину массива и генерирует массив случайных
        // положительных чисел от 0 до 100 исключительно.
        arrayToPrint(randomArrWithlength(5));

        task(19); // Написать метод, который принимает на вход длину массива l и количество знаков d (однозначные,
        // двузначные, трехзначные и тд числа), и генерирует массив случайных целых положительных чисел длины l,
        // в котором все числа имеют количество знаков d
        arrayToPrint(randomArrWithlengthAndNumOfDigit(1, 1));
        arrayToPrint(randomArrWithlengthAndNumOfDigit(5, 3));
        arrayToPrint(randomArrWithlengthAndNumOfDigit(0, 0));
        arrayToPrint(randomArrWithlengthAndNumOfDigit(1, 0));
        arrayToPrint(randomArrWithlengthAndNumOfDigit(0, 1));
        arrayToPrint(randomArrWithlengthAndNumOfDigit(-1, -1));

        task(20);// Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив
        // только двузначных чисел. ПРоверить работу метода на массиве из задания 18.
        arrayToPrint(arrTwoDigitNum(new int[]{1, 99, 150, 1234}));
        arrayToPrint(arrTwoDigitNum(new int[]{0, 99, 150, 1, 1234}));
        arrayToPrint(arrTwoDigitNum(new int[]{-1, 99, 150, 1, 1234}));
        arrayToPrint(arrTwoDigitNum(randomArrWithlength(10)));

        task(21);//Написать метод, который принимает на вход массив целых положительных двузначных чисел, и
        // возвращает массив разниц между десятками и единицами
        arrayToPrint(deltaBetweenTensAndOnes(randomArrWithlengthAndNumOfDigit(5, 2)));
        arrayToPrint(deltaBetweenTensAndOnes(randomArrWithlengthAndNumOfDigit(0, 2)));
        arrayToPrint(deltaBetweenTensAndOnes(new int[]{50, -2, 45, 52, 87}));

        int[] numbers = new int[]{2, 5, 7, 4, 88, 7};
        Arrays.sort(numbers);
        arrayToPrint(numbers);

        task(22);
//        Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
//        который содержит номер телефона, состоящий из этих чисел,  и название страны, которой номер принадлежит.
//        Например:
//        method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
        System.out.println((PhoneNumOfTheCountry(new int[]{1, 9, 1, 4, 9, 3, 9, 9, 9, 3, 7})));

        task(23);//Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив
        // уникальных чисел.
        arrayToPrint(arrUnicNumbers(new int[]{1, 5, 5, 4, 7, 6, 6}));
        arrayToPrint(arrUnicNumbers(new int[]{1, 5, 0, 4, 7, 6, 6})); //проверка на ввод неположительного числа
        arrayToPrint(arrUnicNumbers(new int[]{})); //проверка на ввод пустого массива

        task(24);// Написать метод, который принимает на вход массив целых положительных чисел, и возвращает
        // количество уникальных и неуникальных элементов в этом массиве
        System.out.println(arrUnicAndUnunicNumbers(randomArrWithlengthAndNumOfDigit(10, 1)));
        System.out.println(arrUnicAndUnunicNumbers(new int[]{1, 5, 1, 4, 7, 6, 6, 9}));
        System.out.println(arrUnicAndUnunicNumbers(new int[]{1, 5, 1, 4, 0, 6, 6, 9}));
        System.out.println(arrUnicAndUnunicNumbers(new int[]{1, 5, 1, 4, 0, 6, 6, -1}));
        System.out.println(arrUnicAndUnunicNumbers(new int[]{}));

        task(25);//
//        Написать метод, который принимает на вход массив целых положительных чисел, и 2 целых положительных числа
//        (значения индексов). Метод возвращает массив, который содержит только числа из первого массива в промежутке между индексами.
//        Например:
//        method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
        arrayToPrint(arrCutBetweenParam(new int[]{1,2,3,5,5,6,7,9}, 2, 5));
        arrayToPrint(arrCutBetweenParam(new int[]{1,2,3,4,5,6,7,8,-9}, 3, 7));

        task(26); //Написать метод, который принимает на вход 2 массива int[] и возвращает объединенный массив
        // уникальных неповторяющихся элементов
        arrayToPrint(arrUnicNumbersFromTwoArrays(new int[]{1,2,2,3}, new int[]{3,4,5,5,1}));
        arrayToPrint(arrUnicNumbersFromTwoArrays(new int[]{1,2,2,-3}, new int[]{3,4,5,5,1}));
        arrayToPrint(arrUnicNumbersFromTwoArrays(new int[]{1,2,2,3}, new int[]{3,4,5,5,-1}));

    }
}
