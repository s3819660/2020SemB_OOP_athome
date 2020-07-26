import java.util.Scanner;

public class Q8_Zellerscongruence {
    public static void main(String[] args) {
        System.out.print("Enter year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int century;
        if (year <= 100 && year > 0) {
            century = 1;
        }
        else if (year % 100 == 0)
            century = year / 100;
        else
            century = (year / 100) + 1;
        int year_of_the_century = year % 100;
        System.out.println("year_of_the_century =" + year_of_the_century);
        System.out.print("Enter month: ");
        int monthinput = input.nextInt();
        int month;
        switch (monthinput) {
            case 1:
                month = 13;
                year--;
                break;
            case 2:
                month = 14;
                year--;
                break;
            default:
                month = monthinput;
        }
        System.out.println("monthinput = " + monthinput
                            + "\n" + "month = " + month);
        System.out.print("Enter date: ");
        int date = input.nextInt();
        int dayinput = (date + 26 * (month + 1) / 10 + year_of_the_century + year_of_the_century / 4 + century / 4
                        + 5 * century) % 7;
        String day = "day of the week";
        switch (dayinput) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }
        System.out.println(day);
    }
}
