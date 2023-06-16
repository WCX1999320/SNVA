package Java2;

import java.util.*;

public class Recipe {
    static final double NUTS_PRICE = 250;
    static final double CARAMEL_PRICE = 200;
    static final double BUTTER_PRICE = 350;
    static final double BLUEBERRY_PRICE = 275;
    static final double CHOCOLATE_PRICE = 120;
    String a;
    static int numberOfNuts;
    static int numberCaramel;
    static int numberOfButter;
    static int numberOfBlueberry;
    static int numberOfChocolater;
    static double NutsTotal = NUTS_PRICE * numberOfNuts;
    public static void main(String[] args) {
        System.out.println("Menu Item         price  qty  payable");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        System.out.println("Nuts Overloaded    250    2      500");
        System.out.println("Caramel            250    2      200");
        System.out.println("Butter             250    2      700");
        System.out.println("Blueberry          250    2      550");
        System.out.println("Chocolate          250    2      450");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        System.out.println(
                "-------------------------------------------------------------------------------------------------");
        System.out.println("Total                            2450");

    }
}
