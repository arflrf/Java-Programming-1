package Chapter6;

import java.util.Scanner;

/**
 * Program will take an entered password to see if it follows specified
 * guidelines
 *
 * @author Aaron Forehand
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password to see if it is valid: ");
        String password = input.nextLine();

        passwordTest(password);
    }

    /**
     * passwordTest Method
     *
     * @param password the password that was entered by the user
     */
    public static void passwordTest(String password) {
        boolean length = false;
        boolean LetDig = false;
        boolean Digits = false;
        if (password.length() >= 8) {
            length = true;
        } else {
            length = false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
                LetDig = true;
            } else {
                LetDig = false;
            }
        }
        int counter = 0;
        for (int j = 0; j < password.length(); j++) {
            if (Character.isDigit(password.charAt(j))) {
                ++counter;
            }
        }

        if (counter >= 2) {
            Digits = true;
        } else {
            Digits = false;
        }

        if ((length == true) && (LetDig == true) && (Digits == true)) {
            System.out.println("Valid Password.");
        } else {
            System.out.println("Invalid Password.");
        }
    }

}
