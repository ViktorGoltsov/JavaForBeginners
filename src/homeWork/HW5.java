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

    // 1.6. Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
    public static String numToString (double decimalNumber) {
    int beforeDot = (int)decimalNumber;
    int afterDot = (int)((decimalNumber * 100) % 100);
        return ("" + beforeDot + " руб." + afterDot + " коп.");
    }

    // 1.7. Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
    public static String numToStringKgGr (double decimalNumber) {
        int beforeDot = (int)decimalNumber;
        int afterDot = (int)((decimalNumber * 1000) % 1000);
        return ("" + beforeDot + " кг. " + afterDot + " гр.");
    }

    // 1.8 Написать метод, который принимает на вход 2 параметра -  цену и количество товара (может быть вес товара,
    // или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
    public static double sumPurchase(double price, double mass) {

        return price * mass;
    }

    //1.9. Написать метод, который принимает на вход необходимые параметры, и печатает чек.
    public static void check (String product, double price, double massa) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|   Product   |     Price         |      amount      |       Total       |");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|   " + product + "     |   " + numToString(price) + "  |   " + numToStringKgGr(massa) + "  |   " + numToString(price * massa) + " |");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void check (String product, double price, int amount) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|   Product   |     Price         |      amount      |       Total       |");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|   " + product + "     |   " + numToString(price) + "  |     " + amount + " items      |   " + numToString(price * amount) + " |");
        System.out.println("--------------------------------------------------------------------------");
    }

    //1.10. Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
    // и возвращает заработную плату в месяц.
    public static String salary(int hoursPerDay, int hourlyRate) {

        return ("Salary - " + hoursPerDay * hourlyRate * 22 + " $ per month");
    }

    //1.11. Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
    public static String vedomost (String surname, String name, String middleName, double salary) {

        return (surname + " " + name + " " +  middleName + "        " + numToString(salary));
    }

    //1.12.
    public static String xIsWhat (int x) {
        if (x < 0) {
            return "x is negactive";
        } else if (x > 0) {
            return "x is positive";
        } else {
            return "x is zero";
        }
    }

    //2.13. Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое
    // число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
    public static int happyNum(int yearOfBirth) {
        int happyN;
        int firstNum = (yearOfBirth - yearOfBirth % 1000) / 1000;
        int secondNum = (yearOfBirth % 1000 - yearOfBirth % 100) / 100;
        int thirdNum = (yearOfBirth % 100 - yearOfBirth % 10) / 10;
        int fourthNum = yearOfBirth % 10;

//        альтернативный способ перевести многозначное число в строку, а затем каждый симмол в int
//        String str = String.valueOf(yearOfBirth);
//        int fi = Character.getNumericValue(str.charAt(0));
//        int se = Character.getNumericValue(str.charAt(1));
//        int thi = Character.getNumericValue(str.charAt(2));
//        int fo = Character.getNumericValue(str.charAt(3));

        int sum = firstNum + secondNum + thirdNum + fourthNum;
        if ((sum) > 9) {
            sum = sum / 10 + sum % 10;
            if (sum > 9) {
                sum = sum / 10 + sum % 10;
                if (sum > 9) {
                    sum = sum / 10 + sum % 10;
                } else {
                    happyN = sum;
                }
            } else {
                happyN = sum;
            }
        } else {
            happyN = sum;
        }
        return sum;
    }

