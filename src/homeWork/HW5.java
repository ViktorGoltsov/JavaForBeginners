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
    public static void verifyEquals (String expectedResult, String actualResult) {
        if (expectedResult.equalsIgnoreCase(actualResult)) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public static void verifyEquals (int expectedResult, int actualResult) {
        if (expectedResult ==actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

    public static void verifyEquals (double expectedResult, double actualResult) {
        if (expectedResult ==actualResult) {
            System.out.println("\u001B[32m" + "pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "fail " + "\u001B[0m");
        }
    }

      //1.2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.

    public static String dayOfWeek (int dayNum) {
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
    public static int largestValue (int x, int y, int z) {
        int largest;

        if (x > y) {
            largest = x;
        } else {
            largest = y;
        } if (z > largest) {
            largest = z;
        }

        return largest;
    }

    //1.4.
    public static int smallestValue (int a, int b, int c) {
        int smallest;

        if (b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        if (a < smallest) {
            smallest = a;
        }
        return smallest;

    }

    //1.5. Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
    public static String tempOfCat (double t1, double t2, double t3, double t4, double t5) {
        double avg1 = (t1 + t2 + t3 + t4 + t5) / 5;
        String avg = String.format("%.2f",avg1);
        return avg;
    }

    public static void main(String[] args) {

        //1.2.
        task();
        System.out.println(dayOfWeek(5));
        verifyEquals("thursday", dayOfWeek(4));


        //1.3.
        task();
        int x = 5;
        int y = 7;
        int z = 12;
        System.out.println(largestValue(x, y, z));
        verifyEquals(12, largestValue(x,y,z));

        // 1.4.
        task();
        System.out.println(smallestValue(x,y,z));
        verifyEquals(5, smallestValue(x, y,z));

        //1.5.
        task();
        double t1 = 36.5;
        double t2 = 36.5;
        double t3 = 36.7;
        double t4 = 38.0;
        double t5 = 38.5;
        System.out.println(tempOfCat(t1, t2, t3, t4, t5));
        verifyEquals("37.24", String.valueOf(tempOfCat(t1, t2, t3, t4, t5)));



    }

}
