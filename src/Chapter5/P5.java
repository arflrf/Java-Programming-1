package Chapter5;

import java.util.Scanner;

/**
 * Program to take votes and count them up, displaying final tallies to the
 * console
 *
 * @author Aaron Forehand
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char vote;
        int yesVotes = 0;
        int noVotes = 0;
        int finished = 0;
        String voteString;
        while (finished != 1) {
            System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting. ");
            voteString = input.nextLine();

            vote = voteString.charAt(0);

            if ((vote == 'Y') || (vote == 'y')) {
                yesVotes++;
            } else if ((vote == 'N') || (vote == 'n')) {
                noVotes++;
            } else if ((vote == 'Q') || (vote == 'q')) {
                System.out.printf("Total Votes: %d voted yes, and %d voted no. ", yesVotes, noVotes);
                finished = 1;
            } else {
                System.out.println("INVALID CODE: Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting. ");
            }

        }
    }
}
