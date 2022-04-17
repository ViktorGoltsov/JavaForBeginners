package lessons.lesson8;

import Utils.Utilss;

import static Utils.Utilss.*; //* - означает, Что мы импортируем все методы из класса


public class Lesson8 {

    private static String dog1_1 = "dog"; //видна только в классе
    public static String dog1_2 = "dog"; // видна во всех классах
    static String cat = "cat"; // по умолчанию модификатор ставится protected - он виден в пределах пекеджа
    protected static String cat2 = "cat"; // то же самое, только модифаер прописан




    public static void main(String[] args) {

       line();
       ln();



        int [] arr = new int[] {1,  2,  3};
        int [] arr1 = new int[3];
        int [] arr2 = {1, 2, 3};

        int [] arr4 = new int[0];
        int [] arr5 = {};

        int [] arr6 = new int[1];
        int [] arr7 = {0};

        int [] arr8 = new int[3];
        int [] arr9 = {0, 0, 0};

        int a = 4;
        double b = 5.5;

        Integer intReg = 4;
        Integer intReg1 = 4;
        Double doubReg = 5.5;

        Integer intObject = new Integer(4);
        Double doubObject = new Double(5.5);

        String str1 = "Hello";
        String str2 = "Hello";

        String strObject = new String("Hello");

        // Math math = new Math ();

        //вот в этой всей группе созжается только один объект в String Pool, а всем переменным присваевается ссылка на один и тот
        // же объект. Работает это для всеъ переменых static в пределах одного проекта
        String cat1 = "Cat";
        String cat2 = "Cat";
        String cat211111 = "Cat";
        String dog = "Cat";

        //а если создаем объект через new, то в String pool он не попадает, а сразу создается новый объект в Java Heap (памяти).
        String cat3 = new String("Cat");
        String cat4 = new String("Cat");

        System.out.println(str1 == str2);
        System.out.println(str1 == strObject);

        System.out.println("___________________________");
        System.out.println(intReg == intReg1);
        System.out.println(intReg == intObject);

        System.out.println(cat1 == cat211111);
        System.out.println(cat1 == dog);
        System.out.println(cat3 == cat4);

        System.out.println(cat1.equals(cat2));
        System.out.println(intReg1.equals(intReg));
        System.out.println(intReg1.equals(intObject));

        Utilss utl = new Utilss(); //не статик переменную можно вызвать в другом классе только от нового объекта класса
        utl.printA();

        verify(cat1, cat2); //метод запускается без указания класса, так как мы импортировали все методы класса вверху
        verify(intReg, intObject); //в метоже сравниваются через ==, а подаем Integer, но Джава понимает,
        // что так как мы подаем Интеджер, то сама сравнивает через Иквалс
        System.out.println(intReg ==intObject);
        System.out.println(intReg.equals(intObject));





    }
}
