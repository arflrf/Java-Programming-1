package Chapter6;

import java.util.Scanner;

/**
 * Program will take an entered amount of dollars and convert them to yen,
 * euros, or pounds and display the result
 *
 * @author Aaron Forehand
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Euros can $1 buy? (Recommended .86 Euro = $1 dollar): ");
        double euroConv = input.nextDouble();
        System.out.println("How many Pound Sterling can $1 buy? (Recommended .76 PS = $1 dollar): ");
        double poundConv = input.nextDouble();
        System.out.println("How many Yen can $1 buy? (Recommended 114.14 Yen = $1 dollar): ");
        double yenConv = input.nextDouble();
        String contInput = "";
        double yen = 0;
        double euros = 0;
        double pounds = 0;
        while (!(contInput.contains("no"))) {
            System.out.println("Enter the number of dollars you want to convert: ");
            double dollars = input.nextDouble();
            System.out.println("Enter Y, E, or P to choose which currency to convert to.");
            String select = input.next().toUpperCase();

            if (select.contains("Y")) {
                yen = CurrencyConversion(dollars, yenConv);
                System.out.printf("You can buy %4.2f yen with $%4.2f dollars.", yen, dollars);
                System.out.println(" Want to Continue? Yes or No");
                contInput = input.next().toLowerCase();
                if (!(contInput.contains("yes")) && !(contInput.contains("no"))) {
                    while (!(contInput.contains("yes")) && !(contInput.contains("no"))) {
                        System.out.println("Want to Continue? Yes or No");
                        contInput = input.next().toLowerCase();
                    }
                }

            }
            if (select.contains("E")) {
                euros = CurrencyConversion(dollars, euroConv);
                System.out.printf("You can buy %4.2f euros with $%4.2f dollars.", euros, dollars);
                System.out.println("Want to Continue? Yes or No");
                contInput = input.next().toLowerCase();
                if (!(contInput.contains("yes")) && !(contInput.contains("no"))) {
                    while (!(contInput.contains("yes")) && !(contInput.contains("no"))) {
                        System.out.println("Want to Continue? Yes or No");
                        contInput = input.next().toLowerCase();
                    }
                }

            }
            if (select.contains("P")) {
                pounds = CurrencyConversion(dollars, poundConv);
                System.out.printf("You can buy %4.2f pounds with $%4.2f dollars.", pounds, dollars);
                System.out.println("Want to Continue? Yes or No");
                contInput = input.next().toLowerCase();
                if (!(contInput.contains("yes")) && !(contInput.contains("no"))) {
                    while (!(contInput.contains("yes")) && !(contInput.contains("no"))) {
                        System.out.println("Want to Continue? Yes or No");
                        contInput = input.next().toLowerCase();
                    }
                }
            }
        }
    }

    /**
     * CurrencyConversion Method
     *
     * @param dollars the amount of dollars entered by the user
     * @param type the type of currency specified to be converted to
     *
     * @return the final amount of converted currency
     *
     */

    public static double CurrencyConversion(double dollars, double type) {
        if (dollars > 100) {
            dollars = dollars - (dollars * .05);
        } else {
            dollars = dollars - (dollars * .10);
        }

        return (dollars * type);
    }
}
