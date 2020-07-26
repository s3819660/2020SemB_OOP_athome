package assignment1_example;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            try {
                System.out.printf("1. Load contacts from text file\n");
                System.out.printf("2. View all contacts\n");
                System.out.printf("7. Sort contact list\n");
                System.out.printf("9. Quit\n");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        contactManager.loadContactFromFile();
                        break;
                    case 2:
                        contactManager.displayContacts();
                        break;
                    case 7:
                        contactManager.sort();
                        break;
                    case 9:
                        return;
                }
            } catch (Exception exception) {
                System.out.println("Error: " + exception.getMessage());
                exception.printStackTrace();
            }
        } while (true);
    }
}
