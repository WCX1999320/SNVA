package Java3;

import java.util.Scanner;

public class Classtest1 {
    public static class MyClass{
        public int a;
        public int b;
        public int c;
        public MyClass(){

        }
        public MyClass(int a,int b,int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyClass abc = new MyClass();
        System.out.println("Enter a");
        abc.a = scanner.nextInt();
        System.out.println("Enter b");
        abc.b = scanner.nextInt();
        System.out.println("Enter c");
        abc.c = scanner.nextInt();
        System.out.printf("Value of solved equation is: %d\n",3* abc.a+5*abc.b-2* abc.c );
    }
}
