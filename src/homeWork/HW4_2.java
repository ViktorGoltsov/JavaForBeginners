package homeWork;

public class HW4_2 {

    public static int i = 14;

    public static void task() {
        System.out.println("_____________________________________________________");
        System.out.println("                      Task " + i);
        System.out.println("-----------------------------------------------------");
        i++;
    }

    public static void line () {
        System.out.println("________________________________________");
    }

    public static void div1 (int i, int j, String name1, String name2) {
        System.out.println("Результат деления " + name1 + " на " + name2 + " = " + i / j + ", а остаток от деления  = " + i % j );
    }

    public static String forApplePo (Integer apple) {
        String endApple;
        if (apple == 11) {
            endApple = "яблок";
        } else if ((" " + apple).endsWith("1")) {
            endApple = "яблоку";
        } else if (apple > 11 && apple < 15) {
            endApple = "яблок";
        } else if (apple % 10 > 1 && apple % 10 < 5) {
            endApple = "яблока";
        } else {
            endApple = "яблок";
        }
        return endApple;
    }

    public static String forApple (Integer apple) {
        String endApple;
        if (apple == 11) {
            endApple = "яблок";
        } else if ((" " + apple).endsWith("1")) {
            endApple = "яблоко";
        } else if (apple > 11 && apple < 15) {
            endApple = "яблок";
        } else if (apple % 10 > 1 && apple % 10 < 5) {
            endApple = "яблока";
        } else {
            endApple = "яблок";
        }
        return endApple;
    }

    public static String forStudent(Integer student) {
        String endStudent;
        if (student == 11) {
            endStudent = "студентов";
        } else if ((" " + student).endsWith("1")) {
            endStudent = "студента";
        } else if (student > 11 && student < 15) {
            endStudent = "студентов";
        } else if ((student > 1) && (student < 5)) {
            endStudent = "студентов";
        } else if ((student % 10 > 1) && (student % 10 < 5)) {
            endStudent = "студента";
        } else endStudent = "студентов";
        return endStudent;
    }

    public static void app (Integer apple, Integer  student) {
        String endApple;
        String endStudent;

        System.out.println("Если " + apple + " " + forApple(apple) + " поделить на " + student + " "
                + forStudent(student) + ", то каждый ученик получит по " + apple/student + " " + forApplePo(apple/student)
                + ", и " + apple % student + " " + forApple(apple % student) + " останется учителю.");
    }

    public static void celsToFaring(float tC) {
        System.out.println(tC + " градусов по Цельсию  = " + ((tC * 9/5) + 32) + " градусов по Фаренгейту");
    }

    public static void table (int i) {

        line();
        System.out.println("|     int.MIN    |     " + Integer.MIN_VALUE + "     |");
        line();
        System.out.println("|     int.MAX    |     " + Integer.MAX_VALUE + "      |");
        line();
        System.out.println("|     i ^ 2      |           " + i * i + "       |");
        line();
    }

    public static void main(String[] args) {

        task();
        int k = 30;
        int l = 20;
        int m = 15;
        div1(k,l, "k", "l");
        div1(k,m, "k","m");
        div1(k,k, "k", "k");
        div1(l,m, "l","m");
        div1(l,k, "l","k");
        div1(l,l, "l","l");
        div1(m,l, "m","l");
        div1(m,k,"m","k");
        div1(m,m, "m","m");

    //15
    task();
    //а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
    //Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
    //Распечатать это же выражение со значениями 100 и 21.

    int apple = 40;
    int student = 6;
    app(apple, student);

    apple = 100;
    student = 21;
    app(apple, student);

    //16
    task();
    apple = 42;
    student = 42;
    app(apple, student);

    apple = 55;
    student = 5;
    app(apple, student);

    apple = 1;
    student = 2;
    app(apple, student);

    //17
    task();
    celsToFaring( 36.5F);

    //18
    task();
    table(15);
    table(20);

    //21
    task();
    short s = 12345;
    if (s < 0) {
        s = (short) ((-1) * s);
    }
    Integer n = 0;
    do {
        s = (short)( s / 10);
        n++;
    } while (s >= 1);
        if (n == 1 ) {
            System.out.println(s + " - It's a One-digits number");
        } if (n == 2) {
            System.out.println(s + " - It's a Two-digits number");
        } if (n == 3) {
            System.out.println(s + " - It's a Three-digits number");
        } if (n == 4) {
            System.out.println(s + " - It's a Four-digits number");
        } if (n == 5) {
            System.out.println(s + " - It's a Five-digits number");
        }

    }
}
