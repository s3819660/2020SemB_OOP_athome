package wk2;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_SortCities {

    static String[] getInput() {
        Scanner scanner = new Scanner(System.in);
        String cities[] = new String[3];

        System.out.println("Enter the first city: ");
        cities[0] = scanner.nextLine();

        System.out.println("Enter the second city: ");
        cities[1] = scanner.nextLine();

        System.out.println("Enter the third city: ");
        cities[2] = scanner.nextLine();
        return cities;
    }

    static void sortCities(String[] input) {
        // Use Arrays.sort method
        Arrays.sort(input);
        System.out.println("The three cities in alphabetical order are "
                            + input[0] + " " + input[1] + " " + input[2]);
    }

    public static void main(String[] args) {
        sortCities(getInput());
    }
}
