package homeWork;

public class HW3 {
    static byte a, b;
    public static void main(String[] args) {

        task(2);
        a = 20;
        b = 100;
        System.out.println("a = "+ a + "\n" + "b = " + b);
        line();

        task(3);
        short s = 32767;
        int raznitsa = 60000;
        short t = (short)(s - raznitsa);
        System.out.println("t = " + t);
        System.out.println("s - t = " + raznitsa);
        System.out.println("s = " + s);
        line();

        task(4);
        line();
        int i = Integer.MIN_VALUE;
        System.out.println("|     int min     |    " + i + "      |");
        line();
        i = Integer.MAX_VALUE;
        System.out.println("|     int max     |    " + i + "      |");
        line();


        task(5);
        line();
        long tel = 89149399937L;
        System.out.println("tel: "+tel);
        line();

        task(6);
        line();
        float f = 100.101101F;
        double d = 100.101101;
        System.out.println("|     float f =     |    " + f + "                |");
        line();
        System.out.println("|     double d =    |    " + d + "                |");
        line();

        task(7);
        Double dd = 10.09999 + 20.099999;
        Float ff = 10.09999F + 20.099999F;
        System.out.println("|     float f =     |    " + f + "                |");
        line();
        System.out.println("|     double d =    |    " + d + "                |");
        line();
        System.out.println("|     double dd =   |    " + dd + "        |");
        line();
        System.out.println("|     double ff =   |    " + ff + "                  |");
        line();

        task(8);
        double rezult = 10 / (3 + 0.0);
        System.out.println("rezult 10 / 3 = " + rezult);
        line();

        task(9);
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;
        System.out.println("sum = " + sum + "\n" + "product = " + product +"\n" + "quotient = " + quotient +"\n" + "remainder = "
                + remainder);

        line();

        task(11);
        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = - 505.505F;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
        double  t8 = - 1000000.001;
        short t9 = 1010;
        System.out.println("t1 = " + t1 + "\n"
                        + "t2 = " + t2 + "\n"
                        + "t3 = " + t3 + "\n"
                        + "t4 = " + t4 + "\n"
                        + "t5 = " + t5 + "\n"
                        + "t6 = " + t6 + "\n"
                        + "t7 = " + t7 + "\n"
                        + "t8 = " + t8 + "\n"
                        + "t9 = " + t9 );
        line();

        task(12);
        line();
        System.out.println(Byte.TYPE + "\t" + "|" + Byte.SIZE + "\t" + "|" + Byte.MIN_VALUE + "\t\t\t\t\t"+ "|" + Byte.MAX_VALUE + "\t\t\t\t\t|");
        System.out.println(Short.TYPE + "\t" +"|" + Short.SIZE + "\t"+ "|" + Short.MIN_VALUE + "\t\t\t\t\t" + "|" + Short.MAX_VALUE + "\t\t\t\t\t|");
        System.out.println(Integer.TYPE + "\t\t" + "|" + Integer.SIZE + "\t" + "|" + Integer.MIN_VALUE + "\t\t\t" + "|" + Integer.MAX_VALUE + "\t\t\t\t|");
        System.out.println(Long.TYPE + "\t" + "|" + Long.SIZE + "\t" + "|" + Long.MIN_VALUE + "\t" + "|" + Long.MAX_VALUE + "\t|");
        System.out.println(Float.TYPE + "\t" + "|" + Float.SIZE + "\t" + "|" + Float.MIN_VALUE + "\t\t\t\t" + "|" + Float.MAX_VALUE + "\t\t\t|");
        System.out.println(Double.TYPE + "\t" + "|" + Double.SIZE + "\t" + "|" + Double.MIN_VALUE + "\t\t\t\t" + "|" + Double.MAX_VALUE + "\t|");
        line();

        task(13);
        Integer num1 = 5;
        Integer num2 = 5;
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));
        num2 = 7;
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));
        line();

        task(14);
        int number1 = 8;
        int number2 = 8;
        //a одинаковыми значениями
        Boolean l = number1 == number2;
        Boolean l2 = number1 > number2;
        Boolean l3 = number1 < number2;
        System.out.println("a) number1 = " + number1 + " number2 = " + number2);
        System.out.println("number1 == number2 - " + l);
        System.out.println("number1 > number2 - " + l2);
        System.out.println("number1 < number2 - " + l3);
        System.out.println(Integer.compare(number1,number2));
        //b number1 < number2
        number1 = 8;
        number2 = 9;
        l = number1 == number2;
        l2 = number1 > number2;
        l3 = number1 < number2;
        System.out.println("b) number1 = " + number1 + " number2 = " + number2);
        System.out.println("number1 == number2 - " + l);
        System.out.println("number1 > number2 - " + l2);
        System.out.println("number1 < number2 - " + l3);
        System.out.println(Integer.compare(number1,number2));
        //c number1 > number2
        number1 = 9;
        number2 = 8;
        l = number1 == number2;
        l2 = number1 > number2;
        l3 = number1 < number2;
        System.out.println("c) number1 = " + number1 + " number2 = " + number2);
        System.out.println("number1 == number2 - " + l);
        System.out.println("number1 > number2 - " + l2);
        System.out.println("number1 < number2 - " + l3);
        System.out.println(Integer.compare(number1,number2));
        line();

        task(15);
        Float F = 234.9999F;
        int f1 = F.intValue();
        System.out.println(f1);
        System.out.println(Math.round(F)); //Округляет с учетом значения после запятой

        line();

        task(16);
        double a = 100.5;
        double b = 0.5;
        double c = Double.sum(a,b);
        System.out.println(a + " + " + b + " = " + c);
        line();

        task(17);
        Float a1 = 100.7F;
        Float b1 = 0.8F;
        Integer c2 = Integer.sum(a1.intValue(), b1.intValue());
        System.out.println(a1 + " + " + b1 + " = " + c2);
        line();

        task(18);
        Short short1 = 12000;
        Short short2 = 12300;
        int c3 = short1.compareTo(short2);

        System.out.println("a) short1 - short2 = " + c3);
        System.out.println(Short.compare(short1,short2));
        short1 = 12500;
        c3 = short1.compareTo(short2);
        System.out.println("b) short1 - short2 = " + c3);
        System.out.println(Short.compare(short1,short2));
        line();

        task(19);
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Double resdoub = doub1 - doub2;
        System.out.println(resdoub);
        System.out.println(doub1.compareTo(doub2));
        System.out.println(Double.compare(doub1, doub2));
        //Deprecated.
        //It is rarely appropriate to use this constructor. Use parseDouble(String) to convert a string to a double
        // primitive, or use valueOf(String) to convert a string to a Double object.
        double z1 = Double.parseDouble(str1);
        double z2 = Double.parseDouble(str2);
        System.out.println(z1-z2);
        double d1 = Double.valueOf(str1) - Double.valueOf(str2);
        System.out.println(d1);
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

        line();


    }

    private static void line() {
        System.out.println("---------------------------------------------------");
    }

    private static void task(int n) {
        System.out.println("Task " + n);
    }
}
