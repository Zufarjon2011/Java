package lesson7_if;
import java.util.Scanner;


public class if_statement_lesson7 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String name;
        System.out.print("Enter Your name: ");
        name = input.nextLine();

        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();

        boolean isStudent;
        System.out.print("Are you a student?(true/false): ");
        isStudent = input.nextBoolean();
        //Group 3
        if (isStudent){
            System.out.println("I got this, You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
        //Group 2
        if (name.isEmpty()){
            System.out.println("You did not enter your name! ");
        }
        else{
            System.out.println("Hello " + name + "!");
        }


        //Group 1(in Java is else statement goes from up to down!)
        if (age >= 65){
            System.out.println("You are a senior! ");
        }
        else if ( age >= 1){
            System.out.println("You are an adult! ");
        }
        else if (age == 0){
            System.out.println("You are a baby! ");
        }
        else if (age < 0) {
            System.out.println("You haven't born yet! ");
        }
        else{
            System.out.println("Bruh");

            //Overall, if statements are same as In python
        }
    }
}


