package Chapter8;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program displays how many how hours an employee works during a week in the
 * form of a multidimensional array.
 *
 * @author Aaron Forehand
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int[][] empHours = {
            {2, 4, 3, 4, 5, 8, 8}, //34
            {7, 3, 4, 3, 3, 4, 4}, //28
            {3, 3, 4, 3, 3, 2, 2}, //20
            {9, 3, 4, 7, 3, 4, 1}, //31
            {3, 5, 4, 3, 6, 3, 8}, //32
            {3, 4, 4, 6, 3, 4, 4}, //28
            {3, 7, 4, 8, 3, 8, 4}, //37
            {6, 3, 5, 9, 2, 7, 9}, //41
        };

        for (int c = 0; c < empHours[0].length; c++) {
            sum0 += empHours[0][c];
        }
        for (int c = 0; c < empHours[1].length; c++) {
            sum1 += empHours[1][c];
        }
        for (int c = 0; c < empHours[2].length; c++) {
            sum2 += empHours[2][c];
        }
        for (int c = 0; c < empHours[3].length; c++) {
            sum3 += empHours[3][c];
        }
        for (int c = 0; c < empHours[4].length; c++) {
            sum4 += empHours[4][c];
        }
        for (int c = 0; c < empHours[5].length; c++) {
            sum5 += empHours[5][c];
        }
        for (int c = 0; c < empHours[6].length; c++) {
            sum6 += empHours[6][c];
        }
        for (int c = 0; c < empHours[7].length; c++) {
            sum7 += empHours[7][c];
        }

        int[] totalList = {sum0, sum1, sum2, sum3, sum4, sum5, sum6, sum7};
        System.out.println("            Su  M  T  W  Th F Sa Total");
        for (int row = 0; row < empHours.length; row++) {
            System.out.print("Employee " + row + "   ");

            for (int column = 0; column < empHours[row].length; column++) {
                System.out.print(empHours[row][column] + "  ");

            }
            System.out.print(totalList[row] + "  ");
            System.out.println();
        }

    }

}
