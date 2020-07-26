package wk1;

import java.util.Scanner;

public class Q3_Celsius {
    public static void main(String[] args) {
        System.out.println("Enter a temperature");
        Scanner input = new Scanner(System.in);
        double temperature = input.nextDouble();
        System.out.println((9.0/5)*temperature + 32);
    }
}
