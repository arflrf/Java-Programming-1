package Chapter3;

import java.util.Scanner;

/**
 * Program runs a guessing game with a flipped coin using math.Random
 *
 * @author Aaron Forehand
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int coinFlip = (int) (Math.random() * 2);    //Gets random value of either 0 or 1

        System.out.println("Enter either 1 or 0 for heads or tails: ");     //Ask for input

        Scanner input = new Scanner(System.in);     //read input
        int answer = input.nextInt();     //set input to variable

        if (answer == coinFlip) {     //checks for correct guess
            System.out.println("You guessed right! ");
        } else {
            System.out.println("You guessed wrong. Try again.");
        }
    }

}
