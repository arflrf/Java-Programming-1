package Chapter5;

import java.util.Scanner;

/**
 * This is a rock paper scissors game that uses user input and the random
 * feature to play and display results to the console
 *
 * @author Aaron Forehand
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int compWins = 0;
        int userWins = 0;

        while ((compWins < 2) && (userWins < 2)) {
            int compChoice = (int) (Math.random() * 3);
            System.out.println("\nEnter 0 for scissors, 1 for rock, or 2 for paper: ");
            Scanner input = new Scanner(System.in);
            int userChoice = input.nextInt();

            if (userChoice > compChoice) {
                System.out.println("You win!");
                userWins++;
                System.out.printf("\n User Score: %d vs. Computer Score: %d", userWins, compWins);
            } else if (userChoice < compChoice) {
                System.out.println("You lose.");
                compWins++;
                System.out.printf("Your Score: %d vs. Computer Score: %d", userWins, compWins);
            } else if (userChoice == compChoice) {
                System.out.println("Draw.");
                System.out.printf("Your Score: %d vs. Computer Score: %d", userWins, compWins);
            }
        } //while loop end

    } //method end

}
