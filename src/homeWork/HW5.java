package homeWork;

public class HW5 {

    public static int i = 2;

    public static void task() {
        System.out.println("_____________________________________________________");
        System.out.println("                      Task " + i);
        System.out.println("-----------------------------------------------------");
        i++;
    }

    //ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать метод с названием verifyEquals(expectedResult, actualResult)
    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equalsIgnoreCase(actualResult)) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    //1.2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.

    public static String dayOfWeek(int dayNum) {
        String day = "";

        if (dayNum == 1) {
            day = "monday";
        }
        if (dayNum == 2) {
            day = "tuesday";
        }
        if (dayNum == 3) {
            day = "wednesday";
        }
        if (dayNum == 4) {
            day = "Thursday";
        }
        if (dayNum == 5) {
            day = "Friday";
        }
        if (dayNum == 6) {
            day = "Saturday";
        }
        if (dayNum == 2) {
            day = "Sunday";
        }

        return day;
    }

    //1.3.
    public static int largestValue(int x, int y, int z) {
        int largest;

        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (z > largest) {
            largest = z;
        }

        return largest;
    }

    //1.4.
    public static int smallestValue(int a, int b, int c) {
        int smallest;
//        if (a < b) {
//            if (c < a) {
//                smallest = c;
//            } else {
//                smallest = a;
//            }
//            return smallest;
//        } else if (c < b) {
//            smallest = c;
//        } else {
//            smallest = b;
//        }
//        return smallest;

        if (a < b) {
            smallest = a;
        } else {
            smallest = b;
        } if (c < smallest) {
            smallest = c;
        }
        return smallest;


    }

    //1.5. Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
    public static String tempOfCat(double t1, double t2, double t3, double t4, double t5) {
        String avg = "";
        double tmin = 34.0;
        double tmax = 39.0;
        if ((t1 <= tmax && t2 <= tmax && t3 <= tmax && t4 <= tmax && t5 <= tmax)
                && (t1 >= tmin && t2 >= tmin && t3 >= tmin && t4 >= tmin && t5>= tmin)) {
        double avg1 = (t1 + t2 + t3 + t4 + t5) / 5;
        avg = String.format("%.2f", avg1);
        } else {
        avg = "Температура за пределами диапазона";
        }
        return avg;
    }

    public static void main(String[] args) {

        //1.2.
        task();
        System.out.println(dayOfWeek(5));
        verifyEquals("thursday", dayOfWeek(4));


        //1.3.
        task();
        int x = 15;
        int y = 10;
        int z = 1;
        System.out.println(largestValue(x, y, z));
        verifyEquals(15, largestValue(x, y, z));

        // 1.4.
        task();
        System.out.println(smallestValue(x, y, z));
        verifyEquals(1, smallestValue(x, y, z));

        //1.5.
        task();
        double t1 = 36.5;
        double t2 = 36.5;
        double t3 = 36.7;
        double t4 = 38.0;
        double t5 = 38.5;
        System.out.println(tempOfCat(t1, t2, t3, t4, t5));
        verifyEquals("37.24", String.valueOf(tempOfCat(t1, t2, t3, t4, t5)));
        verifyEquals("Температура за пределами диапазона", String.valueOf(tempOfCat(50, t2, t3, t4, t5)));

    }


}
