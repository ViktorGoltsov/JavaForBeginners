package lessons.lessons1to7;

public class Lesson5 {

    //все маленькие методы принято лписать в начале!
    public static int returnMinOfThree(int a, int b, int c) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min > c) {
            min = c;
            return min;
        }
            return min;
    }

    public static double returnAvg(int a, int b, int c) {

        return ((double)a + b + c) / 3;
    }

    public static double returnAbs (double number1) {
        if (number1 < 0) {
            number1 = (-1) * number1;
        }
        return number1;
    }

    public static double countDifferenceBetweenMinAndAvg (int a, int b, int c) {

    int min = returnMinOfThree(a,b,c);
    double average = returnAvg(a,b,c);
    return returnAbs(min - average);
    // или вот так: return returnAbs (returnMinOfThree(a,b,c) - returnAvg(a,b,c));
    }

    public static String displayMessage (int a, int b, int c) {
        String message;

        if (countDifferenceBetweenMinAndAvg(a,b,c) > 3.51) {
            message = "Большой разброс чисел";
        } else {
            message = "Маленький разброс чисел";
        }
        System.out.println(message);
        return message;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 5;

        System.out.println(returnMinOfThree(a,b,c));
        System.out.println(returnAvg(a,b,c));
        displayMessage(a,b,c);
    }

}
//Задача с  5-го урока
//// Даны 3 числа.
//// Необходимо найти максимально точную разницу
//// между минимальным числом и средним значением.
//// Если разница больше 3.51,
//// показать пользователю сообщение "Большой разброс чисел",
//// иначе показать сообщение "Маленький разброс чисел"
//
//int a = 5;
//int b = 2;
//int c = 10;

