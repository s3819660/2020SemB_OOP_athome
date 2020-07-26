package wk2;

import java.util.Scanner;

public class Q9_Decrypt {

    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void decrypt(String input) {

        final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        final String CIPHERS = "QTGABCDEFHIJKLMNOPRSUVWXYZ" + "QTGABCDEFHIJKLMNOPRSUVWXYZ".toLowerCase();

        /**
         * Use toCharArray method
         */
        char[] decryptedCharArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            /**
             * Use indexOf method
             */
            int index = CIPHERS.indexOf(decryptedCharArray[i]);

            // index == 1 when the character wasn't found in the string
            if (index != -1) {
                decryptedCharArray[i] = LETTERS.charAt(index);
            }
        }
        System.out.println(decryptedCharArray);
    }

    public static void main(String[] args) {
        decrypt(getInput());
    }
}

