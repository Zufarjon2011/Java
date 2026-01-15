package mathclass_lesson9;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args){

        double result;

        //power of something, (2, 3) = 8
        result = Math.pow(100, 0);

        //absolute number (5)
        result = Math.abs(-5);

        // square root (10)
        result = Math.sqrt(100);

        //round, nearest integer (7)
        result = Math.round(6.65);

        //ceil, highest integer (4)
        result = Math.ceil(3.4);

        //lowest integer(3)
        result = Math.floor(3.4);

        // max of values, maxraj, (20)
        result = Math.max(10,20);


        // minimum of values (10)
        result = Math.min(10,20);

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter value of A: ");
        a = input.nextDouble();

        System.out.print("Enter value of B: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("the hypotenuse is : " + c );


        System.out.println(result);

        input.close();

    }
}
