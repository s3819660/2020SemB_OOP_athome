package wk4.ContactManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    ArrayList<Contact> contacts = new ArrayList<>();

    ContactList() {

    }

    public static boolean loadContact(String fileName) {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                System.out.println(str);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void viewContacts() {

    }
/*
    public boolean addContact() {

    }

    public boolean editContact(int id) {

    }

    public boolean deleteContact(int id) {

    }

    public ArrayList<Contact> search(String str) {

    }

    public ArrayList<Contact> sort(String field) {

    }

    public boolean saveContact(String fileName) {

    }
 */
}
