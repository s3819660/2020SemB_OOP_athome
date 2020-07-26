package wk2;

import java.util.Scanner;

public class Q3_sortList {

    static String getInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list: ");

        return scanner.nextLine();
    }

    static void isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("The list is not sorted");
                return;
            }
        }
        System.out.println("The list is already sorted");
    }

    static int[] splitString(String input) {
        /**
         * Use split method
         */
        String[] strings = input.split("\\s+");

        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            /**
             * Use Integer.parseInt method
             */
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        isSorted(splitString(getInput()));
    }
}
