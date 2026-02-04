package random_numbers_lesson8;

import java.util.Random;

public class main{
    public static void main(String [] args){

        //Int
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        //First number is inclusive, second one is exclusive(1,2,3,4,5,6)
        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);

        //Double

        double numpy = random.nextDouble(0.7, 19.1);

        //Boolean

        boolean isHead = random.nextBoolean();

        if (isHead){
            System.out.println("HEADS - TRUE");
        }
        else{
            System.out.println("TAILS - FALSE");
        }

        System.out.println(numpy);


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}