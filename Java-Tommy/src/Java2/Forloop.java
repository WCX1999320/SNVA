package Java2;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        /// test 1
        for(int i = 1; i<=10; i++)
        {
            System.out.println("Java is Easy to Learn!");
        }
        //// test2
        for(;;) {
            System.out.println("Java is Easy to Learn!");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(("No").equals(input))
            {
                break;
            }
            else if(("Yes").equals(input))
            {
                continue;
            }
            else
            {
                continue;
            }
        }
        /// test3
        for(int i = 0; i<=10; i++)
        {
            for(int j=1; j <=(10-i); j++)
            {
                System.out.print("$ ");
            }
            System.out.println("");
        }
    }
}
