package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program will assign grades to a student and display them to the console.
 *
 * @author Aaron Forehand
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letGrade;
        System.out.println("Enter the number of students: ");
        int students = input.nextInt();
        int[] grades = new int[students];
        System.out.println("Enter the " + students + " grades.");
        for (int i = 0; i < students; i++) {
            grades[i] = input.nextInt();
        }
        Arrays.sort(grades);
        int best = grades[grades.length - 1];

        for (int j = 0; j < grades.length; j++) {
            if (grades[j] >= (best - 10)) {
                letGrade = "A";
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letGrade);
            } else if (grades[j] >= (best - 20)) {
                letGrade = "B";
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letGrade);
            } else if (grades[j] >= (best - 30)) {
                letGrade = "C";
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letGrade);
            } else if (grades[j] >= (best - 40)) {
                letGrade = "D";
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letGrade);
            } else {
                letGrade = "F";
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letGrade);
            }

        }

    }

}
