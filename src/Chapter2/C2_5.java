package Chapter2;

import java.util.Scanner;

/**
 * Program to display a gratuity and total price using a percent tip and a
 * subtotal.
 *
 * @author Aaron Forehand
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a subtotal and a gratuity %: ");
        double subtotal = input.nextDouble();
        double gratuityrate = input.nextDouble();
        gratuityrate = gratuityrate / 100;

        double gratuity = subtotal * gratuityrate;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total price is $" + total);

    }

}
