package arithmetics;

public class arithmertx1 {
    public static void main(String [] args){
        //Augmented Assigment operators
        int x = 10;
        int y = 3;

        //x = x + y; //or x += y
        //x += y;

        //sss
        //Increment and Decrement operators

        x++;
        x--;

        //ORDER OF OPERATIONS (P-E-M-D-A-S)

        //double result = 3 + 4 * (7-5)/2.0;
        //System.out.println(result);

        int result = 6 + 18 / (3 * (2 + 1)) - 4 * 2 + (int)Math.pow(2, 3) / 4;
        System.out.println(result);

    }
}
