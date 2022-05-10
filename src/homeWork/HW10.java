package homeWork;


import java.util.Arrays;
import java.util.Locale;

public class HW10 {
    //1
    public static void spaceToDelete(String str) {
        if (str.isEmpty()) {
            System.out.println("Строка пустая");
        } else if (str.equals(str.trim())) {
            System.out.println("Пробелов не было");
        } else {
            str = str.trim();
            System.out.println("Лишние пробелы удалены:\n" + str);
        }
    }

    //2
    public static String RemoveAlla(String str) {
        if (str.isEmpty()) {
            return "String is empty";
        } else {
            str = str.replace("a", "");
            str = str.trim();
            return str;
        }
    }

    //3
    public static String removeAllZeros(String str) {
        if (str.isEmpty()) {
            return "String is empty";
        } else {
            str = str.replace(" ", "");
            str = str.replace("0", "");
            return str;
        }
    }

    //4
    public static String removeAllSpaces(String str) {
        if (str.isEmpty()) {
            return "String is empty";
        } else {
            str = str.replace(" ", "");

            return str;
        }
    }

    //5 метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
    public static int countLetterA (String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    //6 Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java
    public static boolean isTextContainsWordJava (String str) {

        str = str.toLowerCase();

        if (str.contains("java")) {

            return true;
        } else {

            return false;
        }
    }

    //7 Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки, точку и кавычки в конце
    // строки с помощью метода concat()

    public static String concatQuates (String str) {
        str = str.trim();
        String begining = "\"";
        String ending = "\".";
        str = str.concat(ending);
        str = begining.concat(str);
        return str;
    }

    //8 Напишите метод, кторый принимает на вход название города и исправляет написание:
    public static String reNameCity (String str) {
        //str = str.toLowerCase(Locale.ROOT);
        //str = str.replace(str.charAt(0), str.toUpperCase().charAt(0));
        str = str.toUpperCase().charAt(0) + str.toLowerCase().substring(1, str.length());
        return str;
}

    //9 Напишите метод, который принимает на вход строку, и возвращает все, что находится между первой и последней
    // буквой-параметром:

    public static String returnSubString(String str, char a) {
        str = str.toLowerCase();
        str = str.substring(str.indexOf(a), str.lastIndexOf(a)+1);

        return str;
    }

    //10 Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается
    // на одинаковую букву, и faulse иначе

    public static boolean theSameLatterStartsAndEnds (String str) {
        str = str.toLowerCase();
        if (str.charAt(0) == str.charAt(str.length()-1)) {
            return true;
        } else {
            return false;
        }
    }

    //11 Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
    public static String[] splitStringToArrOfStrings (String str) {
        String [] arrayOfSplit = str.split(" ");

        return arrayOfSplit;
    }

    //12 Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии, отчества и возвращает массив строк:
    public static String[] splitFullNameToArrOfStrings (String str) {
        String [] arrayOfSplit = str.split(" ");
        arrayOfSplit[0] =  "Имя: " + arrayOfSplit[0];
        arrayOfSplit[1] = "Отчество: " + arrayOfSplit[1];
        arrayOfSplit[2] = "Фамилия: " + arrayOfSplit[2];

        return arrayOfSplit;
    }

    //13 Написать метод, который возвращает сумму всех букв слова

    public static int sumOfCharsInWord (String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90)
                    || ((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122)) {
                sum += str.charAt(i);
            } else {
                break;
                }
            }
        return sum;
        }

        //14 Написать метод,  который принимает на вход 2 буквы и возвращает true, если первая буква встречается
    // раньше второй, иначе метод возвращает false
        public static boolean ifFirstLetterEarlierThenSecond (char letter1, char letter2) {
        if (letter1 < letter2) {
            return true;
        } else {
            return false;
        }
}

    public static void main(String[] args) {

        //1
        spaceToDelete("    QA4Everyone   ");
        spaceToDelete("QA4Everyone");
        spaceToDelete("");

        //2
        System.out.println(RemoveAlla("    QA4Everyone   "));
        System.out.println(RemoveAlla("panda   "));

        //3
        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));

        //4
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));

        //5
        System.out.println(countLetterA("Abracadabra"));
        System.out.println(countLetterA("Homenum Revelio"));

        //6
        System.out.println(isTextContainsWordJava("As of March 2022, Java 18 is the latest version, while " +
                "Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last " +
                "zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, " +
                "although it will otherwise still support Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving " +
                "security and other upgrades."));

        System.out.println(isTextContainsWordJava("As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me."));

        //7
        System.out.println(concatQuates("One"));
        System.out.println(concatQuates("    TWO  "));

        //8
        System.out.println(reNameCity("ташкент"));
        System.out.println(reNameCity("ЧикаГО"));

        //9
        System.out.println(returnSubString("Abracadabra", 'b'));
        System.out.println(returnSubString("Whippersnapper", 'p'));

        //10
        System.out.println(theSameLatterStartsAndEnds("Abracadabra"));
        System.out.println(theSameLatterStartsAndEnds("Whippersnapper"));

        //11
        System.out.println(Arrays.toString(splitStringToArrOfStrings("QA for Everyone")));
        System.out.println(Arrays.toString(splitStringToArrOfStrings("Александр Сергеевич Пушкин")));

        //12
        System.out.println(Arrays.toString(splitFullNameToArrOfStrings("Александр Сергеевич Пушкин")));

        //13
        System.out.println(sumOfCharsInWord("abc"));
        System.out.println(sumOfCharsInWord("ABC"));
        System.out.println(sumOfCharsInWord("123"));

        //14
        System.out.println(ifFirstLetterEarlierThenSecond('a', 'b'));
        System.out.println(ifFirstLetterEarlierThenSecond('B', 'A'));
    }
}
