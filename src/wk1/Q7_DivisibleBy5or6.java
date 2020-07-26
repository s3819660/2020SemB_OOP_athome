package wk1;
import java.util.Scanner;
/* Write a Java program that prompts the user to enter an integer and checks whether the
number is divisible by both 5 and 6, or neither of them, or just one of them. Here are
some sample runs for inputs 10, 30, and 23 */

public class Q7_DivisibleBy5or6 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner input = new Scanner(System.in);
        int check = 0;
        int num = input.nextInt();
        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println(num + " is divisible by both 5 and 6");
            check = 1;
        }
        else if ((num % 5 == 0 || num % 6 == 0) && check == 0)
            System.out.println(num + " is divisible by 5 or 6, but not both");
        else System.out.println(num + " is not divisible by either 5 or 6");
    }
}
