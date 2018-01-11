package Chapter2;

import java.util.Scanner;

/**
 * Program will take a temperature in celsius, convert it to fahrenheit, and
 * display the result.
 *
 * @author Aaron Forehand
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("The temperature of " + celsius + " C in fahrenheit is: " + fahrenheit);

    }

}
