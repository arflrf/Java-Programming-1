package Chapter5;

import java.util.Scanner;

/**
 * Program takes a given string from user and reverses it, then prints it to
 * console
 *
 * @author Aaron Forehand
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string for reversal: ");
        String reverse = input.next();

        System.out.printf("%s reversed is %s.", reverse, (new StringBuffer(reverse).reverse().toString()));
    }

}
