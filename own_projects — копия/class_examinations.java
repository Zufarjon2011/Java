package own_projects;

import java.util.Random;
import java.util.Scanner;

public class class_examinations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String admin = "admin123";
        int adminPass = 123123;

        System.out.print("Enter login: ");
        String login = input.nextLine();

        System.out.print("Enter passcode: ");
        int passcode = input.nextInt();

        int grade = random.nextInt(101); // 0–100
        System.out.println("Your score: " + grade);

        // Login check
        if (login.equals(admin) && passcode == adminPass) {
            System.out.println("Hello administrator");
        } else {
            System.out.println("Hello " + login + ", welcome to the system");
        }

        // Grade check
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 75) {
            System.out.println("Grade: B");
        } else if (grade >= 60) {
            System.out.println("Grade: C");
        } else if (grade >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }

        input.close();
    }
}
