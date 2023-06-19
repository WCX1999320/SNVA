package Java5;

public class Overload1 {
    int num1 = 10, num2=20, sum;
    void sum()
    {
        sum = num1 + num2;
        System.out.println("sum:" + sum);
    }
    void sum(int j)
    {
        sum = num1 + num2 + j;
        System.out.println("sum:" + sum);
    }
}

class OverloadSub extends Overload1
{
    int sum(int i, int j)
    {
        return i + j;
    }

    int sum(int i, int j, int k)
    {
        return i + j + k;
    }

}
