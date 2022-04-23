package HW8;

import static HW8.HW8_1.*;
import static Utils.Utilss.*;

public class HW8 {


    public static void main(String[] args) {
        task(5);
        Integer newIntObj = 5;
        Double newDoubObj = 5.6;
        String newStringObj = "String";
        System.out.println(newIntObj);
        System.out.println(newDoubObj);
        System.out.println(newStringObj);

        task(6);
        boolean areEqualsInt = intObj.equals(newIntObj);
        boolean areEqualsDoub = doubObj.equals(newDoubObj);
        boolean areEqualsStr = strObj.equals(newStringObj);
        line();
        System.out.println("|       HW8     |       HW8_1       |       areEquals?      |");
        line();
        System.out.println("| intObj = " + intObj + "    |   newIntObj = " + newIntObj + "   |    " + areEqualsInt + "               |");
        line();
        System.out.println("| doubObj = " + doubObj + " |   newIntObj = " + newDoubObj + " |    " + areEqualsDoub + "               |");
        line();
        System.out.println("| str= " + strObj + "   |   newStr = " + newStringObj + " |    " + areEqualsStr + "               |");
        line();


    }
}
