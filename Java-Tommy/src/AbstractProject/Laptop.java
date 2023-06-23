package AbstractProject;

public class Laptop extends Electronic{
    public Laptop(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Laptop: " + name);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
