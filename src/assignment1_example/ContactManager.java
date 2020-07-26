package assignment1_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactManager {

    /**
     * list of contacts
     */
    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    /**
     * load contact from file
     */

    public void loadContactFromFile() throws IOException {  // this method can have an error
        contacts.clear(); // to clear all contacts (to not append) after reloading them

        List<String> lines = Files.readAllLines(Paths.get("contacts.txt")); // get input from file line by line

        for(String line : lines) {
            String[] fields = line.split(";");   // when there is a ";"
                                                        // split input into an array of Strings

            String name = fields[0].trim(); // trim white spaces at the beginning and the end of String
            String phone = fields[1].trim();
            String email = fields[2].trim();
            String address = fields[3].trim();

            if (!verifyContactEmail(email)) {   // is verifyContactEmail == false
                System.out.println("invalid email " + email);
                continue;
            }

            if(!verifyContactPhone(phone)) {    // is verifyContactPhone == false
                System.out.println("invalid phone " + phone);
                continue;
            }

            contacts.add(new Contact(name, phone, email, address)); // add new contact information into ArrayList
        }
    }

    private boolean verifyContactPhone(String phone) {

        // verifying phone number using regular expression
        String regex = "\\d{10,11}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        return matcher.find(); // matcher.find() returns TRUE/FALSE
    }

    /**
     * display contacts
     */
    public void displayContacts() {
        for(Contact c : contacts) {
            System.out.println(c);
        }
    }

    /**
     * verify email
     * @param email
     * @return true if email is a valid email syntax, otherwise return false
     */
    public boolean verifyContactEmail(String email) {

       // verifying email using regular expression
        String regex = "\\S+@\\S+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.find();  // matcher.find() returns TRUE/FALSE
    }

    public void sort() {

        /**
         * lambda expression to sort
         */

        contacts.sort(new Comparator<Contact>() {
            @Override
            public int compare(Contact contact1, Contact contact2) {
                return contact1.getName().compareTo(contact2.getName());
            }
        });

        contacts.sort(new ContactNameComparator());
        contacts.sort(new ContactEmailComparator());

        contacts.sort((contact, t1) -> contact.getName().compareTo(t1.getName()));
    }
}

class ContactNameComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact contact1, Contact contact2) {
        return contact1.getName().compareTo(contact2.getName());
    }
}

class ContactEmailComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact contact1, Contact contact2) {
        return contact1.getEmail().compareTo(contact2.getEmail());
    }
}