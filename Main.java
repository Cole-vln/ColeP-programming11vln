import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playerChoice;
        String error = "Invalid selection please try again.";
        String playerChoiceFull = "";
        int playerChoiceInt = 0;
        System.out.println("Choose rock paper or scissors.  'r' for rock, 'p' for paper and 's' for scissors.");
        Scanner scan = new Scanner(System.in);
        playerChoice = (scan.next());
        if (playerChoice.compareTo("r") == 0) playerChoiceInt = 0;
        else if (playerChoice.compareTo("p") == 0) playerChoiceInt = 1;
        else if (playerChoice.compareTo("s") == 0) playerChoiceInt = 2;
        else {
            System.out.println(error);
            System.exit(0);
        }
        //tests if both strings are identical, if none of the strings are identical the else statement outputs the error message and exits the program
        int random = (int) (Math.random()*3);
        //generates computer choice
        if (playerChoiceInt - random == 0) System.out.println("Draw, play again");
        else if (playerChoiceInt - random == 2) System.out.println("You Lose!");
        else if (playerChoiceInt - random == 1) System.out.println("You Win!");
        else if (playerChoiceInt - random == -1) System.out.println("You Lose!");
        else if (playerChoiceInt - random == -2) System.out.println("You Win!");
        //using the integers assigned to each possible choice this outputs the output of the game ex. win, lose
        if (playerChoiceInt == 0) playerChoiceFull = "rock";
        else if (playerChoiceInt == 1) playerChoiceFull = "paper";
        else if (playerChoiceInt == 2) playerChoiceFull = "scissors";
        //changes playerChoiceFull to one of the choices by checking if playerChoiceInt is equal to a certain integer
        System.out.print("Player Choice: " +playerChoiceFull);
        //ouputs the player's choice
        if (random == 0) System.out.println("  Computer Choice: rock");
        else if (random == 1) System.out.println("  Computer Choice: paper");
        else if (random == 2) System.out.println("  Computer Choice: scissors");
        //outputs the computer's choice
    }
}