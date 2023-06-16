package Java2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /// test1
        System.out.println("Enter Month 1.January 2.Febuary ...");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 1 -> season = "winter";
            case 2 -> season = "winter";
            case 3 -> season = "spring";
            case 4 -> season = "spring";
            case 5 -> season = "spring";
            case 6 -> season = "summer";
            case 7 -> season = "summer";
            case 8 -> season = "summer";
            case 9 -> season = "autumn";
            case 10 -> season = "autumn";
            case 11 -> season = "autumn";
            case 12 -> season = "winter";
            default -> season = "unkonwn month";
        }
        System.out.println("Month " + month + " fall in " + season);
        /// test2
        while(true)
        {
            System.out.println("please input a letter:");
            scanner = new Scanner(System.in);
            String letter = scanner.next();
            if((letter.length() == 1)&&(Character.isLetter(letter.charAt(0))))
            {
                switch (letter)
                {
                    case "a":
                        System.out.println(letter + " is vowel");
                        break;
                    case "e":
                        System.out.println(letter + " is vowel");
                        break;
                    case "i":
                        System.out.println(letter + " is vowel");
                        break;
                    case "o":
                        System.out.println(letter + " is vowel");
                        break;
                    case "u":
                        System.out.println(letter + " is vowel");
                        break;
                    case "A":
                        System.out.println(letter + " is vowel");
                        break;
                    case "E":
                        System.out.println(letter + " is vowel");
                        break;
                    case "I":
                        System.out.println(letter + " is vowel");
                        break;
                    case "O":
                        System.out.println(letter + " is vowel");
                        break;
                    case "U":
                        System.out.println(letter + " is vowel");
                        break;
                    default:
                        System.out.println(letter + " is consonant");
                }
            }
            else
            {
                if(letter.equals("-1"))
                {
                    break;
                }
                System.out.println("please just input one character");
            }
        }
        /// test3 ---> nested switch
        scanner = new Scanner(System.in);

        System.out.println("Choose a topic:");

        System.out.println("1. JavaScript");

        System.out.println("2. Java");

        System.out.println("3. Relational Databases");

        int topic = scanner.nextInt();

        switch (topic) {
            case 1:
                System.out.println("JavaScript selected. Choose a subtopic:");
                System.out.println("1. JavaScript variables");
                System.out.println("2. Escape characters");
                System.out.println("3. Promises");
                int jsSubtopic = scanner.nextInt();
                switch (jsSubtopic) {
                    case 1:// For JavaScript variables
                        System.out.println("JavaScript variables");
                        break;
                    case 2:// For escape characters in JavaScript
                        System.out.println("Escape characters");
                        break;

                    case 3:// For JavaScript promises
                        System.out.println("Promises");
                        break;

                    default:// Invalid
                        System.out.println("Invalid subtopic choice for JavaScript");
                        break;
                }
                break;
            case 2:
                System.out.println("Java selected. Choose a subtopic:");
                System.out.println("1. Java Core");
                System.out.println("2. Object-Oriented Programming");
                System.out.println("3. Threads");
                int javaSubtopic = scanner.nextInt();

                switch (javaSubtopic) {

                    case 1: // For Java core concepts
                        System.out.println("Java Core");
                        break;
                    case 2:// For Java OOP concepts
                        System.out.println("Object-Oriented Programming");
                        break;
                    case 3:// For Java threads
                        System.out.println("Threads");
                        break;
                    default:// invalid
                        System.out.println("Invalid subtopic choice for Java");
                        break;
                }
                break;
            case 3:
                System.out.println("Relational Databases selected. Choose a subtopic:");
                System.out.println("1. SQL");
                System.out.println("2. MySQL");
                int rdbmsSubtopic = scanner.nextInt();
                switch (rdbmsSubtopic) {
                    case 1:// For SQL
                        System.out.println("SQL");
                        break;
                    case 2:// For MySQL
                        System.out.println("MySQL");
                        break;
                    default:// invalid
                        System.out.println("Invalid subtopic choice for Relational Databases");
                        break;
                }
                break;
            default:
                System.out.println("Invalid topic choice");
                break;
        }
    }
}
