package Chapter4;

import java.util.Scanner;

/**
 * Program takes a user's major and class status and displays them all at one
 * time
 *
 * @author Aaron Forehand
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Majors: M=Mathematics, C=Computer Science, I=Information Science");
        System.out.println("Status: 1,2,3,4 based on your grade level. 1=freshamn, 4 = senior.");
        System.out.println("Enter a letter and number to represent your major and status (Example: M1) : ");
        String answer = input.next();
        char major = answer.charAt(0);
        char status = answer.charAt(1);
        String major1 = "";
        String status1 = "";
        if (((major == 'M') || (major == 'C') || (major == 'I')) && ((status == '1') || (status == '2') || (status == '3') || (status == '4'))) {

            switch (major) {
                case 'M':
                    major1 = "Mathematics";
                    break;
                case 'C':
                    major1 = "Computer Science";
                    break;
                case 'I':
                    major1 = "Information Science";
                    break;

            }

            switch (status) {
                case '1':
                    status1 = "Freshman";
                    break;
                case '2':
                    status1 = "Sophomore";
                    break;
                case '3':
                    status1 = "Junior";
                    break;
                case '4':
                    status1 = "Senior";
                    break;
            }

            System.out.println(major1 + ", " + status1);
        } else {
            System.out.println("Invalid Input. Try Again. ");

        }

    }

}
