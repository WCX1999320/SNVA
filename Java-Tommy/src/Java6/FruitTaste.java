package Java6;

public class FruitTaste {
    public static void main(String[] args) {
        Mango mango = new Mango();
        Apple apple = new Apple();

        System.out.println("Tasting a mango:");
        mango.color();
        mango.averageWeight();

        System.out.println("Tasting an apple:");
        apple.color();
        apple.averageWeight();
    }
}
