package wk1;

import java.util.Scanner;

public class Q9_Pyramid {

    static int getInput() {
        System.out.println("Enter the number of lines: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static void printPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= 7; k++) {
                System.out.print("\t");
            }
            for (int j = num; j >= 1; j--) {
                if (j <= i)
                    System.out.print(j + "\t");
                else
                    System.out.print("\t");
            }
            for (int l = 2; l <= num; l++) {
                if (l <= i)
                    System.out.print(l + "\t");
                else
                    System.out.print("\t");
            }
            if (i <= num - 1) {
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        printPyramid(getInput());
    }
}
