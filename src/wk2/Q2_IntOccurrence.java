package wk2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_IntOccurrence {

    static String getInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: ");

        String input = scanner.nextLine();
        return input;
    }

    static void getOccurrence(String input) {
        /**
         * Use split method
         */
        String strings[] = input.split("\\s+");

        int numbers[] = new int[100];

        /**
         * Use Arrays.fill method
         */
        Arrays.fill(numbers, 0);

        for (String str : strings) {
            /**
             * Use Integer.parseInt method
             */
            if (Integer.parseInt(str) == 0)
                break;
            numbers[Integer.parseInt(str) - 1]++;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 1)
                System.out.println(i + 1 + " occurs " + numbers[i] + " times.");
            else if (numbers[i] == 1)
                System.out.println(i + 1 + " occurs " + numbers[i] + " time.");
        }
    }

    public static void main(String[] args) {
        getOccurrence(getInput());
    }
}
