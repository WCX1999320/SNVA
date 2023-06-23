package AbstractProject;

class Hp extends Laptop {
    public Hp(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("HP: " + name);
    }
}
