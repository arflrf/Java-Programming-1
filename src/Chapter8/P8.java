package Chapter8;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program displays a multidimensional array showing how many sales a
 * salesperson completed during a week
 *
 * @author Aaron Forehand
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contInput = "";

        double[][] salesTable = new double[4][5];
        while (!(contInput.contains("N"))) {
            System.out.println("Enter the salesman ID as A, B, C, or D.");
            String saleID = input.next();
            char SalesID = saleID.charAt(0);
            int idSpot = linearSearchArray(salesTable, SalesID);
            while (idSpot == -1) {
                System.out.println("You entered an invalid ID. ");
                System.out.println("Enter the salesman ID as A, B, C, or D.");
                saleID = input.next();
                SalesID = saleID.charAt(0);
                idSpot = linearSearchArray(salesTable, SalesID);

            }

            System.out.println("Enter the day as M, T, W, H, or F.");
            String saleDay = input.next();
            char SalesDay = saleDay.charAt(0);
            int daySpot = linearSearchArray(salesTable, SalesDay);

            while (daySpot == -1) {
                System.out.println("You entered an invalid day. ");
                System.out.println("Enter the day as M, T, W, H, or F.");
                saleDay = input.next();
                SalesDay = saleDay.charAt(0);
                daySpot = linearSearchArray(salesTable, SalesDay);
            }

            System.out.println("Enter the amount of the sale.");
            double saleAmt = input.nextDouble();
            salesTable[idSpot][daySpot] += saleAmt;
            System.out.println(" Want to Continue? Y or N");
            contInput = input.next().toUpperCase();
            if (!(contInput.contains("Y")) && !(contInput.contains("Y"))) {
                while (!(contInput.contains("Y")) && !(contInput.contains("N"))) {
                    System.out.println("Want to Continue? Y or N");
                    contInput = input.next().toLowerCase();
                }
            }
        }
        System.out.println("Salesman  M     T     W     H     F");
        for (int row = 0; row < salesTable.length; row++) {
            switch (row) {
                case 0:
                    System.out.print("A      ");
                    break;
                case 1:
                    System.out.print("B      ");
                    break;
                case 2:
                    System.out.print("C      ");
                    break;
                case 3:
                    System.out.print("D      ");
                    break;
                default:
                    break;
            }
            for (int column = 0; column < salesTable[row].length; column++) {
                System.out.printf(" %4.2f ", salesTable[row][column]);
            }
            System.out.println();
        }

    }

    /**
     * linearSearchArray Method
     *
     * @param array - holds the dimensions of the table to be filled in
     * @param value - char that fills in an employee letter(A-D) and the day of
     * the sale(M-F)
     * @return index - returns the index of (A-D, M-F) to fill in the array for
     * ever sale.
     */

    public static int linearSearchArray(double[][] array, char value) {
        int index = -1;
        switch (value) {
            case 'A':
                index = 0;
                break;
            case 'B':
                index = 1;
                break;
            case 'C':
                index = 2;
                break;
            case 'D':
                index = 3;
                break;
            case 'M':
                index = 0;
                break;
            case 'T':
                index = 1;
                break;
            case 'W':
                index = 2;
                break;
            case 'H':
                index = 3;
                break;
            case 'F':
                index = 4;
                break;
            default:
                index = -1;
                break;
        }
        return index;

    }
}
