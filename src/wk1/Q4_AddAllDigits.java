import java.util.Scanner;

public class Q4_AddAllDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number from 0 to 1000");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int sum;
        if (x < 0 || x > 1000) System.out.println("Invalid");
        else{
            if (x < 100) {
                sum = x / 10 + x % 10;
                System.out.println(sum);
            }
            if (x < 1000) {
                sum = x / 100 + (x % 100) / 10 + (x % 100) % 10;
                System.out.println(sum);
            }
            else System.out.println(x);
        }
    }
}
