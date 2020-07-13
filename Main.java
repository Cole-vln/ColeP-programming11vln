import java.util.Scanner;
//allows the scanner function to function
public class Main {
    public static void main(String[] args) {
        String playerChoice;
        //the player's input
        String error = "Invalid selection please try again.";
        //variable that contains the error message because error much shorter to write when attempting to write code
        String playerChoiceFull = "";
        //placeholder variable which outputs the player's choice; rock, paper or scissors
        int playerChoiceInt = 0;
        //indicates the choice of the player; 0 indicates rock, 1 indicates paper, and 2 indicates scissors
        int playerScore = 0;
        //the player's wins
        int computerScore = 0;
        //the player's losses
        int p = 0;
        //the condition in which the program runs
        int y = 0;
        //the condition in which there is an absence of invalid input
        while (p == 0) {
            if (y == 1) y --;
            //resets the variable y to 0 if it is equal to 1
            System.out.println("******************************************************************************************************");
            System.out.println("Wins: " + playerScore + " Losses: " + computerScore);
            System.out.println("Choose rock paper or scissors.  'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");
            Scanner scan = new Scanner(System.in);
            //outputs divider line, score, and prompt
            playerChoice = (scan.next());
            //changes playerChoice to the user input
            if (playerChoice.compareTo("r") == 0) playerChoiceInt = 0;
            else if (playerChoice.compareTo("p") == 0) playerChoiceInt = 1;
            else if (playerChoice.compareTo("s") == 0) playerChoiceInt = 2;
            //tests if both strings are equal, if they are equal the value of playerChoiceInt changes according to the user input
            else if (playerChoice.compareTo("x") == 0) System.exit(0);
            //tests if both strings are equal, if they are equal the system exits
            else {
                System.out.println(error);
                y ++;
            }
            //prints the error statement and changes the value of y to prevent the rest of the code hereafter from running
            if (y == 0) {
                //checks if the value of y is equal to 0. if y is equal to 0 then the rest of the code runs
                int random = (int) (Math.random()*3);
                //generates computer choice
                if (playerChoiceInt - random == 0) System.out.println("Draw, play again");
                else if (playerChoiceInt - random == 2) System.out.println("You Lose!");
                else if (playerChoiceInt - random == 1) System.out.println("You Win!");
                else if (playerChoiceInt - random == -1) System.out.println("You Lose!");
                else if (playerChoiceInt - random == -2) System.out.println("You Win!");
                //using the integers assigned to each possible choice this outputs the output of the game ex. win, lose
                if (playerChoiceInt - random == 0) playerScore = playerScore;
                else if (playerChoiceInt - random == 2) computerScore ++;
                else if (playerChoiceInt - random == 1) playerScore ++;
                else if (playerChoiceInt - random == -1) computerScore ++;
                else if (playerChoiceInt - random == -2) playerScore ++;
                //using the integers assigned to each possible choice the score is changed to reflect past wins and losses
                if (playerChoiceInt == 0) playerChoiceFull = "rock";
                else if (playerChoiceInt == 1) playerChoiceFull = "paper";
                else if (playerChoiceInt == 2) playerChoiceFull = "scissors";
                //changes playerChoiceFull to one of the choices by checking if playerChoiceInt is equal to a certain integer
                System.out.print("Player Choice: " +playerChoiceFull);
                //outputs the player's choice
                if (random == 0) System.out.println("  Computer Choice: rock");
                else if (random == 1) System.out.println("  Computer Choice: paper");
                else if (random == 2) System.out.println("  Computer Choice: scissors");
                //outputs the computer's choice
            }
        }
    }
}