package Chapter4;

import java.util.Scanner;

/**
 * Program creates an employee payroll, taking a name, hours worked, the pay
 * rate, tax rates and displays a net pay
 *
 * @author Aaron Forehand
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name: ");
        String name = input.next();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payrate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate(Decimal): ");
        double fedRate = input.nextDouble();
        System.out.println("Enter state tax withholding rate(Decimal): ");
        double stateRate = input.nextDouble();

        double grossPay = payrate * hours;
        double fedTax = grossPay * fedRate;
        double stateTax = grossPay * stateRate;

        double totalDeducts = fedTax + stateTax;

        double netPay = grossPay - totalDeducts;

        System.out.println("Employee Name: " + name);
        System.out.printf("Hours Worked: %4.2f", hours);
        System.out.println("     ");
        System.out.printf("Pay Rate: $%4.2f", payrate);
        System.out.println("     ");
        System.out.printf("Gross Pay: $%4.2f", grossPay);
        System.out.println("     ");
        System.out.println("Deductions: ");
        System.out.printf("   Federal Withholding(%4.2f): $%4.2f", fedRate * 100, fedTax);
        System.out.println("     ");
        System.out.printf("   State Withholding(%4.2f): $%4.2f", stateRate * 100, stateTax);
        System.out.println("     ");
        System.out.printf("   Total Deduction: $%4.2f", totalDeducts);
        System.out.println("     ");
        System.out.println("----------------------------");
        System.out.printf("Net Pay: $%4.2f", netPay);
    }

}
