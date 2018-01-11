package Chapter2;

import java.util.Scanner;

/**
 * Program will display the area and volume of a cylinder, using radius and
 * length input from the user
 *
 * @author Aaron Forehand
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        final double PIE = 3.1415912;

        double area = radius * radius * PIE;
        double volume = area * length;

        System.out.println("The area is " + area + " and the volume is " + volume + ".");
    }

}
