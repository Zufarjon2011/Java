import java.util.Scanner;
public class user_input {
    public static void main(String [] args){


        /*So we got our hands on "INPUT" from python
        * first, we need to import java.util.scanner
        * Secondly we need to create scanner object(Scanner obj_name = new Scanner(System.in);)
        * Then we need to close that objet(obj_name.close();)
        * to have an ability to write in console, do (obj_name.nextLine();) if you want no spaces, next();
        * nextLine is an name object, you can name it! name = obj_name.nextLine();*/


        Scanner scanner = new Scanner(System.in);

        //working with String method
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //working with number method
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //working with boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        scanner.close();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

        if(isStudent){
            System.out.println("You are enrolled as a student!");
        }
        else{
            System.out.println("you are nopt a studet now get out or i calling a police!");
        }


    }
}
