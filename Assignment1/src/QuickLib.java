import Model.*;

import java.util.Scanner;

public class QuickLib {
    public Book addBook() {
        Scanner scanner = new Scanner(System.in);
        int total;
        String authors;
        String edition;
        String ISBN;
        String[] itemField = Item.inputItem();

        System.out.println("Enter total amount of copies: ");
        total = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter authors: ");
        authors = scanner.nextLine();

        System.out.println("Enter edition: ");
        edition = scanner.nextLine();

        System.out.println("Enter ISBN: ");
        ISBN = scanner.nextLine();

        Book newBook = new Book("Book", itemField[0], itemField[1], itemField[2], itemField[3], itemField[4],
                total, authors, edition, ISBN);
        return newBook;
    }

    public Journal addJournal() {
        Scanner scanner = new Scanner(System.in);
        int total;
        String ISSN;
        String[] itemField = Item.inputItem();

        System.out.println("Enter total amount of copies: ");
        total = scanner.nextInt();

        System.out.println("Enter ISSN: ");
        ISSN = scanner.nextLine();

        Journal newJournal = new Journal("Journal", itemField[0], itemField[1], itemField[2], itemField[3],
                itemField[4], total, ISSN);
        return newJournal;
    }

    public DVD addDVD() {
        Scanner scanner = new Scanner(System.in);
        int total;
        String authors;
        String[] itemField = Item.inputItem();

        System.out.println("Enter total amount of copies: ");
        total = scanner.nextInt();

        System.out.println("Enter authors: ");
        authors = scanner.nextLine();

        DVD newDVD = new DVD("DVD", itemField[0], itemField[1], itemField[2], itemField[3], itemField[4], total,
                authors);
        return newDVD;
    }

    public static void start() {
        ItemList.loadItem();
        MemberList.loadMember();
    }

    public static void save() {
        ItemList.saveItem();
        MemberList.saveMember();
    }
}
