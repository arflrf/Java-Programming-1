package Chapter4;

import java.util.Scanner;

/**
 * Program will take 2 jobs for an employee, and choose the better offer based
 * on the hours worked and the hourly charge rate
 *
 * @author Aaron Forehand
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of first bidder: ");
        String name1 = input.next();
        System.out.println("How many hours of work will you require? ");
        int hours1 = input.nextInt();
        System.out.println("What is the hourly charge rate? ");
        double rate1 = input.nextDouble();

        System.out.println("Enter name of second bidder: ");
        String name2 = input.next();
        System.out.println("How many hours of work will you require? ");
        int hours2 = input.nextInt();
        System.out.println("What is the hourly charge rate? ");
        double rate2 = input.nextDouble();

        double cost1 = hours1 * rate1;
        double cost2 = hours2 * rate2;

        if (cost1 < cost2) {
            System.out.println("The winner is " + name1 + "!");
            System.out.printf("The total cost is $%4.2f", cost1);
        } else if (cost2 < cost1) {
            System.out.println("The winner is " + name2 + "!");
            System.out.printf("The total cost is $%4.2f", cost2);
        } else if ((cost1 == cost2) && (hours1 < hours2)) {
            System.out.println("The winner is " + name1 + "!");
            System.out.println("Number of hours: " + hours1);
            System.out.printf("The total cost is $%4.2f", cost1);

        } else if ((cost1 == cost2) && (hours2 < hours1)) {
            System.out.println("The winner is " + name2 + "!");
            System.out.println("Number of hours: " + hours2);
            System.out.printf("The total cost is $%4.2f", cost2);
        } else if ((cost1 == cost2) && (hours2 == hours1)) {
            System.out.println(name1 + " and " + name2 + " have identical bids. ");
            System.out.println("Number of hours: " + hours2);
            System.out.printf("Cost per hour: $%4.2f", rate2);
            System.out.println("      ");
            System.out.printf("The total cost is $%4.2f", cost2);
        }

    }
}
