package lessons.lesson10;

import java.util.Arrays;

import static Utils.Utilss.line;

public class Lesson10 {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String cp = " ";
        System.out.println(str1 + cp + str2 + cp + str3); //here are separate strings
        String str4 = str1 + cp + str2 + cp + str3; // here - new string with separate item of memory

        System.out.println(str4);

        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));

        for (int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i));
        }

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');
        System.out.println(a==aa);
        System.out.println(aa==aaa);
        System.out.println(aa.equals(aaa));

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                System.out.println(i); //печатаем индекс
                System.out.println(str4.charAt(i));//печатаем букву
            } else {
                System.out.println("not a");
            }
        }

        line();
        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) >= 'i') {

                System.out.println(str4.charAt(i));//печатаем букву
            } else {
                System.out.println(" < i");
            }
        }
        line();
        System.out.println(Character.toString('i' - 1)); //to print letter
        System.out.println('i' - 1 ); //to print numeric value
        System.out.println(Character.toString( 'i' + 1));
        System.out.println('i' + 1 ); //to print numeric value


        line();
        String [] arrStr = new String[str4.length()];
        for (int i = 0; i < str4.length(); i++) {
            arrStr[i] = Character.toString(str4.charAt(i));
        }
        System.out.println(Arrays.toString(arrStr));
        line();
        System.out.println(str4.toCharArray());
        System.out.println(Arrays.toString(str4.toCharArray()));
        line();
        char [] arrayChar = str4.toCharArray();
        System.out.println(arrStr[0].equals (arrayChar[0]));
        System.out.println(arrStr[0].compareTo(Character.toString(arrayChar[0]))); //верный метод для сравнения символов
        // в массивах char  и String //0 - означает,что они равны. -1 - <  +1 - >
        if (arrStr[0].compareTo(Character.toString(arrayChar[0])) == 0) {

        }

    }
}
