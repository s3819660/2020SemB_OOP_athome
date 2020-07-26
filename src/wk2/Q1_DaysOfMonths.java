package wk2;

import java.util.Scanner;

public class Q1_DaysOfMonths {

    static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year;
        String month;

        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        System.out.print("Enter a month: ");
        month = scanner.next();

        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.println("31 days");
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.println("30 days");
                break;
            case "Feb":
                if (isLeapYear(year))
                    System.out.println("29 days");
                else
                    System.out.println("28 days");
        }
    }
}
