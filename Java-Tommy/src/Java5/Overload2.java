package Java5;

public class Overload2 {
    public static void main(String[] args) {
        Overload1 overload = new Overload1();
        OverloadSub overloadSub = new OverloadSub();
        overload.sum();
        System.out.println(overloadSub.sum(100,200));

        System.out.println("=======================");
        overloadSub.sum();
        overloadSub.sum(5);
        System.out.println(overloadSub.sum(5,10,7));
    }
}
