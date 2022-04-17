package Utils;

public class Utilss {
    // в этот класс складываем только переменные или методы
    public static void line () {
        System.out.println("______________________");
    }

    public static void ln () {
        System.out.println("____________________  __");
    }

    public static void task (int number) {
        line();
        System.out.println(number);
        ln();
    }

    public static String verify(double a, double b) {
        if (a==b) {
            System.out.println("Pass");

            return "Pass";
        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }

    public static String verify(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Pass");

            return "Pass";
        } else {
            System.out.println("Fail");

            return "Fail";
        }
    }

    public void printA () {
        System.out.println("A");
    }

}
