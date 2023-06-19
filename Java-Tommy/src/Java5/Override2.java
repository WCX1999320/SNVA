package Java5;

public class Override2 {
    public static void main(String[] args) {
        Override1 override = new Override1();
        override.i = 10;
        override.j = 20;
        System.out.println(override.sum(override.i, override.j));
        OverrideSub overrideSub = new OverrideSub();
        System.out.println(overrideSub.sum(10,20));

        System.out.println("=====================");
        System.out.println(override.operation(30,20));
        System.out.println(overrideSub.operation(30,20));
    }
}
