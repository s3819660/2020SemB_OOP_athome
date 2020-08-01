package Model;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Item implements Serializable {
    protected String type;
    protected String title;
    protected String publication;
    protected String year;
    protected String language;
    protected String subject;
    protected int total;
    protected int onLoan = 0;

    public Item() { }

    public Item(String type, String title, String publication, String year, String language, String subject, int total) {
        this.type = type;
        this.title = title;
        this.publication = publication;
        this.year = year;
        this.language = language;
        this.subject = subject;
        this.total = total;
        this.onLoan = onLoan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(int onLoan) {
        this.onLoan = onLoan;
    }

    public static String[] inputItem() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[5];
        String[] prompts = {"title: ","publication: ", "year: ", "language: ", "subject: "};
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + prompts[i]);
            inputs[i] = scanner.nextLine();
        }
        return inputs;
    }
}
