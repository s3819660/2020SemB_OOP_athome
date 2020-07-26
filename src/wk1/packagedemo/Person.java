package wk1.packagedemo;

import java.util.Scanner;

public class Person {
    // attributes
    private String name;
    private int age;

    // method
    public void walk() {

    }
    // constructor
    public Person() { }

    public Person(int age) {
        this.age = age;
    }

    // get only
    public int getAge() {
        return age;
    }

     // get + set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
