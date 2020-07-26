package wk1;/*
Suppose you save $100 each month into a savings account with the annual interest rate
5%. Thus, the monthly interest rate is 0.05 / 12 =  0.00417. After the first month, the value in the
account becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a Java program that prompts the user to enter a monthly saving amount and
displays the account balance after each month for one year.
 */

import java.util.Scanner;
public class Q5_AnnualSaving {
    public static void main(String[] args) {
        System.out.print("Enter a monthly saving amount: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double total;

        // calculation
        total = x * (1 + 0.05 * x);
        total = total * (1 + 0.05 * total);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);
//        total = x * (1 + 0.05 * x);

    }
}