//   2.14 а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
//    Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
//    Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
////
    public static String medAndAvg(int a, int b, int c) {
        int med = 0;
        if ((a >= b && a <= c)||(a >= c && a <= b)) {
            med = a;
        } if ((c >= b && c <= a)||(c >= a && c <= b)) {
            med = c;
        } if ((b >= a && b <= c)||(b >= c && b <= a)) {
            med = b;
        }

        int avg = (a + b + c) / 3;
        int delta;
        if (avg > med) {
            delta = avg - med;
        } else {
            delta = med - avg;
        }

        int max = Math.max(Math.max(a,b), c);  //b расчет медианы через методы класса Math
        int min = Math.min(Math.min(a,b), c);
        int med2 = a + b + c -max - min;

        if (delta > 2) {
            return ("Cреднее значение " + avg + " отличается от медианы " + med + "(" + med2 + ") на " + delta);
        } else {
            return ("Среднее значение = " + avg + ", медиана = " + med + "(" + med2 + ")");
        }

        //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
    }

    //1.15. Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
    public static String roundToCustomer(double sum) {
       double newSum = Math.floor(sum);
       return (numToString(newSum));
    }

    public static double sixteen (int a, int b, int c) {
        double rez = Math.sqrt((a * b + c) * Math.pow(a, b))/Math.PI;
        return Math.round(rez);
    }

    //1.17.1
    public static int seventeen(int x, int y) {
        if (y > 0) {
        x = 1;
    }
       return x;

    }
    //1.17.2
    public static double score (double score) {

        if ((score > 80)&& (score < 90)) {
        score += 5;
        }
        return score;
    }

    //1.17.3
    //rewrite !((i<10)||(v>=50)) without !
    //применяем закон Моргана: отрицание коньюнкции - есть дизьюнкция отрицаний, отрицание дизьюнкции есть коньюнкция отрицаний
    //!((i<10)||(v>=50)) = !(i<10)&&!(v>=50) = (i>=10) && (v<50)
    public static String morgan (int i, int v) {
        if ((i>=10) && (v<50)) {
            return "(i>=10) && (v<50) = true";
        } else {
            return "(i>=10) && (v<50) = false";
        }
    }

    //1.17.4
    public static String oddNum (int x) {
        if ((x % 2 != 0) && (x >= 0)) {
            return "true";
        } else {
            return "false";
        }
    }

    //1.17.5
    public static String positivNum (int x, int y) {
        if ((y >= 0) && (x >= 0)) {
            return "true";
        } else {
            return "false";
        }
    }

    //1.17.6
    public static String sameSignNum (int x, int y) {
        if ((x * y) > 0) {
            return "true";
        } else {
            return "false";
        }
    }

