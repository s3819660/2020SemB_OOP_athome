package wk1.solution;

import java.util.Scanner;

public class samplesolution {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            System.out.print("What program do you want to run? ");
            choice = scanner.nextInt();
            switch (choice) {
                case 3:
                    convertCeltoFah();
                    break;
                case 4:
                    sumOfDigits();
                    break;
                case 5:
                    monthlySaving();
                    break;
                default:
                    break;
            }
        } while (1 <= choice && choice <= 9);
        System.out.println("Goodbye. See you again!");
    }

    public static void printMenu() {
        System.out.println("**************** MENU *****************");
        System.out.println("    1: Hello World");
        System.out.println("    2: Java");
        System.out.println("    3: Celsius to Fahrenheit");
        System.out.println("    4: Sum of Digits");
        System.out.println("    5: Annual Saving");
        System.out.println("    6: Ascending Order");
        System.out.println("    7: Divisible by 5 and 6");
        System.out.println("    8: Day of the Week");
        System.out.println("    9: Circle Overlap");
        System.out.println("Other: Exit");
        System.out.println("***************************************");
    }

    public static void monthlySaving(){
        int saving;
        double balance = 0;
        System.out.print("Enter the monthly saving amount: ");
        saving = scanner.nextInt();
        System.out.println("Month\tBalance");
        for (int i = 1; i <= 12; i++) {
            balance = (saving + balance) * (1 + 0.00417);
            System.out.println(i + "\t\t$" + String.format("%.3f", balance));
        }
    }

    public static void convertCeltoFah() {
        System.out.print("Enter Celsius degree: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("The equivalence in Fahrenheit degree is " + fahrenheit);
    }

    public static void sumOfDigits() {
        int num;
        do {
            System.out.print("Enter a positive integer: ");
            num = scanner.nextInt();
        } while (num < 0);

        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of digits is " + sum);

    }
}
