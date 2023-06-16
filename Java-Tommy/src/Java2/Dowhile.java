package Java2;

public class Dowhile {
    public static void main(String[] args)
    {
        //test 1
        int i = 33;
        do{
            System.out.print(i + " ");
            i = i + 3;
        }while (i <= 99);
        /// test 2
        do {
            System.out.println("hello infinity!");
        }while(false);
    }
}
