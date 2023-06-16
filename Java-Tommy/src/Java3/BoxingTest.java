package Java3;

public class BoxingTest {
    public static void main(String[] args) {
        /// test1
        long long1 = 21334314;
        double db1 = 2134122.4535;
        Long longWrap = long1;
        Double doubleWrap = db1;
        System.out.println(longWrap+" "+doubleWrap);
        long long2 = longWrap;
        double db2 = doubleWrap;
        System.out.println(long2+" "+db2);
    }
}
