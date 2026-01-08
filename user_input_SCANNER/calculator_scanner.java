import java.util.Scanner;

public class calculator_scanner {
    public static void main(String [] args){

        //Creating a calculator of area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner calc = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = calc.nextDouble();

        System.out.print("Enter height: ");
        height = calc.nextDouble();

        area = width * height;

        System.out.print("The area is " + area + " cm^2");
    }
}
