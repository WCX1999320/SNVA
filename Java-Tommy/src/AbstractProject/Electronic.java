package AbstractProject;

abstract class Electronic {
    protected String name;
    protected double price;

    public Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();
    public abstract double getPrice();
}