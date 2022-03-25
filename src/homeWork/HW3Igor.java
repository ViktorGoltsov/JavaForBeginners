//Методо
//
package homeWork;

    public class HW3Igor {

    public static void m1() {
    System.out.println("Buy");
    }
    public static void m2(String line) {
    System.out.println(line);
    m1();
    }

    public static void m2(String line, int a) {
    System.out.println(line + a);
    m1();
    }

    public static void m2(int a, String line) {
    System.out.println(line + a);
    m1();
    }

    public static void m2(char c) {
    System.out.println(c);
    m1();
    }

    public static int i = 1;
    public static void task() {
    System.out.println("Task " + i);
    i++;
    }

    public static void line () {
    System.out.println("_____________________________________________________");
    }

    public static void main(String[] args) {
        line();
        task();
        m2("lalalain", 5);
        line();
        task();
        m2(5, "fggfhfgh");
        line();
        task();
        m2("fdkjgdhlgfkj");
        line();
        task();
        m2('5');
        line();



    }
}
