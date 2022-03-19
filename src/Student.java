public class Student {
    public static void main (String[] args){
        String firstName="Вова";
        String lastName="Сидоров";
        int age=10;
        int level=5;
        String pol="m";
        String line="_________________________________________________";
        System.out.println(line);
        if (pol=="m"){
            System.out.println("Ученик "+level+" класса");
        } else {System.out.println("Ученица "+level+" класса");}
        System.out.println(firstName+" "+lastName);
        System.out.println(age+" лет");
        System.out.println(line);

        String firstName2="Маша";
        String lastName2="Семенова";
        int age2=14;
        int level2=9;
        String pol2="f";
        System.out.println(line);
        if (pol2=="m"){
        System.out.println("Ученик "+level2+" класса");
        } else {System.out.println("Ученица "+level2+" класса");}
        System.out.println(firstName2+" "+lastName2);
        System.out.println(age2 +" лет");
        System.out.println(line);

    }

}
