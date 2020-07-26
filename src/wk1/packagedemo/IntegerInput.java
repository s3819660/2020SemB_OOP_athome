package wk1.packagedemo;
import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        int[] arrayOfInteger = new int[3];
        for (int i = 0; i < arrayOfInteger.length; i++) { // array.length
            Scanner scanner = new Scanner(System.in);
            arrayOfInteger[i] = scanner.nextInt();
            System.out.println(arrayOfInteger[i]);
        }
    }
}
