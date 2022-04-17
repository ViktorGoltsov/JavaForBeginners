package lessons.lessons1to7;

public class Lesson4 {

    private static void line() {
        System.out.println("---------------------------------------------------");
    }

    private static void task(int n) {
        System.out.println("Task " + n);
    }

    public static void main(String[] args) {




        task(100);
        double n = 3.0;
        double m = 3.0;
        double expectedResult = 1;

        //a)
        if ((n % 2 != 0) && (n % 3 == 0)) {
            n = (n * 1.0 / 3);
        } else if (n % 2 == 0) {
            n = (n * (n * 1.0 / 2));
        } else {
            n = (n * 3);
        }
        System.out.println(n);

        //test
        if (expectedResult == n) {
            System.out.println("\u001B[32m" + "pass");
        } else {
            System.out.println("\u001B[31m" + "fail ");
        }

        //b)
        if (m % 2 != 0) {
            if (m % 3 == 0) {
                m = m / 3;
            } else {
                m = m * 3;
            }
        } else {
            m = m * (m / 2);
        }
        System.out.println(m);
        if (expectedResult == m) {
            System.out.println("\u001B[32m" + "pass");
        } else {
            System.out.println("\u001B[31m" + "fail ");
            line ();
        }
    }
}

