package Chapter4;

import java.util.Scanner;

/**
 * Program will take 2 strings and determine if s2 is a substring of s1.
 *
 * @author Aaron Forehand
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1: ");
        String s1 = input.next();
        System.out.println("Enter string s2: ");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + "is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }

}
