package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program will compare 2 lists and test if they are strictly identical
 *
 * @author Aaron Forehand
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list 1: ");

        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list 2: ");
        int[] list2 = new int[input.nextInt()];
        for (int j = 0; j < list2.length; j++) {
            list2[j] = input.nextInt();
        }

        boolean result = equals(list1, list2);
        if (result == true) {
            System.out.println("Two lists are strictly identical");
        } else if (result == false) {
            System.out.println("Two lists are not strictly identical");
        }
    }

    /**
     * equals Method
     *
     * @param list1 - The first list that was entered. To be compared with list2
     * @param list2 - The second list entered. To be compared with list1
     * @return result - boolean based on whether the two lists are strictly
     * identical or not
     */
    public static boolean equals(int[] list1, int[] list2) {
        boolean result;
        if (java.util.Arrays.equals(list1, list2) == true) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
