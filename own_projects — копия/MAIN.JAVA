import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("✊✋✌ Rock, Paper, Scissors Game");
        System.out.println("Type rock, paper, or scissors");

        System.out.print("Your choice: ");
        String userChoice = scanner.next().toLowerCase();

        String computerChoice = choices[random.nextInt(3)];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("🤝 It's a tie!");
        } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("🎉 You win!");
        } else if (
                userChoice.equals("rock") ||
                        userChoice.equals("paper") ||
                        userChoice.equals("scissors")
        ) {
            System.out.println("💻 Computer wins!");
        } else {
            System.out.println("❌ Invalid input!");
        }

        scanner.close();
    }
}

//import java.util.Random;
//import java.util.Scanner;
//
//public class RockPaperScissors {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        String[] choices = {"rock", "paper", "scissors"};
//
//        System.out.println("✊✋✌ Rock, Paper, Scissors Game");
//        System.out.println("Type rock, paper, or scissors");
//
//        System.out.print("Your choice: ");
//        String userChoice = scanner.next().toLowerCase();
//
//        String computerChoice = choices[random.nextInt(3)];
//
//        System.out.println("Computer chose: " + computerChoice);
//
//        if (userChoice.equals(computerChoice)) {
//            System.out.println("🤝 It's a tie!");
//        } else if (
//                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
//                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
//                        (userChoice.equals("scissors") && computerChoice.equals("paper"))
//        ) {
//            System.out.println("🎉 You win!");
//        } else if (
//                userChoice.equals("rock") ||
//                        userChoice.equals("paper") ||
//                        userChoice.equals("scissors")
//        ) {
//            System.out.println("💻 Computer wins!");
//        } else {
//            System.out.println("❌ Invalid input!");
//        }
//
//        scanner.close();
//    }
//}
