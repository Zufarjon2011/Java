package own_projects;

import java.util.Scanner;
import java.util.Random;

public class project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String name;
        int realAge;
        int guessedAge;

        System.out.println("Hello, I can guess your age!");
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.println("Hello " + name + ", I am just a program that predicts age!");

        System.out.print("Enter your real age: ");
        realAge = input.nextInt();

        // Random guess between age-3 and age+3
        guessedAge = realAge - 3 + rand.nextInt(7);

        System.out.println("Hmm... I guess your age is: " + guessedAge);

        if (guessedAge == realAge) {
            System.out.println("Wow! I guessed it exactly 😎");
        } else {
            System.out.println("Oops! Your real age is " + realAge);
        }

        input.close();
    }
}

//package own_projects;
//
//import java.util.Scanner;
//import java.util.Random;
//
//public class project2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Random rand = new Random();
//
//        String name;
//        int realAge;
//        int guessedAge;
//
//        System.out.println("Hello, I can guess your age!");
//        System.out.print("Enter your name: ");
//        name = input.nextLine();
//
//        System.out.println("Hello " + name + ", I am just a program that predicts age!");
//
//        System.out.print("Enter your real age: ");
//        realAge = input.nextInt();
//
//        // Random guess between age-3 and age+3
//        guessedAge = realAge - 3 + rand.nextInt(7);
//
//        System.out.println("Hmm... I guess your age is: " + guessedAge);
//
//        if (guessedAge == realAge) {
//            System.out.println("Wow! I guessed it exactly 😎");
//        } else {
//            System.out.println("Oops! Your real age is " + realAge);
//        }
//
//        input.close();
//    }
//}