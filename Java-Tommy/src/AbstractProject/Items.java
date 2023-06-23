package AbstractProject;

class Items extends Electronic {
    public Items(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Item: " + name);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
