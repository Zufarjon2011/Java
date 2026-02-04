package user_input_SCANNER;

import java.util.Scanner;


//after opening Scanner, always close it!


public class mad_libs_game {
    public static void main(String[] args){
        //MAD LIBS GAME
        Scanner input = new Scanner(System.in);

        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("Enter an adjective(description): ");
        adj1 = input.nextLine();
        System.out.print("Enter a noun(person or animal): ");
        noun1 = input.nextLine();
        System.out.print("Enter an adjective(description): ");
        adj2 = input.nextLine();
        System.out.print("Enter a continuous  verb(movement): ");
        verb1 = input.nextLine();
        System.out.print("Enter an adjective(description): ");
        adj3 = input.nextLine();
        System.out.println();

        System.out.println("Today i went to a " + adj1 + " magic city in Uzbekistan");
        System.out.println("There, i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and "+ verb1);
        System.out.println("I was really " + adj3);

        input.close();
    }
}
