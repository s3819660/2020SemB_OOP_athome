package wk2;

import java.util.Scanner;

public class Q5_ReserveString {

    static String getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    /**
     * reverse String using StringBuffer
     * @param input
     */
    static void reverseString_StringBuffer(String input) {
        System.out.println(new StringBuffer(input).reverse().toString());
    }

    /**
     * reverse String another approach
     * @param input
     */
    static void reverseString(String input) {
        char[] string = input.toCharArray();

        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            char temp = string[i];
            string[i] = string[j];
            string[j] = temp;
        }
        System.out.println(string);
    }

    public static void main(String[] args) {
        reverseString_StringBuffer(getInput());
        reverseString(getInput());
    }
}
