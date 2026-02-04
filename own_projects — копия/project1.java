package own_projects;

import java.util.Scanner;


public class project1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      //products: PIZZA, BURGER, HOTDOGS, SHAWARMA

        String items;
        int quantity;

        double price = 0;

        double total;
        char currency = '$';

        System.out.print("What would you like to buy(pizza, burger, hot-dog, shawarma): ");
        items = input.nextLine();
        if (items.equals("pizza")){
           price = 9.99;
        }
        if (items.equals("burger")){
            price = 1.0;
        }
        if (items.equals("hot-dog")){
            price = 1.3;
        }
        if (items.equals("shawarma")){
            price = 2.1;
        }

        System.out.print("enter quantity of " + items +  " : ");
        quantity = input.nextInt();
        total = quantity * price;

        System.out.print("\nYour total is " + total + currency + "\nYou bought " + quantity + " " + items + "s");

        input.close();
    }
}

