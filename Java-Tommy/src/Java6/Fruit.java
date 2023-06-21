package Java6;

public class Fruit {
    private String color;
    private double averageWeight;

    public Fruit(String color, double averageWeight) {
        this.color = color;
        this.averageWeight = averageWeight;
    }

    public void color() {
        System.out.println("The fruit color is: " + color);
    }

    public void averageWeight() {
        System.out.println("The average weight of the fruit is: " + averageWeight + " grams");
    }
}
