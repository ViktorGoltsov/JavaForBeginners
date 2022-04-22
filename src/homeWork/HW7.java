package homeWork;

import java.util.Arrays;

import static Utils.Utilss.task;
import static Utils.Utilss.verifyEquals;

public class HW7 {

    //18. Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу
    // метода тестом, если параметр - массив catsAges
    public static double avgOfArr (int[] catAges) {
        double avg = 0;
        for (int i = 0; i< catAges.length; i++) {
       avg = avg + (catAges[i]*1.0/catAges.length);
        }
        return avg;
    }

    //21 Создать метод, который принимает на вход массив int,  и возвращает минимальное значение, максимальное значение
    // и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.
    public static String arrParam (int[]arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } if (arr[i] > max) {
                max = arr[i];
            }
            avg = avg + (arr[i]*1.0)/arr.length;
        }
        return ("min = " + min + ", max = " + max + ", avg = " + Math.round(avg));

    }

    public static void main(String[] args) {
        //1 Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
        task();
        String [] catsNames = {"Persik", "Marfa", "Marsik", "Maison", "Leopold", "Tamagochi", "Makhaon"};
    for (int i = 0; i < catsNames.length; i++) {
        System.out.println(catsNames[i]);
    }

    //2 В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
        // а значение элемента с индексом 1 на “Черныш”.
        task();
        catsNames[4] = "Rizhik";
        catsNames[1] = "Chernysh";
        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }

        //3 Создать массив catsColors и заполнить его значениями.
        task();
        String[] catColors = {"red", "orange", "grey", "green","rijiy", "grey", "purple"};
        for (int i = 0; i < catColors.length; i++) {
            System.out.println(catColors[i]);
        }

        //4 Создать массив catsAges и заполнить его любыми значениями.
        task();
        int[] catAges = {1, 2, 3, 4, 5, 1, 7};
        for (int i = 0; i < catAges.length; i++) {
            System.out.println(catAges[i]);
        }

        //5 Создать массив isCatRed и заполнить его соответствующими значениями
        task();
        Boolean[] isCatRed = {true, false, false, false, true, false, false};
        for (int i = 0; i < isCatRed.length; i++) {
            System.out.println(isCatRed[i]);
        }

        //6 Распечатать для массивов catsNames и catsColors:
        //имя кота в коробке с номером 6
        //имена котов из коробок с четными индексами
        //имена котов из коробок, чьи индексы кратны 4
        //цвет котов из коробок с нечетными индексами
        //цвет котов из коробок, чьи индексы кратны 3

        task();
            System.out.println(catsNames[6]);
        System.out.println();

        for (int i = 1; i < catsNames.length; i++) {
            if (i % 2 ==0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println();

        for (int i = 1; i < catsNames.length; i++) {
            if (i % 4 ==0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println();

        for (int i = 1; i < catColors.length; i++) {
            if (i % 2 != 0) {
                System.out.println(catColors[i]);
            }
        }
        System.out.println();

        for (int i = 1; i < catColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(catColors[i]);
            }
        }

        //7 Распечатать “Накорми кота!” для всех серых котов
        task();
        for (int i = 1; i < catColors.length; i++) {
            if (catColors[i].equalsIgnoreCase("grey" )) {
                System.out.println("Nakormi kota! - " + i);
            }
        }

        //8 Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        task();
        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] < 2) {
                System.out.println("Отнеси кота на прививку! - " + i + " кот");
            }
        }

        // 9 Для кота в последней коробке распечатать имя, цвет, возраст
        task();
        System.out.println(catsNames[catsNames.length - 1] + " - " + catColors[catColors.length - 1] + " - "
                + catAges[catAges.length - 1] + " years");

        //10.Распечатать имена всех котов, чей возраст больше 2 лет
        task();
        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] > 2) {
                System.out.println(catsNames[i] + " - " + catAges[i] + " years" );
            }
        }

        // 11. Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        task();
        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equalsIgnoreCase("Rizhik") && (isCatRed[i] == true)) {
                System.out.println(catsNames[i] + " - " + isCatRed[i] + " " + i + " - Накорми кота!" );
            }
        }

        //12. Распечатать средний возраст котов из массива catsAges
        task();
        double avgAge = 0.00;
        for (int i = 0; i < catAges.length; i++) {

            avgAge = avgAge + (catAges[i]*1.0/catAges.length);
        }
        System.out.println("avgAge - " + Math.round(avgAge));

        //13. Распечатать возраст самого молодого кота
        task();
        int minAge = Integer.MAX_VALUE;
        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] < minAge) {
                minAge = catAges[i];
            }
        }
        System.out.println("age of the youngest cat is - " + minAge);

        //14 Распечатать возраст самого старого кота
        task();
        int maxAge = Integer.MIN_VALUE;
        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] > maxAge) {
                maxAge = catAges[i];
            }
        }
        System.out.println("age of the oldest cat is - " + maxAge);

        //15 Распечатать количество серых котов
        task();
        int amountOfGrayCats = 0;
        for (int i = 0; i < catColors.length; i++) {
            if (catColors[i].equalsIgnoreCase("grey")) {
                amountOfGrayCats = amountOfGrayCats + 1;
            }
        }
        System.out.println("amountOfGrayCats - " + amountOfGrayCats);

        //16. Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        task();
        for (int i = 0; i < catsNames.length; i++) {
            if ((i % 2 == 0) && (catAges[i] <= 3)) {
                System.out.println(catsNames[i]);
            }
        }

        //17 Создать массив четных положительных чисел, значения которых не больше 10.
        // (заполняем значения с помощью цикла for)
        task();
        int arrLenght = 5;  //длина массива
        int n = 0; // счетчик элементов массива
        int j; //элемент массива
        int[] arr = new int[arrLenght];
        for (int i = 0 ; n < arrLenght; i++) {
            j = (int)(Math.random()*10);
            if (j % 2 == 0) {
                arr [n] = j;
                n = n + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //18. Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу
        // метода тестом, если параметр - массив catsAges
        task();
        System.out.println("avgAgeOfCats = " + Math.round(avgOfArr(catAges)));
        verifyEquals(3, Math.round(avgOfArr(catAges)));
        verifyEquals(6, Math.round(avgOfArr(new int[]{5, 5, 8})));
        verifyEquals(5, Math.round(avgOfArr(new int[]{2, 4, 6, 8})));

        //19 массив нечетных отрицательных чисел от -1000 до - 900
        task();
        int arrbegin = -1000;
        int arrend = -900;
        int amount = 0;
        for (int k = arrbegin; k <= arrend; k++) {
            if (k % 2 != 0) {
                amount = amount + 1;
            }
        }
        int[] arr2 = new int[amount];
        int t = 0;
        for (int i = arrbegin; i <= arrend; i++) {
            if (i % 2 != 0) {
                arr2[t] = i;
                t++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //20. Массив из 10 случайных положительных целых чисел
        task();
        int d;
        int[] arr4 = new int[10];
        for (int i = 0 ; i < arr4.length;) {
                d= (int)(Math.random()*Short.MAX_VALUE);
                if (d != 0) {
                    arr4 [i] = d;
                    i++;
                }
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        //21 Создать метод, который принимает на вход массив int,  и возвращает минимальное значение, максимальное
        // значение и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.
        task();
        System.out.println(arrParam(arr4));


        //22 Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20
        task();
        int jj = 0;
        int kk = 0;

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 2 == 0) {
               jj++;
            } else {
               kk++;
            }
        }

        int[] arrOdd = new int[kk];
        int[] arrEven = new int[jj];
        jj = 0;
        kk = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 2 == 0) {
                arrEven[jj] = arr4[i];
                jj++;
            } else {
                arrOdd[kk] = arr4[i];
                kk++;
            }
        }

        for (int i = 0; i < arrOdd.length; i++) {
            System.out.println(arrOdd[i]);
        }
        System.out.println();
        for (int i = 0; i < arrEven.length; i++) {
            System.out.println(arrEven[i]);
        }

        //23 Создать двумерный массив, который состоит из имен, возрастов и цветов котов
        task();
        String[][] arr2dCats = new String[catAges.length][3];
        for (int i = 0; i < catAges.length; i++) {
            for (int m = 0; m < arr2dCats[i].length; m++) {
                if (m == 0) {
                    arr2dCats[i][0] = catsNames[i];
                } if (m == 1) {
                    arr2dCats[i][1] = String.valueOf(catAges[i]);
                } if (m == 2) {
                    arr2dCats[i][2] = catColors[i];
                }
            }
        }
        for (int i = 0; i < arr2dCats.length; i++) {
            if (i % 2 == 0) {
                //System.out.println(Arrays.deepToString(arr2dCats[i])); - распечатывает весь многомерный массив
                System.out.println(Arrays.toString(arr2dCats[i]));  // - распечатывает в строку одномерный массив
            }
        }

        //24 Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        task();
        int [][] arr24 = new int [4][8];
        for (int i = 0; i < arr24.length; i++) {
            for (int jjj = 0; jjj < arr24[i].length; jjj++) {
                arr24[i][jjj] = (int)Math.ceil(Math.random()*10);
            }
        }

        for (int i = 0; i < arr24.length; i++) {
            System.out.println(Arrays.toString(arr24[i]));
        }

        //25 Вывести сумму всех четных чисел массива из задания 24.
        task();
        int sum = 0;
        for (int i = 0; i < arr24.length; i++) {
            for (j = 0; j < arr24[i].length; j++) {
                if (arr24[i][j] % 2 == 0) {
                    sum += arr24[i][j];
                }
            }
        }
        System.out.println(sum);





    }
}
