package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * The program will find the lowest number out of 10 user-inputed values
 *
 * @author Aaron Forehand
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double minValue = min(numbers);

        System.out.println("The minimum value is: " + minValue);
    }

    /**
     * min Method
     *
     * @param array double array that holds the 10 numbers entered by the user.
     * @return minValue the smallest value from the array.
     */

    public static double min(double[] array) {
        double minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

}
