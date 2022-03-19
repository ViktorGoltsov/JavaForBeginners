package lessons;

public class Lesson2 {

    public static void main(String[] args) {

        int a = +5;
        int b = 13;
        int c = 113;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int d = -5;
        String Line= "_________________________";
        int multAB = a * b;
        int devBA = b / a;
        int devAB = a / b;

        //Арифметическое сложение
        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);

        //КОнкатинация
        System.out.println("a + b = " + (a + b));
        System.out.println("a + b = " + sumAB);
        System.out.println(a+b);
        System.out.println(sumAB);
        System.out.println(sumABC);

        //то, что до строки - арифметическое  вырожение, что после строки - конкатенация
        System.out.println(Line);
        System.out.println(a + b + " "+ a + b);
        System.out.println(Line);
        System.out.println("Он сказал: \"Поехали\" и махнул орехами");
        System.out.println("Сегодня \nсуббота");
        System.out.println("Сегодня \t\tсуббота\t");

        System.out.println("" + a +" "+ b+" " + c);
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
        System.out.print("Сегодня ");
        System.out.println("Суббота");

        //Арифметическое вычитание
        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(a - d);
        System.out.println(a + d);

        //Умножение
        System.out.println(a * b);
        System.out.println(multAB);
        System.out.println(5 * 13);

        //Деление
        System.out.println(b / a);
        System.out.println(devBA);

        //Остаточное деление
        System.out.println(a % b);
        System.out.println(b % a);

        //Покажите, что 25 кратно пяти
        System.out.println(25 % 5);
        System.out.println(100 % 2);
        System.out.println(100 % 3);

        //Унарные операторы ++ и -- а++; это то же самое, что а + 1
        //так не сработает System.out.println(a++);
        a++;
        System.out.println(a);
        System.out.println(a + 1);
        a--;
        System.out.println(a);

        b--;
        System.out.println(b);
        System.out.println(b-1);
    }
}
