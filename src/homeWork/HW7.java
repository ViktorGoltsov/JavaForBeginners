package homeWork;

import static Utils.Utilss.task;

public class HW7 {

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
        String[] catColors = {"red", "orange", "yellow", "green","blue", "grey", "purple"};
        for (int i = 0; i < catColors.length; i++) {
            System.out.println(catColors[i]);
        }

        //4 Создать массив catsAges и заполнить его любыми значениями.
        task();
        String[] catAges = {"1", "2", "3", "4", "5", "6", "7"};
        for (int i = 0; i < catAges.length; i++) {
            System.out.println(catAges[i]);
        }

        //5 Создать массив isCatRed и заполнить его соответствующими значениями
        task();
        Boolean[] isCatRed = {true, false, false, false, false, false, false};
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
                System.out.println(catColors[i] + ", i= " + i);
            }
        }

    }
}
