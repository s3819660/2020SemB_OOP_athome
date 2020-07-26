package wk1.packagedemo;
import wk1.packagedemo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonInput {

    public static void main(String[] args) {

        // get 3 persons from console, and put into array persons
        // input a name for each Person
        Person[] persons = new Person[3];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            String name = scanner.next();
            // input attribute name using constructors
//             persons[i] = new Person(name);

            // input attribute name using get + set
            persons[i] = new Person();
            persons[i].setName(name);
        }

        // index based
        for(int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }

        // range base
        for(Person p : persons) {
            System.out.println(p.getName());
        }
    }
}
