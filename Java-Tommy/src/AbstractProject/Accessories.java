package AbstractProject;

class Accessories extends Electronic {
    public Accessories(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Accessory: " + name);
    }

    @Override
    public double getPrice() {
        return price;
    }
}