package Chapter3;

import java.util.Scanner;

/**
 * Program compares the weight and price of 2 packages and determines which one
 * has a better price ratio
 *
 * @author Aaron Forehand
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble(); //Set weight for package 1
        double price1 = input.nextDouble(); //Set weight for package 1
        double ratio1 = price1 / weight1; //Set price/lb ratio
        System.out.println("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble(); //Set weight for package 2
        double price2 = input.nextDouble(); //Set price for package 2
        double ratio2 = price2 / weight2; //Set price/lb ratio 
        if (ratio1 < ratio2) {
            System.out.println("Package 1 has a better price. ");
        } else if (ratio1 > ratio2) {
            System.out.println("Package 2 has a better price. ");
        } else if (ratio1 == ratio2) {
            System.out.println("Two packages have the same price. ");
        }
    }

}
