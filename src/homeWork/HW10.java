package homeWork;


public class HW10 {
    //1
    public static void spaceToDelete(String str) {
        if (str.isEmpty()) {
            System.out.println("Строка пустая");
        } else if (str.equals(str.trim())) {
            System.out.println("Пробелов не было");
        } else {
            str.trim();
            System.out.println("Лишние пробелы удалены");
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


    }
}
