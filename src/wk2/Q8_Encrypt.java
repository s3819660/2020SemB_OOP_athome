package wk2;

import java.util.Scanner;

public class Q8_Encrypt {

    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void encrypt(String input) {

        final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        final String CIPHERS = "QTGABCDEFHIJKLMNOPRSUVWXYZ" + "QTGABCDEFHIJKLMNOPRSUVWXYZ".toLowerCase();

        /**
         * Use toCharArray method
         */
        char[] encryptedCharArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            /**
             * Use indexOf method
             */
            int index = LETTERS.indexOf(encryptedCharArray[i]);

            // index == -1 when the character wasn't found in the string
            if (index != -1) {
                encryptedCharArray[i] = CIPHERS.charAt(index);
            }
        }
        System.out.println(encryptedCharArray);
    }

    public static void main(String[] args) {
        encrypt(getInput());
    }
}
