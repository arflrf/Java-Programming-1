package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * The program will take numbers from user input, and use them to fill an array,
 * then average and display it on the console.
 *
 * @author Aaron Forehand
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        fillArray(numbers);
        double average = averageArray(numbers);

        System.out.printf("The average is %4.2f", average);
        System.out.println("");
        printArray(numbers);

    }

    /**
     * fillArray Method
     *
     * @param array - double array that stores the numbers entered by the user.
     */

    public static void fillArray(double[] array) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number to fill array: ");
            array[i] = input.nextDouble();
        }
    }

    /**
     * averageArray Method
     *
     * @param array - double array that stores the numbers entered by the user.
     * @return average - returns the average of the numbers in the array
     */
    public static double averageArray(double[] array) {
        int sum = 0;
        for (int y = 0; y < array.length; y++) {
            sum += array[y];
        }
        double average = sum / array.length;
        return average;
    }

    /**
     * fillArray Method
     *
     * @param array - double array that stores the numbers entered by the user.
     */
    public static void printArray(double[] array) {
        System.out.print("[");
        for (int u = 0; u < array.length; u++) {
            System.out.print(array[u] + ", ");
        }
        System.out.print("]");
    }

}
