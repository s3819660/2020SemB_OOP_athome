package wk2;

import javafx.css.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q7_Regex {

    static String getInput(String inputType) {

        switch (inputType) {
            case "username":
                System.out.println("RMIT student usernames? ");
                break;
            case "email":
                System.out.println("RMIT Vietnam and Melbourne student email addresses?");
                break;
            case "IPv4":
                System.out.println("IPv4 addresses?");
                break;
        }

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void isValidUsername(String input) {
        String username = "^(s|S)\\d{7}";
        Pattern pattern = Pattern.compile(username);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find())
            System.out.println("Username is valid");
        else
            System.out.println("Username is not valid");

    }

    static void isValidEmail(String input) {
        String email = "^(s|S)\\d{7}@rmit.edu.(vn|au)$";
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find() == true)
            System.out.println("Email is valid");
        else
            System.out.println("Email is not valid");
    }

    static void isValidIPv4(String input) {
        String ipv4 = "^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$";
        Pattern pattern = Pattern.compile(ipv4);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find())
            System.out.println("IP is valid");
        else
            System.out.println("IP is not valid");

    }

    public static void main(String[] args) {
        isValidUsername(getInput("username"));
        isValidEmail(getInput("email"));
        isValidIPv4(getInput("IPv4"));
    }
}
