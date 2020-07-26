package wk1.packagedemo;
import java.util.Scanner;

public class PersonStudentTeacher_demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Init age using constructors
        int age = scanner.nextInt();
        Person p = new Person(age);
        System.out.println(p.getAge());

        // Modify names outside of private class
        // using get + set
        String name = scanner.next();
        p.setName(name);
        System.out.println(p.getName());

//        wk1.packagedemo.Student p1 = new wk1.packagedemo.Student();
//        packagedemo.Teacher p2 = new packagedemo.Teacher();
    }
}
