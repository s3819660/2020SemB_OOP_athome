package wk3;

import java.util.Arrays;
import java.util.Scanner;

class Location {
    public int row;
    public int column;
    double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return String.format("The location of the largest element is " + this.maxValue
                            + " at " + "(" + this.row + ", " + this.column + ")");
    }
}

public class Q7_Location {

    static int[] getArrSize() {
        System.out.print("Enter the numbers of rows and column in the array: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        /**
         * Split input into 2 integers
         */
        String inputs[] = input.split("\\s+");

        /**
         * Convert array of string to array of int
         */
        int[] array = Arrays.asList(inputs).stream().mapToInt(Integer::parseInt).toArray();

        return array;
    }

    static double[][] getArray(int[] arrSize) {
        // get array input
        System.out.println("Enter the array:");
        Scanner scanner = new Scanner(System.in);

        String strings[] = new String[arrSize[0] * arrSize[1]]; // total amount of number that were input
        double inputs[][] = new double[arrSize[0]][arrSize[1]]; // 2d array
        for (int i = 0; i < arrSize[0]; i++) {
            for (int j = 0; j < arrSize[1]; j++) {
                strings[j] = scanner.next();                    // return a string until a whitespace ' '
                inputs[i][j] = Double.parseDouble(strings[j]);    // convert string into int
            }
        }
        return inputs;
    }

    public static Location LocateLargest(double[][] arr) {
        int max_Index1 = 0;
        int max_Index2 = 0;
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    max_Index2 = j;
                }
            }
            if (arr[i][max_Index2] >= max) {
                max_Index1 = i;
            }
        }
        return new Location(max_Index1, max_Index2, arr[max_Index1][max_Index2]);
    }

    public static void main(String[] args) {
        int size[] = Q7_Location.getArrSize();
        double arr[][] = Q7_Location.getArray(size);
        Location largest = LocateLargest(arr);
        System.out.println(largest.toString());
    }
}
