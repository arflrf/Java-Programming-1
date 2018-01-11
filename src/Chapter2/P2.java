package Chapter2;

import java.util.Scanner;

/**
 * Program will display a subtotal, tax, tip, and the total cost of a meal
 *
 * @author Aaron Forehand
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double mealPrice;
        double drinkPrice;
        double dessertPrice;
        double subtotal;
        double tax;
        double tip;
        double total;
        final double SALES_TAX = .10;
        final double TIP_RATE = .15;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of the meal: ");
        mealPrice = input.nextDouble();

        System.out.println("Enter the price of the drink: ");
        drinkPrice = input.nextDouble();

        System.out.println("Enter the price of the dessert: ");
        dessertPrice = input.nextDouble();

        //Food Price
        subtotal = mealPrice + drinkPrice + dessertPrice;

        //Food + Tax
        tax = subtotal * SALES_TAX;

        double subtotal1 = subtotal + tax;

        //Food + Tax + Tip
        tip = subtotal1 * TIP_RATE;

        total = subtotal + tax + tip;

        System.out.println("The subtotal is $" + subtotal + "0.");
        System.out.println("The tax is $" + tax + "0.");
        System.out.println("The tip is $" + tip + "0.");
        System.out.println("The total payment is $" + total + "0.");
    }
}