//    1.18 Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного числа.
//    Метод возвращает математически округленное целое значение и выводит на экран:
//            “Число … в степени … = …”
//
//    Число может быть в пределах от 0 до 1 исключительно.
//    Степень числа может быть от 0 до 10 включительно

    public static void powOfRandom () {

        long pow = Math.round(Math.random()*10);
        double num = Math.random();
        double powOfRan = Math.pow(num,pow);
        int raundPowOfRan = (int)(powOfRan);
        System.out.println("Число " + num +  " в степени " + pow + " = " + raundPowOfRan);

    }

    //1/19 Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
    public static int random1100 () {
        double rand0 = Math.random();
        int rand = (int)(rand0*100);
        if (rand == 0) {
            rand = 1;
        }
        return rand;
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

        //1.6. Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
        task();
        double decimalNumber = 10.75;
        System.out.println(numToString(decimalNumber));
        verifyEquals("10 руб.75 коп.", numToString(decimalNumber));

        // 1.7. Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”
        task();
        double decimalNumber2 = 10.075;
        System.out.println(numToStringKgGr(decimalNumber2));
        verifyEquals("10 кг. 75 гр.", numToStringKgGr(decimalNumber2));
        verifyEquals("0 кг. 0 гр.", numToStringKgGr(0));
        verifyEquals("99 кг. 999 гр.", numToStringKgGr(99.999));

        // 1.8 Написать метод, который принимает на вход 2 параметра -  цену и количество товара (может быть вес товара,
        // или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
        task();
        System.out.println(sumPurchase(10.5, 1.5));
        verifyEquals(15.75, sumPurchase(10.5, 1.5));
        verifyEquals(0, sumPurchase(0, 0));
        verifyEquals(0.25, sumPurchase(0.5, 0.5));

        //1.9. Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        //Например: Яблоки
        //Цена за 1 кг			50 руб 13 коп
        //Количество товара	         3 кг 400 гр
        //_______________________________________
        //Сумма к оплате		170 руб 44 коп
        //
        //или
        //
        //Хлеб
        //Цена за 1 шт		30 руб 50 коп
        //Количество товара	5 шт
        //_______________________________________
        //Сумма к оплате		152 руб 50 коп
        task();
        check("Apple", 50.13, 3.4);
        check("Bread", 30.50, 5);

        //1.10.
        task();
        System.out.println(salary(8, 35));

        //1.11 Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.

        task();
        System.out.println("Vedomost  March 2022");
        System.out.println(vedomost("Smirnova", "Maria", "Ivanovna", 70000.00));
        System.out.println(vedomost("Serebriakov", "Ivan", "Petrovich", 128059.00));

        //1.12 Записать в виде метода:
        task();
        System.out.println(xIsWhat(5));
        System.out.println(xIsWhat(-5));
        System.out.println(xIsWhat(0));

        //1.13. Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое
        // число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
        task();
        System.out.println(happyNum(9876));
        System.out.println(happyNum(1000));
        System.out.println(happyNum(2022));
        verifyEquals(6, happyNum(2022));
        verifyEquals(1, happyNum(1000));
        verifyEquals(3, happyNum(9876));
        verifyEquals(7, happyNum(1987));

        //1.14
        task();
        System.out.println(medAndAvg(1,3,30));
        verifyEquals("Cреднее значение 11 отличается от медианы 3(3) на 8", medAndAvg(1,3,30));
        System.out.println(medAndAvg(1,1,1));
        verifyEquals("Среднее значение = 1, медиана = 1(1)", medAndAvg(1,1,1));

        //1.15
        task();
        System.out.println(roundToCustomer(999.75));
        verifyEquals("999 руб.0 коп.", roundToCustomer(999.75));

        //1.16
        task();
        int a = 3;
        int b = 4;
        int c = 20;
        System.out.println(sixteen(a,b,c));

        //1.17.1
        task();
        System.out.println(seventeen(-5,2));
        System.out.println(seventeen(-5,1));
        System.out.println(seventeen(0,0));
        System.out.println(seventeen(10,-1));

        verifyEquals(1, seventeen(-5,2));
        verifyEquals(1, seventeen(-5,1));
        verifyEquals(0, seventeen(0,0));
        verifyEquals(10, seventeen(10,-1));
        System.out.println();

        //1.17.2

        System.out.println(score(81));
        System.out.println(score(89));
        System.out.println(score(80));
        System.out.println(score(90));
        System.out.println(score(100));
        System.out.println(score(75));

        verifyEquals(86, score(81));
        verifyEquals(94, score(89));
        verifyEquals(80, score(80));
        verifyEquals(90, score(90));
        verifyEquals(100, score(100));
        verifyEquals(75, score(75));
        System.out.println();
        //1.17.3

        System.out.println(morgan(10,49));
        System.out.println(morgan(9,50));
        System.out.println(morgan(10,50));
        System.out.println(morgan(9,49));
        verifyEquals("(i>=10) && (v<50) = true", morgan(10,49));
        verifyEquals("(i>=10) && (v<50) = false", morgan(9,50));
        verifyEquals("(i>=10) && (v<50) = false", morgan(10,50));
        verifyEquals("(i>=10) && (v<50) = false", morgan(9,49));
        System.out.println();
        //1.17.4

        System.out.println(oddNum(5));
        verifyEquals("true", oddNum(5));
        verifyEquals("false", oddNum(6));
        System.out.println();
        //1.17.5

        System.out.println(positivNum(5, 15));
        verifyEquals("true", positivNum(1,1));
        verifyEquals("false", positivNum(-1,1));
        verifyEquals("false", positivNum(1,-1));
        System.out.println();
        //1.17.6

        System.out.println(sameSignNum(-5, -3));
        System.out.println(sameSignNum(5, 3));
        System.out.println(sameSignNum(-5, 3));
        System.out.println(sameSignNum(5, -3));
        verifyEquals("true", sameSignNum(-5,-3));
        verifyEquals("true", sameSignNum(5,3));
        verifyEquals("false", sameSignNum(-5,3));
        verifyEquals("false", sameSignNum(5,-3));

        //1.18
        task();
        powOfRandom();

        //1.19
        task();
        System.out.println(random1100());

        //1.20
        task();

    }


}
