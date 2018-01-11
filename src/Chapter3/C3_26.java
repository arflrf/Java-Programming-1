package Chapter3;

import java.util.Scanner;

/**
 * Program checks for divisibility between 2 given numbers
 *
 * @author Aaron Forehand
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a number to check for divisibility: ");
        int number = input.nextInt();

        boolean answer1;  //Question 1
        boolean answer2;  //Question 2
        boolean answer3;  //Question 3

        if ((number % 5 == 0) && (number % 6 == 0)) //Lines 16-25 are question 1.
        {
            answer1 = true; //Divisible- &&
            System.out.println("Is " + number + " divisible by 5 and 6? " + answer1);
        } else {
            answer1 = false; //not divisible- &&
            System.out.println("Is " + number + " divisible by 5 and 6? " + answer1);
        }

        if ((number % 5 == 0) || (number % 6 == 0)) //Lines 27-36 are question 2.
        {
            answer2 = true; //Divisible- ||
            System.out.println("Is " + number + " divisible by 5 or 6? " + answer2);
        } else {
            answer2 = false; //not divisible= ||
            System.out.println("Is " + number + " divisible by 5 or 6? " + answer2);
        }

        if ((number % 5 == 0) ^ (number % 6 == 0)) //Lines 38-47 are question 3.
        {
            answer3 = true;
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + answer3);
        } else {
            answer3 = false;
            System.out.println("Is " + number + " divisible by 5 and 6, but not both? " + answer3);
        }

    }

}
