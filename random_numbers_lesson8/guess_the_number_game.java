package random_numbers_lesson8;

import java.util.Scanner;
import java.util.Random;

public class guess_the_number_game {
    public static void main(String[] args) {

        //Create objects
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Create variables
        int secretNumber = random.nextInt(1, 11);
        int userInput;

        //Greeting + start
        System.out.println("Hello! Welcome to GUESS THE NUMBER 🎮");
        System.out.println("Guess a number between 1 and 10.");

        //Loop logic
        while (true) {
            //looping input
            System.out.print("Enter your guess: ");
            userInput = input.nextInt();

            if (userInput == secretNumber) {
                System.out.println("You found it right ⭐! Congrats!!! 😀");
                break; // stop the game
            } else {
                System.out.println("Wrong guess 😓! Try again.");
            }
        }

        input.close();
    }
}
