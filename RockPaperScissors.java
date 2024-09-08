import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            String[] options = {"rock","paper","scissor"};
            String userChoice,computerChoice;
            boolean playAgain = true;

            System.out.println("Welcome to Rock, Paper, Scissor Game. ");
            while(playAgain){
                // user choice
                System.out.print("Enter your choice (rock,paper,scissor): ");
                userChoice = scanner.nextLine().toLowerCase();

                if(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissor")){
                    System.out.print("Oops! Invalid input, Please Try again.");
                    continue;
                }

                // computer choice
                int randomIndex =random.nextInt(3);
                computerChoice = options[randomIndex];

                // Display computer choice
                System.out.println("Computer Choice: "+computerChoice);
                if(userChoice.equals(computerChoice)){
                    System.out.println("It's a tie!");
                }else if(userChoice.equals("rock") && computerChoice.equals("scissor") || userChoice.equals("paper") && computerChoice.equals("rock") || userChoice.equals("scissor") && computerChoice.equals("paper")){
                    System.out.println("You win!");
                }else{
                    System.out.println("Computers wins!");
                }

                // Ask if the user wants to play again
                System.out.println("You want to play again? (yes/no)");
                playAgain = scanner.nextLine().equalsIgnoreCase("yes");

            }
        }
        System.out.println("Thanks for playing!");
    }
}