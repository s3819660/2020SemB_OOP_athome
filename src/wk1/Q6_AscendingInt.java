/* Write a Java program that reads three integer variables num1, num2, num3 and then
prints them out in ascending order */
import java.util.Scanner;
public class Q6_AscendingInt {
    public static void main(String[] args) {
        System.out.println("Enter 3 integers:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
//        System.out.println(x + " " + y + " " + z + " ");
        System.out.printf("%d %d %d\n", x, y, z);

        // ascending
        int max = x;
        int a = 0;
        int b = 0;
        if (y > max) {
            max = y;
            a = x;
        }
        else a = y;
        if (z > max) {
        max = z;
//            if (a == y) {
//                b = x;
//            }
//            else b = y;
        b = (a == y ? x : y);
        }
        else b = z;
        if (b > a)
            System.out.print(a + " " + b + " " + max);
        else
            System.out.print(b + " " + a + " " + max);
    }
}
