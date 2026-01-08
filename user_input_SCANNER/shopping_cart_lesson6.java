import java.util.Scanner;

public class shopping_cart {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String item;
        int quantity;
        double price = 9.99;
        double total;
        char currency = '$';

        System.out.print("What would you like to buy?: ");
        item = input.nextLine();

        System.out.print("How many " + item + "s" + " would you like to buy?: ");
        quantity = input.nextInt();

        total = quantity * price;

        System.out.print("You bought "+ quantity + " " + item + "s" + " with the price of " + price + "\n");
        System.out.println("Your total is: " + total + currency);



        input.close();
    }
}
