package AbstractProject;

class Mac extends Laptop {
    public Mac(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Mac: " + name);
    }
}
