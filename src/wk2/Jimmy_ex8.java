package wk2;

import java.util.Scanner;

public class Jimmy_ex8 {
    public static void main(String[] args) {
        String original = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        String new_string = "QTGABCDEFHIJKLMNOPRSUVWXYZ" + "QTGABCDEFHIJKLMNOPRSUVWXYZ".toLowerCase()  ;

        System.out.println("Enter the lines of words to cipher :");
        Scanner in = new Scanner(System.in);
        String hello = in.nextLine();
        StringBuffer conversion = new StringBuffer() ;

        for (int i = 0 ; i < hello.length() ; i ++) {
            if (!Character.isLetter(hello.charAt(i))) {
                conversion.append(hello.charAt(i));
            } else {
                conversion.append(new_string.charAt(original.indexOf(hello.charAt(i))));
//                for (int j = 0; j < original.length(); j++) {
//
//                    if (hello.charAt(i) == original.charAt(j)) {
//                        conversion.append(new_string.charAt(j));
//                    }
//                }
            }
        }
        System.out.println(conversion);
    }
}
