package homeWork;

public class HW2 {

    public static void main(String[] args) {

        //11
        int k = 5;
        int l = 10;
        int m = 15;
        //12
        System.out.println(k+"\n"+l+"\n"+m);
        //13
        System.out.println(k+" "+l+" "+m);
        //14
        System.out.println(k+", "+l+", "+m);
        //15
        System.out.println("int k = " + k);
        System.out.println("int l = " + l);
        System.out.println("int m = " + m);
        //16
        System.out.println("sum of k and l = " + (k + l));
        System.out.println("k * l = " + (k * l));
        System.out.println("l - m = " + (l - m));
        //17
        System.out.println("k / l = " + (k / l) + ", остаток от деления " + (k % l));
        System.out.println("k / m = " + (k / m) + ", остаток от деления " + (k % m));
        System.out.println("l / m = " + (l / m) + ", остаток от деления " + (l % m));
        System.out.println("m / k = " + (m / k) + ", остаток от деления " + (m % k));
        //18
        int apple = 40;
        int student = 6;
        String text = ("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + (apple / student) + " яблок(а) и " + (apple % student) + " яблок(а) останется учителю.");
        System.out.println(text);

        apple = 100;
        student = 21;
        text = ("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + (apple / student) + " яблок(а) и " + (apple % student) + " яблок(а) останется учителю.");
        System.out.println(text);

        //19
        int sumKLM = k + l + m;
        int f = sumKLM;
        sumKLM--;
        m++;
        int sum = (k + l + m) + sumKLM;
        int sub = m - f;
        System.out.println("*************");
        System.out.println("sumKLM = " + sumKLM);
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + sum + " , а разность m++ и  sumLKM = " + sub);

        System.out.println("\nДля проверки: \nm = " + m);
        System.out.println("f = " + f);
        System.out.println("sumKLM = " + sumKLM);

        //20
        int t = 48;
        int t2 = 8;
        int t3 = 47;
        int t4 = 49;

        System.out.println(t % t2);
        System.out.println(t % 2);
        System.out.println(t2 % 2);
        System.out.println(t3 % 2);
        System.out.println(t4 % 2);

        //21
        int x = 2;
        int st = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        double w = Math.pow(x+3, st);
        System.out.println(w);

        //22
        double ch1 = (3 + 4 * x + 0.0)/5;
        double ch2 = 10 * (y - 5 + 0.0) * (a + b + c) / x;
        double ch3 = 9 * ((4 + 0.0) / x + (9 + x + 0.0) / y);
        double itog = ch1 - ch2 + ch3;
        System.out.println(itog);

        //23
        double itog2 = ((5 * x + 7 * y + 0.0)/(8 * x + 10 * y))/((3 * x - y + 0.0)/(x + y))
                /(a + b + (c + 0.0) / d + (a + b + 0.0)/(c + d) + a * b);
                System.out.println(itog2);

        String line = "--------------------------------------";
        System.out.println(line);
        System.out.println("|  Task  |    result                 |");
        System.out.println(line);
        System.out.println("|  21    |    " + w + "                   |");
        System.out.println(line);
        System.out.println("|  22    |    " + itog + "                  |");
        System.out.println(line);
        System.out.println("|  23    |    " + itog2 + "   |");
        System.out.println(line);


        Short as = 12000;
        Short bs = 12300;
        int z = Short.compare(as, bs);
        System.out.println(z);

    }
}
