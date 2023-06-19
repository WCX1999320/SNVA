package Java5;

public class Override1 {
    int i,j;
    int sum(int i, int j)
    {
        return i + j;
    }

    int operation(int i, int j)
    {
        return i*j;
    }
}

class OverrideSub extends Override1
{
    int sum(int i, int j)
    {
        return i;
    }

    int operation(int i, int j)
    {
        return i-j;
    }
}