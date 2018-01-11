package Chapter3;

import java.util.Scanner;

/**
 * Program will take 2 numbers and compare them in several different ways
 *
 * @author Aaron Forehand
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        double number1;  //Step 1
        double number2;

        Scanner input = new Scanner(System.in); //Step 2

        System.out.println("Enter the first number: "); //Step 3
        number1 = input.nextDouble();

        System.out.println("Enter the second number: "); //Step 4
        number2 = input.nextDouble();

        if (number1 < number2) //Step 5
        {
            System.out.println("The first number is less than the second. ");
        }

        if (number1 > number2) //Step 6
        {
            System.out.println("The first number is greater than the second. ");
        }

        if (number1 == number2) //Step 7
        {
            System.out.println("The first number is equal to the second. ");
        }

        if (number1 <= number2) //Step 8
        {
            System.out.println("The first number is less than or equal to the second. ");
        }

        if (number1 != number2) //Step 9
        {
            System.out.println("The first number is not equal to the second. ");
        }

        if (number2 == 0) //Step 10
        {
            System.out.println("Cannot divide by zero. ");
        } else if ((number1 / number2) < 1) {
            System.out.println("Proper fraction. ");
        } else {
            System.out.println("Improper fraction. ");
        }

        if (number1 >= 90) //Step 11
        {
            System.out.println("A");
        } else if (number1 >= 80) {
            System.out.println("B");
        } else if (number1 >= 70) {
            System.out.println("C");
        } else if (number1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if ((number2 >= 1) && (number2 <= 100)) //Step 12
        {
            System.out.println("In range. ");
        } else {
            System.out.println("Out of range. ");
        }
    }
}
