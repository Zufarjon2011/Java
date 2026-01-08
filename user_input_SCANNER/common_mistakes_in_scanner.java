import java.util.Scanner;

public class common_mistakes_in_scanner {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println(age);
        System.out.print(color);
    }
}
