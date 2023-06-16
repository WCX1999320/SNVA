package Java3;

public class TestFunction {
    public static class Task
    {
        public int a;
        public int b;
        public int c;
        public int pro;
        Task()
        {
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }
        int function1()
        {
            return a+b+c;
        }
        void function2()
        {
            this.pro = a * b * c;
        }
    }
    public static void main(String[] args)
    {

        Task task = new Task();
        System.out.println("the sum is: " + task.a + "+" + task.b + "+" + task.c + "=" + task.function1());
        task.function2();
        System.out.println("the product is: " + task.a + "*" + task.b + "*" + task.c + "=" + task.pro);
    }
}
