package wk2;

import java.util.Scanner;

public class Q6_IsPalindrome {

    static String getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    static String reverseString_StringBuffer(String input) {
        return new StringBuffer(input.replaceAll("\\W+", "")).reverse().toString();
    }

    static boolean isPalindrome(String input) {
        String string = (input.replaceAll("\\W+", "")).toLowerCase();
        System.out.println(string);
        if (string.equals(reverseString_StringBuffer(string).toLowerCase())) {
            return true;
        }
        System.out.println(reverseString_StringBuffer(string));
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(getInput()));;
    }
}
